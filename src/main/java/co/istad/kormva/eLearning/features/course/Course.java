package co.istad.kormva.eLearning.features.course;


import co.istad.kormva.eLearning.config.auditing.BasedEntity;
import co.istad.kormva.eLearning.features.category.Category;
import co.istad.kormva.eLearning.features.enrollment.Enrollment;
import co.istad.kormva.eLearning.features.instructor.InstructorProfile;
import co.istad.kormva.eLearning.features.video.Video;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course extends BasedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String slug;
    private String keyword;
    private String title;
    private String description;
    private String thumbnail;
    private Float starRating;
    private Integer countRating;
    private Float totalHours;
    private String level;
    private BigDecimal price;
    private Float discountPercent;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<Video> video;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructorProfile;

    private Boolean isPublished;
    private Boolean isDeleted;
}
