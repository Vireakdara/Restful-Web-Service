package com.example.demo.Repository;

import com.example.demo.Model.Article;

import java.util.List;

public interface ArticleRepository {
    List<Article> findAll();
    void delete(int id);
    void update(int id, Article article);
    void insert(Article article);
}
