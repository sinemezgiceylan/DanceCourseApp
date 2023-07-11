package service;

import model.Sex;
import model.Student;

import java.math.BigDecimal;
import java.util.Date;

public class StudentService {
    /*
    private String name;
    private int age;
    private Sex sex;
    private boolean isPaid = Boolean.FALSE;
    private BigDecimal contractAmount;
    private Date startDate;
    private Date endDate;
     */

    public Student createStudent(String name, int age, Sex sex, boolean isPaid,
                                 BigDecimal contractAmount, Date startDate, Date endDate) {

        Student student = new Student();

        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setPaid(isPaid);
        student.setContractAmount(contractAmount);
        student.setStartDate(startDate);
        student.setEndDate(endDate);

        return student;
    }
}
