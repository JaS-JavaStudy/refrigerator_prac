package moja.refrigerator.controller.board;

import moja.refrigerator.dto.board.RegistRecipeCategoryDTO;
import moja.refrigerator.dto.board.RequestRegistCategoryDTO;
import moja.refrigerator.dto.board.ResponseRecipeCategoryListDTO;
import moja.refrigerator.service.board.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class BoardController {
    private RecipeService recipeService;

    @Autowired
    public BoardController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/category/regist")
    public ResponseEntity<RegistRecipeCategoryDTO> registCategory(
            @RequestBody RequestRegistCategoryDTO requestCategory
    ) {
        RegistRecipeCategoryDTO responseRegistRecipeCategory = recipeService.registRecipeCategory(requestCategory);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseRegistRecipeCategory);
    }

    @GetMapping("/category")
    public ResponseEntity<List<ResponseRecipeCategoryListDTO>> findCategoryList() {
        List<ResponseRecipeCategoryListDTO> categoryList = recipeService.findCategoryList();

        return ResponseEntity.status(HttpStatus.OK).body(categoryList);
    }
}
