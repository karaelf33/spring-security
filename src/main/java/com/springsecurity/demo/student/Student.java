package com.springsecurity.demo.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private final Integer studentId;
    private final String studentName;
}
