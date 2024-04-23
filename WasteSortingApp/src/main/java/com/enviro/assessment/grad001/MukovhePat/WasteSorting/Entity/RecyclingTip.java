package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="RecycleTips")
public class RecyclingTip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tip;
}
