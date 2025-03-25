package net.radell.typer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("attempts")
public class AttemptsController {

    @PostMapping
    public ResponseEntity<UUID> createAttempt(@RequestBody char letter) {
        System.out.println("letter = " + letter);
        return ResponseEntity.ok(UUID.randomUUID());
    }

}
