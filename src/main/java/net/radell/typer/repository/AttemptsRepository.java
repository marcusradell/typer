package net.radell.typer.repository;

import net.radell.typer.model.Attempt;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface AttemptsRepository extends ListCrudRepository<Attempt, UUID> {
}
