package com.team1.changup.domain;

import com.team1.changup.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Team extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;


    @Column(nullable = false)
    private String problem;

    @Column(nullable = false)
    private String target;

    @Column(nullable = false)
    private String schedule;


    private boolean access;

    private boolean state;

    @OneToMany(mappedBy = "role")
    private List<Role> roleList = new ArrayList<>();


    @OneToMany(mappedBy = "tech")
    private List<Tech> techList = new ArrayList<>();

}
