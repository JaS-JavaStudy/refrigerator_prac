package moja.refrigerator.service.board;

import moja.refrigerator.aggregate.board.RecipeCategory;
import moja.refrigerator.dto.board.RegistRecipeCategoryDTO;
import moja.refrigerator.dto.board.RequestRegistCategoryDTO;
import moja.refrigerator.dto.board.ResponseRecipeCategoryListDTO;
import moja.refrigerator.repo.board.RecipeCategoryRepository;
import moja.refrigerator.repo.board.RecipeRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeServiceImpl implements RecipeService{

    private ModelMapper mapper;
    private RecipeRepository recipeRepository;
    private RecipeCategoryRepository recipeCategoryRepository;

    @Autowired
    public RecipeServiceImpl(ModelMapper mapper,
                             RecipeRepository recipeRepository,
                             RecipeCategoryRepository recipeCategoryRepository) {
        this.mapper = mapper;
        this.recipeRepository = recipeRepository;
        this.recipeCategoryRepository = recipeCategoryRepository;
    }

    @Override
    public RegistRecipeCategoryDTO registRecipeCategory(RequestRegistCategoryDTO requestCategory) {

        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        RecipeCategory recipeCategory = mapper.map(requestCategory, RecipeCategory.class);

        recipeCategoryRepository.save(recipeCategory);

        return mapper.map(recipeCategory, RegistRecipeCategoryDTO.class);
    }

    @Override
    public List<ResponseRecipeCategoryListDTO> findCategoryList() {
        List<RecipeCategory> recipeCategoryList = recipeCategoryRepository.findAll();


        return recipeCategoryList.stream().map(recipeCategory -> mapper
                .map(recipeCategory, ResponseRecipeCategoryListDTO.class))
                .collect(Collectors.toList());
    }
}
