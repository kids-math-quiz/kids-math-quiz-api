package com.kidsmathquiz.kidsmathquizapi.controller;

import com.kidsmathquiz.kidsmathquizapi.dto.request.SignUpRequest;
import com.kidsmathquiz.kidsmathquizapi.entities.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class TeacherController {
    //private final AuthenticationService authenticationService;

    //void teacherSignUp(String name, String email, String password, Date birthday);

    @PostMapping("/signup")
    public ResponseEntity<Teacher> teacherSignUp(@RequestBody SignUpRequest request) {
        return null;
    }

    @GetMapping("/signup")
    public ResponseEntity<Teacher> getAllTeacher() { return null; }

    @GetMapping("/signup/{id}")
    public ResponseEntity<Teacher> getOneSignup() {return null;}

    @PutMapping("/signup/{id}")
    public ResponseEntity<Teacher> updateSingup() {return null;}

    @DeleteMapping("/signup/{id}")
    public ResponseEntity<Teacher> deleteSignup() {return null;}

}