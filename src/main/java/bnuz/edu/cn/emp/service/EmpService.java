package bnuz.edu.cn.emp.service;


import bnuz.edu.cn.emp.entity.Dept;
import bnuz.edu.cn.emp.entity.Emp;
import bnuz.edu.cn.emp.vo.EmpQuery;

import java.util.List;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/12
 * ~~(^_^)~~
 */

public interface EmpService {
    List<Emp> getEmplist(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);

    List<Dept> getAllDept();

    void deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}
