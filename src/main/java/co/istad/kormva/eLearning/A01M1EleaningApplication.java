package co.istad.kormva.eLearning;

import co.istad.kormva.eLearning.features.course.Course;
import co.istad.kormva.eLearning.features.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class A01M1EleaningApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(A01M1EleaningApplication.class, args);
    }


    private CourseRepository courseRepository;

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public void run(String... args) {
        List<Course> courses = courseRepository.allCourses();
//        Course course = courseRepository.byId(2);
//        System.out.println(;
        courses.forEach(course -> IO.println(course.getTitle()));

    }
}
