import { inject, TestBed } from '@angular/core/testing';

import { PersonaEditService } from './persona-edit.service';

describe('PersonaEditService', () => {

  beforeEach((() => {
    TestBed.configureTestingModule({
      providers: [ PersonaEditService ]
    })
  }));

  it('should create', inject([PersonaEditService], (service: PersonaEditService)  => {
    expect(service).toBeTruthy();
  }));
});
