package com.LLpeno.service;

import com.LLpeno.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */

public interface ICategoryService extends IService<Category> {
    void remove(Long id);
}
