package com.cola.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cola.entity.MPost;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cola.vo.PostVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cola
 * @since 2021-12-10
 */
public interface MPostService extends IService<MPost> {

    IPage<PostVo> paging(Page page, Long categoryId, Long userId, Integer level, Boolean recommend, String order);
}
