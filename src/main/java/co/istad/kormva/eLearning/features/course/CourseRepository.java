package co.istad.kormva.eLearning.features.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    boolean existsBySlug(String slug);

    // Use named query
    List<Course> allCourses();

    Course byId(Integer id);

}