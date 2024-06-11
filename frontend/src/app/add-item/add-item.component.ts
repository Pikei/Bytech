import { Component } from '@angular/core';

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.css']
})
export class AddItemComponent {
  item = {
    name: '',
    producer: '',
    category: '',
    description: '',
    price: 0
  };

  onSubmit(formData: any) {
    const combinedData = { ...this.item, ...formData };

    let endpoint = 'http://localhost:8080/products/add/';
    switch (this.item.category) {
      case 'pc-case':
        endpoint += 'case';
        break;
      case 'cpu':
        endpoint += 'cpu';
        break;
      case 'cpu-cooler':
        endpoint += 'cooler';
        break;
      case 'graphics-card':
        endpoint += 'gpu';
        break;
      case 'hdd':
        endpoint += 'hdd';
        break;
      case 'motherboard':
        endpoint += 'motherboard';
        break;
      case 'power-supply':
        endpoint += 'power-supply';
        break;
      case 'ram':
        endpoint += 'ram';
        break;
      case 'ssd':
        endpoint += 'ssd';
        break;
      default:
        return;
    }

    // Wyślij dane
    fetch(endpoint, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(combinedData)
    })
    .then(response => response.json())
    .then(data => console.log('Success:', data))
    .catch(error => console.error('Error:', error));
  }
}
