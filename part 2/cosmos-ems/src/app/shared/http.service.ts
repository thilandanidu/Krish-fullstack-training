import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Employee } from "../employees/Employees.model";

//this service is register with root.So any component can use this
@Injectable({
    providedIn: 'root'
})
export class HttpService {

    private employeeUrl: string= 'http://localhost:3000/employees'

    constructor(private http: HttpClient) {

    }



    getAllEmployees(): Observable<Employee[]> {

        return this.http.get<Employee[]>(this.employeeUrl)

    }

}
