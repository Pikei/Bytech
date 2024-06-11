import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-ram',
  templateUrl: './add-ram.component.html',
  styleUrls: ['./add-ram.component.css']
})
export class AddRamComponent {

  @Output() formSubmit = new EventEmitter<any>();

  ramItem = {
    capacity: '',
    type: '',
    frequency: 0,
    voltage: 0,
    delay: '',
    numberOfModules: 1
  };

  onSubmit(): void {
    this.formSubmit.emit(this.ramItem);
  }
}
