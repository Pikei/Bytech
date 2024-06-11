import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-ssd',
  templateUrl: './add-ssd.component.html',
  styleUrls: ['./add-ssd.component.css']
})
export class AddSsdComponent {

  @Output() formSubmit = new EventEmitter<any>();

  ssdItem = {
    format: '',
    interfaceType: '',
    capacity: 0,
    readSpeed: 0,
    writeSpeed: 0
  };

  onSubmit(): void {
    this.formSubmit.emit(this.ssdItem);
  }
}
