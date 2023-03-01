package com.br.springstart.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c1 {
    @GetMapping("/home")
   public ResponseEntity<String> get() {
        return ResponseEntity.ok("home");
   }
}
