package moja.refrigerator.aggregate.board;


import jakarta.persistence.*;
import lombok.Data;
import moja.refrigerator.aggregate.user.User;

@Entity
@Table(name = "tbl_recipe")
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private long recipeId;

    @Column(name = "recipe_name")
    private String recipeName;

    @Column(name = "recipe_alt_ingredient")
    private String recipeAltIngredient;

    @Column(name = "recipe_cooking_time")
    private int recipeCookingTime;

    @Column(name = "recipe_create_time")
    private String recipeCreateTime;

    @Column(name = "recipe_update_time")
    private String recipeUpdateTime;

    @Column(name = "recipe_difficulty")
    private String recipeDifficulty;

    @Column(name = "recipe_views")
    private String recipeViews;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "recipe_category_id")
    @ManyToOne
    private RecipeCategory recipeCategory;
}
