package com.example.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.example.pojo.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.util.List;

@RestController
public class MyController {
    @Value("${file-path}")
    private String filePath;
    @GetMapping("/students")
    public List<Student> sayHello() throws Exception {
        return ExcelImportUtil.importExcel(new FileInputStream(filePath),Student.class,new ImportParams());
    }
}
