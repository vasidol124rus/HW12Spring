package com.example.demo.controller;


import com.example.demo.model.Note;
import com.example.demo.services.FileGateway;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notes")
public class NoteController {


    private final FileGateway fileGateway;

    @PostMapping()
    public ResponseEntity<Note> addNote(@RequestBody Note note){
        note.setCreation(LocalDateTime.now());
        fileGateway.writeToFile(note.getTitle() + " txt", note.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
