package com.LLpeno.service;

import com.LLpeno.DTO.SetmealDto;
import com.LLpeno.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */

public interface ISetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    void saveWithDish(SetmealDto setmealDto);
}
