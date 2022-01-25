package com.dceta.fop;

import com.dceta.fop.model.Salary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SalaryRepository extends CrudRepository<Salary, Long> {}
