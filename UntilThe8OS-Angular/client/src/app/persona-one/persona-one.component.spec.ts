import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonaOneComponent } from './persona-one.component';

describe('PersonaOneComponent', () => {
  let component: PersonaOneComponent;
  let fixture: ComponentFixture<PersonaOneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonaOneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonaOneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
