package br.com.tin.control;

import br.com.tin.model.BbSort;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "bbsMB")
@ViewScoped
public class BbSortMB implements Serializable{
    
    private BbSort bbsort = new BbSort();

    public BbSort getBbsort() {
        return bbsort;
    }

    public void setBbsort(BbSort bbsort) {
        this.bbsort = bbsort;
    }
    
    
    
   public void organizaVetor() throws SQLException {
     
    
    int [] vetor = {5,3,2,4,7,1,0,6};
    int organizar = 0;
    int i = 0;
            
        System.out.println("Desordenado");
        for (i = 0; i < 8; i++) {//percorrendo todo array
            System.out.println("" +vetor[i]);//imprimindo desordenado
           
           }
       System.out.println("");//um pequeno espaço
       
       for(i = 0; i < 8; i++){
            for(int x = 0; x < 7; x++){
              if(vetor[x] > vetor[x + 1]){
                organizar = vetor[x];
                vetor[x] = vetor[x+1];
                vetor[x+1] = organizar;
                
                }
            }
       }
           System.out.println("Organizado");
           for(i = 0; i < 8; i++){
               System.out.println(""+vetor[i]);
               bbsort.setVorganizado(bbsort.getVorganizado() + "" +vetor[i]);
           }
           
       
       
    
   }
   
   
}
     

