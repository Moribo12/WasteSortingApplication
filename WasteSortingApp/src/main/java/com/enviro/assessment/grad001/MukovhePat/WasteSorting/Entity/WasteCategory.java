package com.enviro.assessment.grad001.MukovhePat.WasteSorting.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name="Categories")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class WasteCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String composition;
    private String health_Risks;

    // One category can have many guidelines
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<DisposalGuideline> guidelines;
}
