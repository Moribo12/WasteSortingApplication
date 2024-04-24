package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Service.Implementation;

import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Request.GuidelineRequestDto;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Entity.DisposalGuideline;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Entity.WasteCategory;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Repository.DisposalGuidelineRepo;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Repository.WasteCategoryRepo;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Service.Interface.DisposalGuidelineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DisposalGuidelineImpl implements DisposalGuidelineService {

    private final DisposalGuidelineRepo disposalGuidelineRepo;
    private final WasteCategoryRepo wasteCategoryRepo;

    @Override
    public DisposalGuideline createGuideline(GuidelineRequestDto guidelineRequestDto) {
        // Retrieve the WasteCategory from the database based on the categoryId
        Optional<WasteCategory> optionalCategory = wasteCategoryRepo.findById(guidelineRequestDto.getCategoryId());

        if (optionalCategory.isPresent()) {
            WasteCategory category = optionalCategory.get();

            // Create a new DisposalGuideline entity and associate it with the retrieved WasteCategory
            DisposalGuideline guideline = DisposalGuideline.builder()
                    .guideline(guidelineRequestDto.getGuideline())
                    .category(category)
                    .build();

            return disposalGuidelineRepo.save(guideline);
        } else {
            throw new IllegalArgumentException("Category not found for ID: " + guidelineRequestDto.getCategoryId());
        }
    }

    @Override
    public List<DisposalGuideline> getAllGuidelines() {
        return disposalGuidelineRepo.findAll();
    }


    @Override
    public List<DisposalGuideline> getAllGuidelineByName(String categoryName) {
        // Retrieve the WasteCategory by name
        Optional<WasteCategory> optionalWasteCategory = wasteCategoryRepo.findByCategoryName(categoryName);

        if (optionalWasteCategory.isPresent()) {
            WasteCategory wasteCategory = optionalWasteCategory.get();

            // Retrieve the disposal guidelines associated with the WasteCategory
            return disposalGuidelineRepo.findByCategoryName(categoryName);
        } else {
            // Handle case where WasteCategory with the given name does not exist
            throw new IllegalArgumentException("Waste category with name '" + categoryName + "' not found.");
        }
    }
}
