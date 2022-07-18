package com.kkar.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.kkar.demo.model.EmployeeVO;

public class EmployeeDB {
	 
    public static List<EmployeeVO> getEmployeeList()
    {
        List<EmployeeVO> list = new ArrayList<>();
 
        EmployeeVO empOne = new EmployeeVO(1, "a", "a", "a@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2, "b", "b", "b@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3, "c", "c", "c@gmail.com");
 
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
 
        return list;
    }
}
