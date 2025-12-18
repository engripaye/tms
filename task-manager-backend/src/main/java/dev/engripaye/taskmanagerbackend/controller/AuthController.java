package dev.engripaye.taskmanagerbackend.controller;


import dev.engripaye.taskmanagerbackend.dtos.AuthResponse;
import dev.engripaye.taskmanagerbackend.dtos.LoginRequest;
import dev.engripaye.taskmanagerbackend.dtos.RegisterRequest;
import dev.engripaye.taskmanagerbackend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")  //for frontend purpose
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // REGISTER
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request){
        userService.register(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("User registered successfully");
    }

    // LOGIN
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        AuthResponse authResponse = userService.login(request);
        return ResponseEntity.ok(authResponse);
    }

}
