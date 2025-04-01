package net.radell.typer.attempt.service;

import net.radell.typer.attempt.model.Attempt;
import net.radell.typer.attempt.repository.AttemptsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AttemptsService {
    private final AttemptsRepository attemptsRepository;

    public AttemptsService(AttemptsRepository attemptsRepository) {
        this.attemptsRepository = attemptsRepository;
    }

    public UUID create(char letter) {
        var attempt = new Attempt(letter);
        return attemptsRepository.save(attempt).getId();
    }
}
