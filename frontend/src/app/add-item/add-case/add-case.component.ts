import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-case',
  templateUrl: './add-case.component.html',
  styleUrls: ['./add-case.component.css']
})
export class AddPcCaseComponent {
  checkedCompatibilities: { [key: string]: boolean } = {};

  constructor() {
      this.compatibilities.forEach(compatibility => {
          this.checkedCompatibilities[compatibility] = false; // Ustawiamy początkowo na false
      });
  }


  @Output() formSubmit = new EventEmitter<any>();

  compatibilities: string[] = ["ATX", "e-ATX", "uATX", "Mini ITX"];

  caseItem = {
    caseType: '',
    maxLengthOfGpu: 0,
    maxHeightOfCpuCooler: 0,
    color: '',
    rgb: false,
    window: false,
    height: 0,
    width: 0,
    depth: 0,
    compatibilities: [],
    fans: 0,
    fansDiameter: 0,
    usbPorts: 0
  };

  onSubmit(): void {
    this.formSubmit.emit(this.caseItem);
  }
}
