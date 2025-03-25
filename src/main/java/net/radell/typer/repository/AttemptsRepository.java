package net.radell.typer.repository;

import net.radell.typer.model.Attempts;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AttemptsRepository {

    private Attempts attempts;

    public UUID create(char letter) {
        attempts = new Attempts(letter, UUID.randomUUID());
        System.out.println("attempts = " + attempts.toString());
        return attempts.getId();
    }

}
