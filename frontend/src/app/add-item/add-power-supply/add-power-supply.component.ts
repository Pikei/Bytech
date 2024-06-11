import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-power-supply',
  templateUrl: './add-power-supply.component.html',
  styleUrls: ['./add-power-supply.component.css']
})
export class AddPowerSupplyComponent {

  @Output() formSubmit = new EventEmitter<any>();

  powerSupplyItem = {
    certification: '',
    efficiency: '',
    power: 0,
    modularity: '',
    standard: '',
    fanDiameter: 0,
    height: 0,
    width: 0,
    depth: 0
  };

  onSubmit(): void {
    this.formSubmit.emit(this.powerSupplyItem);
  }
}
