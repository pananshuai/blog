package com.panshuai.service.impl;

import com.panshuai.entity.Blog;
import com.panshuai.mapper.BlogMapper;
import com.panshuai.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author panan
 * @since 2020-06-06
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
