import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddGraphicsCardComponent } from './add-graphics-card.component';

describe('AddGraphicsCardComponent', () => {
  let component: AddGraphicsCardComponent;
  let fixture: ComponentFixture<AddGraphicsCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddGraphicsCardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddGraphicsCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
