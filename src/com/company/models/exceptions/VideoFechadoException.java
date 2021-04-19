package com.company.models.exceptions;

public class VideoFechadoException extends Exception{
    public VideoFechadoException() {
        super("Video fechado! Ação impossível de ser realizada.");
    }
}
