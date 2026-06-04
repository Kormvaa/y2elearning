package co.istad.kormva.eleaning.dto.request;

import jakarta.validation.constraints.Size;

public record UpdateCategoryRequest(
        @Size(max = 50,message = "Name must not exceed 50 characters")
        String name,
        String icon
) {
}
