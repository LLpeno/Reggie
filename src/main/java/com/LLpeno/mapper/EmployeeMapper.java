package com.LLpeno.mapper;

import com.LLpeno.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LLPeno
 * @date 2022年08月26日
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
