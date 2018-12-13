import { inject, TestBed } from '@angular/core/testing';

import { PersonaService } from 'src/app/shared/persona/persona.service';

describe('PersonaService', () => {

  beforeEach((() => {
    TestBed.configureTestingModule({
      providers: [ PersonaService ]
    })
  }));

  it('should create', inject([PersonaService], (service: PersonaService)  => {
    expect(service).toBeTruthy();
  }));
});
