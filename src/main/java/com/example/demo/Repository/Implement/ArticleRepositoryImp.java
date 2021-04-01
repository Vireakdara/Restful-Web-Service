package com.example.demo.Repository.Implement;

import com.example.demo.Model.Article;
import com.example.demo.Repository.ArticleRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepositoryImp implements ArticleRepository {
    List<Article> articles = new ArrayList<>();
    {
        articles.add(new Article(1, "Harry Potter", "It's amazing", "Fiction"));
        articles.add(new Article(2, "Harry Potter2", "It's amazing2", "Fiction2"));
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public void delete(int id) {
    articles.remove(id-1);
    }

    @Override
    public void update(int id, Article article) {
        Article article1 = articles.get(id-1);
        article1.setId(article.getId());
        article1.setName(article.getName());
        article1.setDescription(article.getDescription());
        article1.setCategory(article.getCategory());
        articles.add(article1);
    }

    @Override
    public void insert(Article article) {
        articles.add(article);
    }

}
