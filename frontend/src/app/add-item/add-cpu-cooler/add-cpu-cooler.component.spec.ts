import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCpuCoolerComponent } from './add-cpu-cooler.component';

describe('AddCpuCoolerComponent', () => {
  let component: AddCpuCoolerComponent;
  let fixture: ComponentFixture<AddCpuCoolerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddCpuCoolerComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddCpuCoolerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
