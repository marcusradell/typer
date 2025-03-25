package net.radell.typer.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AttemptsService {
    public UUID create(char letter) {
        return UUID.randomUUID();
    }
}
