package moja.refrigerator.repo.board;

import moja.refrigerator.aggregate.board.RecipeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeCategoryRepository extends JpaRepository<RecipeCategory, Integer> {
}
