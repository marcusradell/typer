package net.radell.typer.model;

import lombok.Getter;

import java.util.UUID;

public class Attempts {

    private final char letter;
    @Getter
    private final UUID id;

    public Attempts(char letter, UUID id) {
        this.letter = letter;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Attempts{" +
                "letter=" + letter +
                ", id=" + id +
                '}';
    }
}
