package net.radell.typer.service;

import net.radell.typer.repository.AttemptsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AttemptsService {
    private final AttemptsRepository attemptsRepository;

    public AttemptsService(AttemptsRepository attemptsRepository) {
        this.attemptsRepository = attemptsRepository;
    }

    public UUID create(char letter) {
        return attemptsRepository.create(letter);
    }
}
