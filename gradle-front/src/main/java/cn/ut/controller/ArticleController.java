package cn.ut.controller;

import cn.ut.domain.entity.GradleArticle;
import cn.ut.service.GradleArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author PuTongjiao
 * @date 2022/8/20 1:07
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @Resource
    private GradleArticleService articleService;

    @GetMapping("hotArticleList")
    public List<GradleArticle> hotArticleList() {
        List<GradleArticle> articles = articleService.hotArticleList();
        return articles;
    }
}
