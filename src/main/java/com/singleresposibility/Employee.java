package com.singleresposibility;

public
class Employee {
    private String name;
    private String id;
    private String address;
    private String contactNumber;
    private String employeeType;

    public void save() {
        new EmployeeRepository().save(this);
    }

}
