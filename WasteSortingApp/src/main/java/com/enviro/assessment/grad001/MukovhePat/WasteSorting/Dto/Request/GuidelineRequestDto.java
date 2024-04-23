package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Request;

import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Entity.WasteCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuidelineRequestDto {
    private String guideline;
    private Long categoryId;
}
