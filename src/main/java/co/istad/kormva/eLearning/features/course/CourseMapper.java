package co.istad.kormva.eLearning.features.course;

import co.istad.kormva.eLearning.features.course.dto.CourseResponse;
import co.istad.kormva.eLearning.features.course.dto.CreateCourseRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    Course mapCreateCourseRequestToCourse(CreateCourseRequest createCourseRequest);

    CourseResponse mapCourseToCourseResponse(Course course);

}
