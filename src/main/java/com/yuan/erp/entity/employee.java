package com.yuan.erp.entity;

import java.util.Date;

public class employee {
    private String employeeId;

    private String employeeName;

    private Integer employeeSex;

    private Date employeeBirthday;

    private String departmentName;

    private String departmentId;

    private String employeeIdcard;

    private String employeeTemployeenm;

    public employee(String employeeId, String employeeName, Integer employeeSex, Date employeeBirthday, String departmentName, String departmentId, String employeeIdcard, String employeeTemployeenm) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeBirthday = employeeBirthday;
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.employeeIdcard = employeeIdcard;
        this.employeeTemployeenm = employeeTemployeenm;
    }

    public employee() {
        super();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(Integer employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getEmployeeIdcard() {
        return employeeIdcard;
    }

    public void setEmployeeIdcard(String employeeIdcard) {
        this.employeeIdcard = employeeIdcard == null ? null : employeeIdcard.trim();
    }

    public String getEmployeeTemployeenm() {
        return employeeTemployeenm;
    }

    public void setEmployeeTemployeenm(String employeeTemployeenm) {
        this.employeeTemployeenm = employeeTemployeenm == null ? null : employeeTemployeenm.trim();
    }
}