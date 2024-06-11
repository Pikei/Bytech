import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-graphics-card',
  templateUrl: './add-graphics-card.component.html',
  styleUrl: './add-graphics-card.component.css'
})
export class AddGraphicsCardComponent {

  @Output() formSubmit = new EventEmitter<any>();
  
  graphicsCardItem = {
    chipsetProducer: '',
    chipsetType: '',
    memory: '',
    bus: '',
    cardLength: 0,
    recommendedPower: 0,
    coolingType: ''
  }

  onSubmit(): void {
    this.formSubmit.emit(this.graphicsCardItem);
  }

}
