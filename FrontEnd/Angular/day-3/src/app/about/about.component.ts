import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
   fact:number;
   constructor(private cal:CalculatorService)

   {
         this.fact=cal.factorial(8); 
   }
}
