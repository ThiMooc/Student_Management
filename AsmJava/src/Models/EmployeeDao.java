/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Untils.FileUtil;
import itf.ItfEmployee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEGION
 */
public class EmployeeDao implements ItfEmployee{

    public static List<Employee> ls = new ArrayList<>();
    public int save(ItfEmployee e) {
        return save(e);
    }

    public int save(Employee ee) {
        int pos = findById(ee.getId());
        if (pos < 0) {
            ls.add((Employee) ee);
        } else {
            ls.set(pos, (Employee) ee);
        }
        return 1;
    }

    @Override
    public int del(String id) {
        int pos = findById(id); 
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }

    @Override
    public int findById(String id) {
        int position = -1;
        for (int i = 0; i < ls.size(); i ++) {
           if (ls.get(i).getId().equals(id)){
               position = i;
               break;
           }
        }
        return position;
    }

    @Override
    public Employee getEmployeePossition(int index) {
        if (index >=0 && index < ls.size()) {
            return ls.get (index);
        }
        return null;
    }

    @Override
    public List<Employee> openFile() {
       ls.add(new Employee("DB12", "Dinh Ba Thi", 20, "IT"));
       ls.add(new Employee("DB12", "Dinh Ba Thi", 20, "IT"));
        try{
        ls.clear();
        ls = FileUtil.readFile();
        }catch (Exception e){
            System.out.println("Error"+e.toString());
        }
        return ls;
    }

    @Override
    public void saveFile(){
    try{
        FileUtil.writeFile(ls);
    } catch (Exception e) {
        System.out.println("Error"+e.toString());
    }
    }

    @Override
    public List<Employee> getAlls() {
        return ls;
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int count() {
        return ls.size();
}

 
}

    



   

    


    

