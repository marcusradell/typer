package net.radell.typer.service;

import net.radell.typer.repository.AttemptsRepositoryOld;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AttemptsService {
    private final AttemptsRepositoryOld attemptsRepository;

    public AttemptsService(AttemptsRepositoryOld attemptsRepository) {
        this.attemptsRepository = attemptsRepository;
    }

    public UUID create(char letter) {
        return attemptsRepository.create(letter);
    }
}
