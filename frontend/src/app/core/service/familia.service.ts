import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Familia, FamiliaCreate } from '../model/familia.model';

@Injectable({
  providedIn: 'root',
})
export class FamiliaService {
  constructor(private httpClient: HttpClient) {}

  async crearFamilia(familia: FamiliaCreate) {
    return await this.httpClient
      .post(`${environment.url_api}/familias`, familia)
      .toPromise();
  }

  async getFamilia(nombreFamilia:string){
    return await this.httpClient
      .get(`${environment.url_api}/familias/${nombreFamilia}/usuarios`)
      .toPromise()
  }

  async eliminarIntegrante(nombreFamilia:string,dni:string){
    return await this.httpClient
      .delete(`${environment.url_api}/familias/${nombreFamilia}/usuarios/${dni}`)
      .toPromise()
  }

  async actualizarFamiliar(nombreFamilia:string){
    return await this.httpClient
      .put(`${environment.url_api}/familias/${nombreFamilia}`,null)
      .toPromise
  }
}
