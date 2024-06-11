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

  onNext() {
    // Implementacja logiki "Next"
  }

  onSubmit(formData: any) {
    // Połącz wspólne dane z danymi specyficznymi
    const combinedData = { ...this.item, ...formData };

    // Wyślij dane do odpowiedniego endpointu API
    let endpoint = '';
    switch (this.item.category) {
      case 'pc-case':
        endpoint = 'http://localhost:8080/products/add/case';
        break;
      case 'cpu':
        endpoint = 'http://localhost:8080/products/add/cpu';
        break;
      case 'cpu-cooler':
        endpoint = 'http://localhost:8080/products/add/cooler';
        break;
      case 'graphics-card':
        endpoint = 'http://localhost:8080/products/add/graphics-card';
        break;
      case 'hdd':
        endpoint = 'http://localhost:8080/products/add/hdd';
        break;
      case 'motherboard':
        endpoint = 'http://localhost:8080/products/add/motherboard';
        break;
      case 'power-supply':
        endpoint = 'http://localhost:8080/products/add/power-supply';
        break;
      case 'ram':
        endpoint = 'http://localhost:8080/products/add/ram';
        break;
      case 'ssd':
        endpoint = 'http://localhost:8080/products/add/ssd';
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
