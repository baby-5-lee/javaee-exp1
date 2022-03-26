package com.example.pojo;

import java.io.Serializable;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;


@Data
@ExcelTarget("student")
public class Student implements Serializable {
    @Excel(name = "编号")
    private String id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "性别")
    private String gender;
    @Excel(name = "出生年月",format = "MMM-yy")
    private String birthDate;
    @Excel(name = "政治面貌")
    private String politicStatus;
    @Excel(name = "籍贯")
    private String birthPlace;
    @Excel(name = "所在公寓")
    private String address;
    @Excel(name = "入学成绩")
    private String entranceScores;
    @Excel(name = "平均成绩")
    private String averageScores;
    @Excel(name = "名次")
    private String rank;
    @Excel(name = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;
}