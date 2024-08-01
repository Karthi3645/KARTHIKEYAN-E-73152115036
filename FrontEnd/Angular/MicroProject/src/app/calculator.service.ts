import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {

  getAddition(a: number,b:number){
    return a+b;
  }
  getSubtraction(a: number,b:number){
    return a-b;
  }
  factorial(a:number)
  {
      let v=1;
      for(let i=1;i<=a;i++)
      {
        v=v*i;
      }
      return v;
  }
}
