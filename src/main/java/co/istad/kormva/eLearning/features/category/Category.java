package co.istad.kormva.eLearning.features.category;


import co.istad.kormva.eLearning.config.auditing.BasedEntity;
import co.istad.kormva.eLearning.features.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")

public class Category extends BasedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50,nullable = false,unique = true)

    private String name;
    private String Icon;

    @Column(nullable = false)
    private Boolean isDeleted;
    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
