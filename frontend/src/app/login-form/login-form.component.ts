import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'login-form',
  templateUrl: './login-form.component.html',
  styleUrl: './login-form.component.css'
})
export class LoginFormComponent implements OnInit {

  constructor(private http: HttpClient) { }
  ngOnInit(): void {
    const btn = document.querySelector('#login-btn');
    if (!btn) return
    const username = document.querySelector('#username') as HTMLInputElement;
    const password = document.querySelector('#password') as HTMLInputElement;

    btn.addEventListener('click', () => this.send(username.value, password.value));
  }

  async send(username: string, password: string) {
    const dataToSend = {
      username: username,
      password: password
    }

    console.log(dataToSend)

    const apiUrl = "http://localhost:8080/auth/login"
    const headers = { 'Content-Type': 'application/json'}

    const response = await fetch(apiUrl, {
      method: 'POST',
      headers: headers,
      body: JSON.stringify(dataToSend),
    });
    let data = await response.json();
    console.log(data);


    // console.log(username.value, password.value

    



    // this.http.post(apiUrl, JSON.stringify(datatoSend), {headers: headers});

    // this.http.post(apiUrl, datatoSend, {headers: headers }).subscribe(data => {
    //   console.log(data)})
    
    

    // const response = await fetch(apiUrl, {
    //     method: 'POST',
    //     headers: headers,
    //     body: JSON.stringify(datatoSend),
    //   });
    
    // let data = await response.json();
    // console.log(data);
  
  }


}
