package com.LLpeno.service;

import com.LLpeno.DTO.DishDto;
import com.LLpeno.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */

public interface IDishService extends IService<Dish> {
    // 新增菜品，同时添加口味数据
    void saveWithFlavor(DishDto dishDto );

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
