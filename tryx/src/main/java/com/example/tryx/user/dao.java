package com.example.tryx.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class dao {
    private static List<Employee> users = new ArrayList<>();
    public static int count=3;
    static{
        users.add(new Employee(1,"Anitha","ank@gmail.com","tgt","99189"));
        users.add(new Employee(2,"nara","nara@gmail.com","var","8989"));

        users.add(new Employee(3,"percy","nara@gmail.com","var","1234"));

    }

    public List findAll(){
        return users;
    }

    public Employee findOne(int id){
        for(Employee emp : users){
            if(emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    public Employee save(Employee emp){
        if(emp.getId()==0){
            emp.setId(++count);
        }
        users.add(emp);
        return emp;
    }
}
