package net.radell.typer.repository;

import net.radell.typer.model.Attempt;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AttemptsRepositoryOld {

    private Attempt attempt;

    public UUID create(char letter) {
        attempt = new Attempt(letter, UUID.randomUUID());
        System.out.println("attempt = " + attempt.toString());
        return attempt.getId();
    }

}
