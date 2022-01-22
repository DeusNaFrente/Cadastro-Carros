package br.com.tin.model;

import java.io.Serializable;

public class Votos implements Serializable{

  

        int totalEleitores = 1000;
        int validos = 800;
        int votosBrancos = 150;
        int votosNulos = 50;
        int pvalido = 0;
        int pbrancos = 0;
        int pnulos = 0;
        
    public int getTotalEleitores() {
        return totalEleitores;
    }

    public void setTotalEleitores(int totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public int getValidos() {
        return validos;
    }
 

    public void setValidos(int validos) {
        this.validos = validos;
    }

    public int getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(int votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    
 public int getPvalido() {
        
        return (getValidos() * 100) / getTotalEleitores() ;
    }

    public int getPbrancos() {
        return (getVotosBrancos() * 100) / getTotalEleitores() ;
    }

    public void setPbrancos(int pbrancos) {
        this.pbrancos = pbrancos;
    }

    public int getPnulos() {
        return (getVotosNulos() * 100) / getTotalEleitores() ;
    }

    public void setPnulos(int pnulos) {
        this.pnulos = pnulos;
    }

   

    

}
