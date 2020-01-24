package org.wcci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp() {
        underTest = new Employee("TESTNAME",100);
    }

    @Test
    public void shouldHaveName() {
        String result = underTest.getName();
        assertEquals("TESTNAME",result);
    }
    @Test
    public void shouldHaveAnotherName() {
        Employee underTest = new Employee("BOB",100);
        String result = underTest.getName();
        assertEquals("BOB",result);
    }
    @Test
    public void shouldHaveSalary(){
        int salary = underTest.getPayRate();
        assertEquals(100, salary);
    }
    @Test
    public void changePayRate(){
        underTest.changeSalary(110);
        int salary = underTest.getPayRate();
        assertEquals(110, salary);
    }
    @Test
    public void employeeShouldKnowIfTheyAreNotPaid(){
        boolean isPaid = underTest.getPayCheckAmount();
        assertFalse(isPaid);
    }
    @Test
    public void employeeShouldKnowIfTheyArePaid(){
        underTest.recievePay();
        boolean isPaid = underTest.getPayCheckAmount();
        assertTrue(isPaid);
    }
}
