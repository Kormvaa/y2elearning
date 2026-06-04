package co.istad.kormva.eleaning.mapping;


import co.istad.kormva.eleaning.dto.request.CategoryRequest;
import co.istad.kormva.eleaning.dto.request.CreateCategoryRequest;
import co.istad.kormva.eleaning.dto.response.categoryresponse.CategoryResponse;
import co.istad.kormva.eleaning.features.category.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public Category toEntity(CreateCategoryRequest request){
        Category category = new Category();
        category.setName(request.name());
        category.setIcon(request.icon());
        category.setIsDelete(false);
        return category;
    }
    public CategoryResponse toResponse(Category category){
        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getIcon()
        );
    }
    public void updateEntity(Category category, CategoryRequest request){
        category.setName(request.name());
        category.setIcon(request.icon());
    }
}
