import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-motherboard',
  templateUrl: './add-motherboard.component.html',
  styleUrl: './add-motherboard.component.css'
})
export class AddMotherboardComponent {

  checkedFreaquency: { [key: string]: boolean } = {};

  supportedMemoryFrequencies: string[] = ["1866 MHz", "2133 MHz", "2400 MHz", "2667 MHz", "2800 MHz", 
    "2933 MHz", "3000 MHz", "3066 MHz", "3200 MHz", "3400 MHz", "3733 MHz", "3866 MHz", "4000 MHz", "4133 MHz",
    "4800 MHz", "5000 MHz", "5200 MHz", "5400 MHz", "5600 MHz", "5800 MHz", "6000 MHz"];

  constructor() {
      this.supportedMemoryFrequencies.forEach(freaquency => {
          this.checkedFreaquency[freaquency] = false;
      });
  }

  @Output() formSubmit = new EventEmitter<any>();

  motherboardItem = {
    chipset: '',
    socket: '',
    memoryStandard: '',
    memorySlots: 0,
    memoryMaxCapacity: 0,
    memoryType: '',
    supportedMemoryFrequencies: [],
    mbStandard: '',
    width: 0,
    depth: 0,
    wifi: false,
    bluetooth: false,
    audio: false,
    m2Slots: 0,
    sataPorts: 0,
    usbPorts: 0
  };


  onSubmit(): void {
    this.formSubmit.emit(this.motherboardItem);
  }
}
