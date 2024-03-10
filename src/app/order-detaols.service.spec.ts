import { TestBed } from '@angular/core/testing';

import { OrderDetaolsService } from './order-detaols.service';

describe('OrderDetaolsService', () => {
  let service: OrderDetaolsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OrderDetaolsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
