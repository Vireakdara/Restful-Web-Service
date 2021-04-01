package com.example.demo.Service.Implement;

import com.example.demo.Model.Article;
import com.example.demo.Repository.ArticleRepository;
import com.example.demo.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImp implements ArticleService {

    ArticleRepository articleRepository;

    @Autowired
    public void setArticleRepository(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public void delete(int id) {
        articleRepository.delete(id);
    }

    @Override
    public void update(int id, Article article) {
        articleRepository.update(id,article);
    }

    @Override
    public void insert(Article article) {
        articleRepository.insert(article);
    }
}
