package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateGuidelineRequestDto {
    private Long id;
    private String guideline;
}
