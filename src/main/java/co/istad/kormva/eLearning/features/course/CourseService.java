package co.istad.kormva.eLearning.features.course;

import co.istad.kormva.eLearning.features.course.dto.CourseResponse;
import co.istad.kormva.eLearning.features.course.dto.CreateCourseRequest;
import org.springframework.security.oauth2.jwt.Jwt;

public interface CourseService {

    // Create a new course
    CourseResponse createCourse(CreateCourseRequest createCourseRequest);


}
