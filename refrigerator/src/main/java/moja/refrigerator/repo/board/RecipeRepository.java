package moja.refrigerator.repo.board;

import moja.refrigerator.aggregate.board.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
