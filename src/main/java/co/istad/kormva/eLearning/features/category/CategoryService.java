package co.istad.kormva.eLearning.features.category;


import co.istad.kormva.eLearning.dto.request.CategoryRequest;
import co.istad.kormva.eLearning.dto.response.categoryresponse.CategoryResponse;
import org.springframework.data.domain.Page;

public interface CategoryService {

    /**
     * Create category based on category request
     */
    CategoryResponse createCategory(CategoryRequest categoryRequest);


    /**
     * Find categories from database by pagination
     */
    Page<CategoryResponse> findCategories(int pageNumber, int pageSize);


    /**
     * Find category by ID
     */
    CategoryResponse findCategoryById(Integer categoryId);


    /**
     * Update category by ID based on category request
     */
    CategoryResponse updateCategory(Integer id, CategoryRequest categoryRequest);


    /**
     * Delete category by ID
     */
    void deleteCategory(Integer categoryId);

}