package org.vijaycode.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", allocationSize = 103, initialValue = 100, sequenceName = "employee_seq_name")

   /* @GeneratedValue(strategy = GenerationType.AUTO)*/

   /* @GeneratedValue(strategy = GenerationType.IDENTITY)*/




    private Integer empId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String department;
    private Double salary;
    private String email;
    private Long contact;

}
