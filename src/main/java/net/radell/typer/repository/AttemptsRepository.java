package net.radell.typer.repository;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AttemptsRepository {
    public UUID create(char letter) {
        return UUID.randomUUID();
    }
}
