package net.radell.typer.model;

import lombok.Getter;

import java.util.UUID;

public class Attempt {

    private final char letter;
    @Getter
    private final UUID id;

    public Attempt(char letter, UUID id) {
        this.letter = letter;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "letter=" + letter +
                ", id=" + id +
                '}';
    }
}
