package co.istad.kormva.eLearning.features.category;

import co.istad.kormva.eLearning.dto.request.CategoryRequest;
import co.istad.kormva.eLearning.dto.response.categoryresponse.CategoryResponse;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category categoryRequestToCategory (CategoryRequest categoryRequest);

    CategoryResponse categoryToCategoryResponse (Category category);
}