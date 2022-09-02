package com.LLpeno.service.impl;

import com.LLpeno.entity.Employee;
import com.LLpeno.mapper.EmployeeMapper;
import com.LLpeno.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author LLPeno
 * @date 2022年08月26日
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
