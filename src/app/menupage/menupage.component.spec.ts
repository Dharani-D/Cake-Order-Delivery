import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuPageComponent } from './menupage.component';

describe('MenupageComponent', () => {
  let component: MenuPageComponent;
  let fixture: ComponentFixture<MenuPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MenuPageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MenuPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
