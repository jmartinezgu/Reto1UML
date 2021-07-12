/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Veronica
 */
public class PersonClass {
    private String nombre_persona;
    private String tipo_documento;
    private int numero_documento;
    private char genero;
    private Date fecha_nacimiento;
    private float peso;
    private float estatura;
    private String departamento_nacimiento;
    private String municipio_nacimiento;
    private String direccin;
    private int telefono_contacto;
    private String estado_civil;
    private boolean discapacidad;
    private boolean estudia;
    private int cantidad_hijos;

    //Metodo constructor

    public PersonClass(String nombre_persona, String tipo_documento, int numero_documento, char genero, float peso, float estatura, String departamento_nacimiento, String municipio_nacimiento, String direccin, int telefono_contacto, String estado_civil, boolean discapacidad, boolean estudia, int cantidad_hijos) {
        this.nombre_persona = nombre_persona;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
        this.departamento_nacimiento = departamento_nacimiento;
        this.municipio_nacimiento = municipio_nacimiento;
        this.direccin = direccin;
        this.telefono_contacto = telefono_contacto;
        this.estado_civil = estado_civil;
        this.discapacidad = discapacidad;
        this.estudia = estudia;
        this.cantidad_hijos = cantidad_hijos;
    }  
    
    
    public void ejercicio(){
        System.out.println("La persona " + this.nombre_persona + " esta haciendo ejercio");
    }
    public void comer(){
        System.out.println("La persona " + this.nombre_persona + " esta comiendo");
    }
    public void dormir(){
        System.out.println("La persona " + this.nombre_persona + " esta durmiendo");
    }
    public void trabajar(){
        System.out.println("La persona " + this.nombre_persona + " esta trabajando");
    }
    public void estudiar(){
        System.out.println("La persona " + this.nombre_persona + " esta estudiando");
    }
    public void cepillarse(){
        System.out.println("La persona " + this.nombre_persona + " esta cepillandose los dientes");
    }
    public void banarse(){
        System.out.println("La persona " + this.nombre_persona + " esta bañandose");
    }
    
    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getDepartamento_nacimiento() {
        return departamento_nacimiento;
    }

    public void setDepartamento_nacimiento(String departamento_nacimiento) {
        this.departamento_nacimiento = departamento_nacimiento;
    }

    public String getMunicipio_nacimiento() {
        return municipio_nacimiento;
    }

    public void setMunicipio_nacimiento(String municipio_nacimiento) {
        this.municipio_nacimiento = municipio_nacimiento;
    }

    public String getDireccin() {
        return direccin;
    }

    public void setDireccin(String direccin) {
        this.direccin = direccin;
    }

    public int getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(int telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public boolean isEstudia() {
        return estudia;
    }

    public void setEstudia(boolean estudia) {
        this.estudia = estudia;
    }

    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }
    public String mostrar_informacion_persona(){
        return ">> Nombre de la persona: " + getNombre_persona()+ "\n>> Tipo de documento: " + getTipo_documento() + "\n>> Numero de documento: " + getNumero_documento()+ "\n>> Genero: " + getGenero()+ "\n>> Peso: " + getPeso() + "\n>> Estatura: " + getEstatura()+ "\n>> Departamento de nacimiento: " + getDepartamento_nacimiento()+ "\n>> Municipio de Manizales: " + getMunicipio_nacimiento()+ "\n>> Dirección: " + getDireccin()+ "\n>> Telefono de contacto: " + getTelefono_contacto()+"\n>> Estado civil: " + getEstado_civil()+ "\n>> Presenta discapacidad: " + isDiscapacidad()+ "\n>> Estudia actualmente: " + isEstudia();
    }      
}
