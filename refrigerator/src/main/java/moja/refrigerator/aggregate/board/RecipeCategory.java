package moja.refrigerator.aggregate.board;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_recipe_category")
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_category_id")
    public int recipeCategoryId;

    @Column(name = "recipe_category")
    public String recipeCategory;

}
