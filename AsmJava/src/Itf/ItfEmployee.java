/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itf;

import Models.Employee;
import java.util.List;

/**
 *
 * @author LEGION
 */
public interface ItfEmployee {
    int save(ItfEmployee e);
    int del(String id);
    int findById(String id);
    Employee getEmployeePossition(int index);
    List<Employee> openFile();
    void saveFile();
    List<Employee> getAlls();
    int count();

    public String getId();
}
