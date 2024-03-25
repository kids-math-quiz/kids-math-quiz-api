package com.kidsmathquiz.kidsmathquizapi.controller;

import com.kidsmathquiz.kidsmathquizapi.dto.request.SignUpRequest;
import com.kidsmathquiz.kidsmathquizapi.entities.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class TeacherController {
    //private final AuthenticationService authenticationService;

    //void teacherSignUp(String name, String email, String password, Date birthday);

    @PostMapping("/signup")
    public ResponseEntity<Teacher> teacherSignUp(@RequestBody SignUpRequest request) {
        String name = request.getName();
        String email = request.getEmail();
        String password = request.getPassword();
        Date birthday = request.getBirthday();

        Teacher teacher = new Teacher();

        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }

}