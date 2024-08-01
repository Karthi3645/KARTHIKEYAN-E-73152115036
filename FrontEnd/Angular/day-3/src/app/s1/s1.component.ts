import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-s1',
  templateUrl: './s1.component.html',
  styleUrl: './s1.component.css'
})
export class S1Component {
  sum : number;
  sub:number;
  constructor(private calc:CalculatorService)
  {
    this.sum=calc.getAddition(10,20);
    this.sub=calc.getSubtraction(90,20);
  }
  }
