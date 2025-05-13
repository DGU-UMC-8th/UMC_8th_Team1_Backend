package com.team1.changup.web.controller.teamController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/team")
public class TeamController {

    @PostMapping("/create")
    public ResponseEntity<String> signUpGeneral(@RequestBody @Valid MemberRequestDTO.JoinDTO dto) {
        Service.joinMember(dto);
        return ApiResponse.onSuccess(null);
    }

    @GetMapping("/get")
    public ApiResponse<MemberResponseDTO.LoginSuccessDTO> login(@RequestBody @Valid MemberRequestDTO.LoginDTO dto, HttpServletResponse response) {
        return ApiResponse.onSuccess(memberCommandService.login(dto, response));
    }
}
