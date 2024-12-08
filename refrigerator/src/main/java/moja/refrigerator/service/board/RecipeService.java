package moja.refrigerator.service.board;

import moja.refrigerator.dto.board.RegistRecipeCategoryDTO;
import moja.refrigerator.dto.board.RequestRegistCategoryDTO;
import moja.refrigerator.dto.board.ResponseRecipeCategoryListDTO;

import java.util.List;

public interface RecipeService {
    RegistRecipeCategoryDTO registRecipeCategory(RequestRegistCategoryDTO requestCategory);

    List<ResponseRecipeCategoryListDTO> findCategoryList();
}
