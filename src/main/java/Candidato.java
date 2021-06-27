/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Candidato extends Politico{
    
    int idcandidato;
    
    public Candidato(int dni, String Nombre, int idcandidato) {
        super(dni, Nombre);
        this.idcandidato=idcandidato;
    }

    public int getIdcandidato() {
        return idcandidato;
    }

    public void setIdcandidato(int idcandidato) {
        this.idcandidato = idcandidato;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    public boolean equals(Object obj){
        
        if (obj instanceof Candidato){
            Candidato otro = (Candidato)obj;
            if(this.dni==otro.dni){
                return true;
            }else {
                return false;
            }
            }
        else
            {return false;}      
    }
}
