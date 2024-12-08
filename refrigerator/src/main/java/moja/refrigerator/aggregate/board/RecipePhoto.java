package moja.refrigerator.aggregate.board;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_recipe_photo")
@Data
public class RecipePhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_photo_id")
    private long recipePhotoId;

    @Column(name = "recipe_photo_url")
    private String recipePhotoUrl;

    @Column(name = "recipe_photo_create_time")
    private String recipePhotoCreateTime;
}
