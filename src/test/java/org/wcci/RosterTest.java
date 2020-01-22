package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RosterTest {

    private Roster underTest;
    private Employee testEmployee;

    @BeforeEach
    void setUp() {
        underTest = new Roster();
        testEmployee = new Employee("TestEmployee", 100);
        underTest.hire(testEmployee);
    }

    @Test
    public void shouldBeAbleToHire(){
        ArrayList<Employee> retrievedEmployees = underTest.retrieveEmployeeList();
        assertEquals(1, retrievedEmployees.size());
    }
    @Test
    public void shouldPayAllEmployeesOfARosterOfOne(){
        //Action
        underTest.payAllEmployees();
        //Assertion
        ArrayList<Employee> retrievedEmployees = underTest.retrieveEmployeeList();
        assertTrue(retrievedEmployees.get(0).getPaidStatus());
    }
    @Test
    public void shouldPayAllEmployeesOfARosterOfTwo(){
        Employee testEmployee2 = new Employee("TestEmployee2", 1000000);
        underTest.hire(testEmployee2);
        //Action
        underTest.payAllEmployees();
        //Assertion
        ArrayList<Employee> retrievedEmployees = underTest.retrieveEmployeeList();
        assertTrue(retrievedEmployees.get(0).getPaidStatus());
        assertTrue(retrievedEmployees.get(1).getPaidStatus());
    }
    @Test
    public void shouldChangeEmployeePayRateWithARosterOfTwo(){
        Employee testEmployee2 = new Employee("TestEmployee2", 1000000);
        underTest.hire(testEmployee2);
        //Action
        underTest.changeEmployeeSalary("TestEmployee", 110);
        //Assertion
        Employee retrievedEmployee = underTest.retrieveEmployee("TestEmployee");
        assertEquals(110, retrievedEmployee.getSalary());
    }
    @Test
    public void shouldAnotherChangeEmployeePayRateWithARosterOfTwo(){
        Employee testEmployee2 = new Employee("TestEmployee2", 1000000);
        underTest.hire(testEmployee2);
        //Action
        underTest.changeEmployeeSalary("TestEmployee2", 1100);
        //Assertion
        Employee retrievedEmployee = underTest.retrieveEmployee("TestEmployee2");
        assertEquals(1100, retrievedEmployee.getSalary());
    }
}
