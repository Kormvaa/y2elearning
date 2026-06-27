package co.istad.kormva.eLearning.features.comment;


import co.istad.kormva.eLearning.config.auditing.BasedEntity;
import co.istad.kormva.eLearning.features.video.Video;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "comments")

public class Comment extends BasedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private Boolean isDeleted;

    @ManyToOne
    private Video video;

}