import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddHddComponent } from './add-hdd.component';

describe('AddHddComponent', () => {
  let component: AddHddComponent;
  let fixture: ComponentFixture<AddHddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddHddComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddHddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
