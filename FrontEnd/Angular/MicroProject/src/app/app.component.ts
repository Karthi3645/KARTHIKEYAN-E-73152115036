import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // flag:boolean;
  // fla:boolean;
  // vehicle: string[];
  // selected:string;
  // Mystyle: {};
  // myClass : string;

//   constructor()
//   {
//     this.flag= true;
//     this.fla=true;
//     this.vehicle=["two wheeler","bus","car"];
//     this.selected="";
//     this.Mystyle={'width' : '40%' , 'border' : '2px solid pink' , 'border-radius' : '25px'};
//    this. myClass="myClass1";
//   }

//   changeflag()
//   {
//     this.flag = ! this.flag;
//   }
//   change()
//   {
//     this.fla =! this.fla;
//   }
//   setSelectedItem(a:string)
// {
// this.selected=a;
// }
// changestyle()
// {
//   this.Mystyle={'width' : '40%' , 'border' : '2px solid green' , 'border-radius' : '25px'};  
// }
// changecolor()
// {
//   this.myClass="myClass2"
// }
sum : number;
sub:number;
constructor(private calc : CalculatorService)
{
  this.sum=calc.getAddition(10,20);
  this.sub=calc.getSubtraction(90,20);
}
}
