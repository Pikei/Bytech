import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-hdd',
  templateUrl: './add-hdd.component.html',
  styleUrl: './add-hdd.component.css'
})
export class AddHddComponent {

  @Output() formSubmit = new EventEmitter<any>();
  hddItem = {
    format: '',
    interfaceType: '',
    capacity: 0,
    rotationalSpeed: 0
  }



  onSubmit(): void {
    this.formSubmit.emit(this.hddItem);
  }

}
