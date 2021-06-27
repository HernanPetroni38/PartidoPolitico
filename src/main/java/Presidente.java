/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Presidente extends Politico implements Elegir_comunero{

    public Presidente(int dni, String Nombre) {
        super(dni, Nombre);
    }
    int max =0;
    String candelec=" ";
    public String elegir_candidato (Candidato [] arraycandidatos){

        for (int i=0; i<=arraycandidatos.length-1;i++){
                    
            if (arraycandidatos[i].idcandidato>max){
                max=arraycandidatos[i].idcandidato;
                candelec=arraycandidatos[i].Nombre;
            }
            
        }
        return ("El candidato será: " + candelec);
    }

    @Override
    public void caminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void votar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void elegir_comunero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
