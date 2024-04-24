package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecycleTipRequestDto {
    private String tip;
    private String author;
}
