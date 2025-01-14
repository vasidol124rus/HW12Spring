package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Note {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime creation;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }
}