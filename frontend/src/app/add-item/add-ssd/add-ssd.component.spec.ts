import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddSsdComponent } from './add-ssd.component';

describe('AddSsdComponent', () => {
  let component: AddSsdComponent;
  let fixture: ComponentFixture<AddSsdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddSsdComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddSsdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
