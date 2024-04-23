package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Controller;

import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Request.GuidelineRequestDto;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Entity.DisposalGuideline;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Service.Interface.DisposalGuidelineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/guideline")
public class GuidelineController {

    private final DisposalGuidelineService disposalGuidelineService;

    @PostMapping
    public DisposalGuideline createGuideline(@RequestBody GuidelineRequestDto guidelineRequestDto){
        return this.disposalGuidelineService.createGuideline(guidelineRequestDto);
    }

    @GetMapping
    public List<DisposalGuideline> getAllGuidelines(){
        return disposalGuidelineService.getAllGuidelines();
    }

    @GetMapping("/{name}")
    public List<DisposalGuideline> getGuidelinesByName(@PathVariable String name){
        return disposalGuidelineService.getAllGuidelineByName(name);
    }
}
