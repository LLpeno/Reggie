package com.LLpeno.common;

/**
 * @author LLPeno
 * @date 2022年09月06日
 */

/**
 * 自定义业务异常类
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
