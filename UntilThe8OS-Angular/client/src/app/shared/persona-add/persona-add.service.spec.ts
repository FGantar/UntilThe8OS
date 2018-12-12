import { inject, TestBed } from '@angular/core/testing';

import { PersonaAddService } from './persona-add.service';

describe('PersonaAddService', () => {

  beforeEach((() => {
    TestBed.configureTestingModule({
      providers: [ PersonaAddService ]
    })
  }));

  it('should create', inject([PersonaAddService], (service: PersonaAddService)  => {
    expect(service).toBeTruthy();
  }));
});
