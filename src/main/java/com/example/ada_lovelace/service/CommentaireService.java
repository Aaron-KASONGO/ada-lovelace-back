package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.CommentaireRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentaireService {
    private final CommentaireRepository commentaireRepository;

    public CommentaireService(CommentaireRepository commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }

    public CommentaireRepository getCommentaireRepository() {
        return commentaireRepository;
    }
}
