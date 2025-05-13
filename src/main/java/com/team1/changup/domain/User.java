package com.team1.changup.domain;

import com.team1.changup.domain.common.BaseEntity;
import com.team1.changup.domain.enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, length = 40)
    private String email;

    @Enumerated(EnumType.STRING)
    private Roles role;

    @Column(nullable = false, length = 40)
    private String password;

    private String idea;

    @OneToMany(mappedBy = "tech")
    private List<Tech> techList = new ArrayList<>();



}
