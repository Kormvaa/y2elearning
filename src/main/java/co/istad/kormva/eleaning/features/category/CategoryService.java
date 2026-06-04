package co.istad.kormva.eleaning.features.category;


import co.istad.kormva.eleaning.dto.request.CreateCategoryRequest;
import co.istad.kormva.eleaning.dto.request.UpdateCategoryRequest;
import co.istad.kormva.eleaning.dto.response.categoryresponse.CategoryResponse;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<CategoryResponse> getAllCategory(Integer page, Integer size);
    CategoryResponse getCategoryById(Integer id);
    CategoryResponse createCategory(CreateCategoryRequest request);
    CategoryResponse updateCategoryById(Integer id, UpdateCategoryRequest request);
    void deleteCategoryById(Integer id);
}
