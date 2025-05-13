package com.team1.changup.web.dto;

import lombok.Builder;

@Builder
public class TeamRequestDto {

    private String title;

    private String body;

    private String problem;

    private String target;

    private String schedule;

    private boolean access;

    private boolean state;
}
