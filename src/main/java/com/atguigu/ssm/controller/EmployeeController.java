package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ��ѯ���е�Ա����Ϣ-->/employee-->get
 * ��ѯԱ���ķ�ҳ��Ϣ-->/employee/page/1-->get
 * ����id��ѯԱ����Ϣ-->/employee/1-->get
 * ��ת�����ҳ��-->/toAdd-->get
 * ���Ա����Ϣ-->/employee-->post
 * �޸�Ա����Ϣ-->/employee-->put
 * ɾ��Ա����Ϣ-->/employee/1-->delete
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum,Model model){

        //��ȡԱ���ķ�ҳ��Ϣ
        PageInfo<Employee> page=employeeService.getEmployeePage(pageNum);
        //����ҳ���ݹ�����������
        model.addAttribute("page",page);
        //��ת��employee_listҳ��
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //��ѯ���е�Ա����Ϣ
        List<Employee> list=employeeService.getAllEmployee();
        //��Ա����Ϣ���������й���
        model.addAttribute("list",list);
        //��ת��employee_list.html
        return "employee_list";
    }

    @RequestMapping(value = "/employee/{eid}",method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable("eid") Integer id,Model model){
        Employee employee=employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value ="/employee/{eid}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("eid") Integer id,String pageNum){
        employeeService.deleteEmployee(id);
        return "redirect:/employee/page/"+pageNum;
    }
}
