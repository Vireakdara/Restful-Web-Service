package com.example.demo.Service;

import com.example.demo.Model.Article;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();
    void delete(int id);
    void update(int id, Article article);
    void insert(Article article);
}
