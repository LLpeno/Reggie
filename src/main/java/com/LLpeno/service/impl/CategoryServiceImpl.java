package com.LLpeno.service.impl;

import com.LLpeno.common.CustomException;
import com.LLpeno.entity.Category;
import com.LLpeno.entity.Dish;
import com.LLpeno.entity.Setmeal;
import com.LLpeno.mapper.CategoryMapper;
import com.LLpeno.service.ICategoryService;
import com.LLpeno.service.IDishService;
import com.LLpeno.service.ISetmealService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Resource
    private IDishService dishService;
    @Resource
    private ISetmealService setmealService;

    /**
     * 根据id删除分类，删除之前需要进行判断
     * @param id
     */
    @Override
    public void remove(Long id) {
        // 查询当前分类是否已经关联了菜品，如果已经关联，抛出一个异常
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(dishLambdaQueryWrapper);
        if(count > 0){
            // 已经关联，抛出一个异常
            throw new CustomException("当前分类下有关联菜品，不能删除");
        }

        // 查询当前分类是否已经关联了菜品，如果已经关联，抛出一个异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count1 = setmealService.count(setmealLambdaQueryWrapper);
        if(count1 > 0){
            // 已经关联，抛出一个异常
            throw new CustomException("当前分类下有关联套餐，不能删除");
        }

        // 没有关联，正常删除
        super.removeById(id);
    }
}
