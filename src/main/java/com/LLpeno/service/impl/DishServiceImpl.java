package com.LLpeno.service.impl;

import com.LLpeno.entity.Dish;
import com.LLpeno.mapper.DishMapper;
import com.LLpeno.service.IDishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements IDishService {
}
