package cn.ut.service.impl;

import cn.ut.domain.entity.GradleArticle;
import cn.ut.mapper.GradleArticleMapper;
import cn.ut.service.GradleArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章表(GradleArticle)表服务实现类
 *
 * @author makejava
 * @since 2022-08-20 01:06:07
 */
@Service("gradleArticleService")
public class GradleArticleServiceImpl extends ServiceImpl<GradleArticleMapper, GradleArticle> implements GradleArticleService {

    @Override
    public List<GradleArticle> hotArticleList() {
        List<GradleArticle> list = list();
        return list;
    }
}

