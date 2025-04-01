package net.radell.typer.attempt.controller;

import net.radell.typer.attempt.service.AttemptsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("attempts")
public class AttemptsController {
    private final AttemptsService attemptsService;

    public AttemptsController(AttemptsService attemptsService) {
        this.attemptsService = attemptsService;
    }

    @PostMapping
    public ResponseEntity<UUID> createAttempt(@RequestBody char letter) {
        return ResponseEntity.ok(attemptsService.create(letter));
    }

}
