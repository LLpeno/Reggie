package com.LLpeno.common;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */

/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户的ID
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
