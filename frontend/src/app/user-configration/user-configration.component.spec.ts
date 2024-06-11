import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserConfigrationComponent } from './user-configration.component';

describe('UserConfigrationComponent', () => {
  let component: UserConfigrationComponent;
  let fixture: ComponentFixture<UserConfigrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UserConfigrationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserConfigrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
