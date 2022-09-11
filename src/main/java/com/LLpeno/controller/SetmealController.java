package com.LLpeno.controller;

import com.LLpeno.DTO.SetmealDto;
import com.LLpeno.common.R;
import com.LLpeno.service.ISetmealDishService;
import com.LLpeno.service.ISetmealService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LLPeno
 * @date 2022年09月11日
 */

@RestController
@RequestMapping("/setmeal")
public class SetmealController {
    @Resource
    private ISetmealService setmealService;
    @Resource
    private ISetmealDishService setmealDishService;

    @PostMapping
    public R<String> save(@RequestBody SetmealDto setmealDto){
        setmealService.saveWithDish(setmealDto);
        return R.success("新增套餐成功");
    }
}
