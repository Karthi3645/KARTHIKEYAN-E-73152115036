import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EmpoyeeService {
  url:string;
  // employeeArr:Employee[];
  // employee : Employee;

  constructor(private http:HttpClient) {
    this.url="http://localhost:3004/empoloyee";
    // this.employee=new Employee();
    // this.employeeArr=[];

   }
  insertEmployee(employee:Employee)
  {

   this.http.post<Employee>(this.url,employee).subscribe();
   return "Employee Details Added";
  }
}
