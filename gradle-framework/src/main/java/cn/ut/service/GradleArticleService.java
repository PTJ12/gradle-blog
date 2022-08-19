package cn.ut.service;

import cn.ut.domain.entity.GradleArticle;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 文章表(GradleArticle)表服务接口
 *
 * @author makejava
 * @since 2022-08-20 01:06:07
 */
public interface GradleArticleService extends IService<GradleArticle> {

    public List<GradleArticle> hotArticleList();
}

