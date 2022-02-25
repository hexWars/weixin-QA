package bnuz.edu.cn.emp.service.impl;

import bnuz.edu.cn.emp.entity.Dept;
import bnuz.edu.cn.emp.entity.Emp;
import bnuz.edu.cn.emp.mapper.DeptMapper;
import bnuz.edu.cn.emp.mapper.EmpMapper;
import bnuz.edu.cn.emp.service.EmpService;
import bnuz.edu.cn.emp.vo.EmpQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/12
 * ~~(^_^)~~
 */
@Service
@Slf4j
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Emp> getEmplist(EmpQuery param) {
        log.debug("进入查询");
        return empMapper.getEmpList(param);
    }

    @Override
    public Long countEmpList(EmpQuery param) {
        return empMapper.countEmpList(param);
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public void deleteEmpByIds(String ids) {
        empMapper.deleteEmpByIds(ids);
    }

    @Override
    public Emp getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }
}
