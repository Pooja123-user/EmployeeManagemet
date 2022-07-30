package com.Employee.Exception;

@SuppressWarnings("serial")
public class EmployeealeadyExistException  extends RuntimeException {
	 
private String message;

public EmployeealeadyExistException() {}

public EmployeealeadyExistException(String msg)
{
    super(msg);
    this.message = msg;
}
}