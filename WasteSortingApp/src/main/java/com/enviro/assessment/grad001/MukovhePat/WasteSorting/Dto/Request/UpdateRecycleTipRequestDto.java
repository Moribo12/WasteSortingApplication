package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRecycleTipRequestDto {
    private Long id;
    private String tip;
    private String author;
}
