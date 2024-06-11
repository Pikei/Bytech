import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-cpu',
  templateUrl: './add-cpu.component.html',
  styleUrl: './add-cpu.component.css'
})
export class AddCpuComponent {
  @Output() formSubmit = new EventEmitter<any>();

  cpuItem = {
    line: '',
    model: '',
    cores: null,
    socket: '',
    frequency: null,
    maxFrequency: null,
    TDP: null
  };

  onSubmit(): void {
    this.formSubmit.emit(this.cpuItem);
  }
}
