package com.dceta.fop;

import com.dceta.fop.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    SalaryRepository repo;

    @GetMapping("/salary")
    public Iterable<Salary> getSalaries() {
        return repo.findAll();
    }

}
