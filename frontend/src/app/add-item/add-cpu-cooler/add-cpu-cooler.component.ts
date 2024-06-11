import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-cpu-cooler',
  templateUrl: './add-cpu-cooler.component.html',
  styleUrl: './add-cpu-cooler.component.css'
})
export class AddCpuCoolerComponent {

  checkedSocket: { [key: string]: boolean } = {};

  constructor() {
      this.cpuSockets.forEach(socket => {
          this.checkedSocket[socket] = false;
      });
  }

  @Output() formSubmit = new EventEmitter<any>();

  cpuSockets: string[] = ["1150", "1151", "1155", "1156", "1200", "1700", "2011", "2011-3", "2066", "FM1","FM2+", "AM2+", "AM3+", "AM4", "AM5"];

  coolerItem = {
    fanSpeed: '',
    fanDiameter: 0,
    fans: 0,
    height: 0,
    width: 0,
    depth: 0,
    rgb: false,
    cpuSockets: []
  };

  onSubmit(): void {
    this.formSubmit.emit(this.coolerItem);
  }
}
