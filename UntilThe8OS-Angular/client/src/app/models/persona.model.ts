import { Telefono } from './telefono.model';
import { Direccion } from './direccion.model';

export class Persona{
    id: number;
    nombre: string;
    apellido1: string;
    apellido2: string;
    dni: string;
    fechaNacimiento: Date;
    telefonos: Telefono[];
    direcciones: Direccion[];
}