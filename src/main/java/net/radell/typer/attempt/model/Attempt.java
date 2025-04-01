package net.radell.typer.attempt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Attempt {

    private char letter;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public Attempt(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "letter=" + letter +
                ", id=" + id +
                '}';
    }
}
