import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KarthiComponent } from './karthi.component';

describe('KarthiComponent', () => {
  let component: KarthiComponent;
  let fixture: ComponentFixture<KarthiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [KarthiComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(KarthiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
