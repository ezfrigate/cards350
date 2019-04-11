import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SetAlliesComponent } from './set-allies.component';

describe('SetAlliesComponent', () => {
  let component: SetAlliesComponent;
  let fixture: ComponentFixture<SetAlliesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetAlliesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SetAlliesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
