package net.radell.typer.attempt.repository;

import net.radell.typer.attempt.model.Attempt;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface AttemptsRepository extends ListCrudRepository<Attempt, UUID> {
}
