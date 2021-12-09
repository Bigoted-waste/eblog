package com.cola.service.impl;

import com.cola.entity.MUser;
import com.cola.mapper.MUserMapper;
import com.cola.service.MUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cola
 * @since 2021-12-10
 */
@Service
public class MUserServiceImpl extends ServiceImpl<MUserMapper, MUser> implements MUserService {

}
