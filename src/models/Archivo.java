/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author sebax
 */
public class Archivo {
    private int ID;
    private String Codigo;
    private String nombre;
    private String actividad;
    private String responsable;
    private String uso;
    public static ArrayList<Archivo> archivos = new ArrayList<>();
    
    public Archivo(int ID, String Codigo, String nombre, String actividad, String responsable, String uso){
        this.ID = ID;
        this.Codigo = Codigo;
        this.actividad = actividad;
        this.nombre = nombre;
        this.responsable =  responsable;
        this.uso = uso;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    public static void llenarArchivos(){
           insertarArchivos(1,"FAB-000","FAB-000 FABRICACIÓN","Proceso general de fabricación de nuevos productos","GERENCIA, PRODUCCIÓN, COMPRAS, CALIDAD","planificadores");
           insertarArchivos(2,"FAB-001","FAB-001 Órdenes de producción Plan Anual","SubProceso de órdenes de producción del plan anual","FABRICACION","GERENCIA");
           insertarArchivos(3,"FAB-002","FAB-002 Órdenes de producción","SubProceso de lanzamiento de fabricación de nuevos productos","FABRICACION","PRODUCION");
           insertarArchivos(4,"FAB-002","FAB-003 Solicitud de Insumos","SubProceso de Solicitud de Insumos","FABRICACION","PRODUCION");
           insertarArchivos(5,"FAB-004","FAB-004 Autorización de Insumos","SubProceso de Autorización de Insumos para su compra","FABRICACION","PRODUCION");
           insertarArchivos(6,"FAB-005","FAB-005 Autorización de Insumos","SubProceso de Autorización de Insumos para su compra","FABRICACION","COMPRAS");
           insertarArchivos(7,"FAB-006","FAB-005 Control de Calidad","SubProceso de Autorización de Insumos para su compra","FABRICACION","CALIDAD");
    }      
    public static void insertarArchivos(int ID, String Codigo, String nombre, String actividad, String responsable, String uso){
        archivos.add(new Archivo(ID,Codigo,nombre,actividad,responsable,uso));
    }
    public static void eliminarArchivos(int posicion){
        archivos.remove(posicion);
    }
    public static void ActualizarElemento(int recNo, int ID, String Codigo, String nombre, String actividad, String responsable, String uso){
        archivos.get(recNo).setID(ID);
        archivos.get(recNo).setCodigo(Codigo);
        archivos.get(recNo).setActividad(actividad);
        archivos.get(recNo).setNombre(nombre);
        archivos.get(recNo).setResponsable(responsable);
        archivos.get(recNo).setUso(uso);
    }
   
}
