import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmpoyeeService } from './empoyee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  employee : Employee;
  result : string;
  v:string;
  constructor(private service:EmpoyeeService)
  {
    this.employee = new Employee();
    this.result="";
    this.v="";
  }
  insertEmployee(data : any)
  {
    this.employee.id=data.empId;
    this.employee.empName=data.empName;
    this.employee.empSalary=data.empSalary;
    alert(data.empId+" "+data.empName+" "+data.empSalary);
    this.v=data.empId+" "+data.empName+" "+data.empSalary;
    // console.log(data.empId);
    this.result=this.service.insertEmployee(this.employee);
  }
}
