package com.example.catefixx

data class Employees(
    @Exclude var employeeID: String? = "",
    var employeeName: String? = "",
    var employeeEmail: String? = "",
    var employeeAge: String? = ""
)

annotation class Exclude
