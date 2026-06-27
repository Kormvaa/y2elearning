package co.istad.kormva.eLearning.dto.response.categoryresponse;

public record CategoryResponse(
        Integer id,
        String name,
        String icon,
        Boolean isDeleted
) {
}
