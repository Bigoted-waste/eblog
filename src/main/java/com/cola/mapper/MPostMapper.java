package com.cola.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cola.entity.MPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cola.vo.PostVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cola
 * @since 2021-12-10
 */
@Component
public interface MPostMapper extends BaseMapper<MPost> {

    IPage<PostVo> selectPosts(Page page,@Param(Constants.WRAPPER) QueryWrapper wrapper);
}
