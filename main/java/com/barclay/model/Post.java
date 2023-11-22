package com.barclay.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "post_seq")
    @SequenceGenerator(
            name = "post_seq",
            sequenceName = "post_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;
    private  String title;
    private  String text;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
}
