package com.cola.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cola.entity.MPost;
import com.cola.mapper.MPostMapper;
import com.cola.service.MPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cola.vo.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author cola
 * @since 2021-12-10
 */
@Service
public class MPostServiceImpl extends ServiceImpl<MPostMapper, MPost> implements MPostService {

    @Autowired
    MPostMapper postMapper;

    @Override
    public IPage<PostVo> paging(Page page, Long categoryId, Long userId, Integer level, Boolean recommend, String order) {

        if (level == null) {
            level = -1;
        }


        QueryWrapper wrapper = new QueryWrapper<MPost>()
                .eq(categoryId != null, "category_id", categoryId)
                .eq(userId != null, "user_id", userId)
                .eq(level == 0, "level", 0)
                .eq(level > 0, "level", 0)
                .orderByDesc(order!=null,order);


        return postMapper.selectPosts(page, wrapper);
    }
}
