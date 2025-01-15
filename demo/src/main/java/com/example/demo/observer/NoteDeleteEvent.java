package com.example.demo.observer;

import com.example.demo.model.Note;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

// Создание события - обновление заметки
@Getter
public class NoteDeleteEvent extends ApplicationEvent {

    private final Note note;

    public NoteDeleteEvent(Object source, Note note) {
        super(source);
        this.note= note;
    }

}