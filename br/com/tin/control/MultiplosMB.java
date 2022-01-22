package br.com.tin.control;


import br.com.tin.model.Multiplos;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "multiplosMB")
@ViewScoped
public class MultiplosMB implements Serializable {

    private Multiplos multiplos = new Multiplos();

    
    public Multiplos getMultiplos() {
        return multiplos;
    }

    public void setMultiplos(Multiplos multiplos) {
        this.multiplos = multiplos;
    }

   
    

    public int calculoMultiplos() throws SQLException {
        
    int x = multiplos.getMultiplo();
    int somax = 0;
    int res;
    

        
        
        for (int i = 1; i <= 10; i++) {

           if (i % x == 0) {

            somax = somax + i;
           
           }

    }

     
  res  = somax;
 
  multiplos.setSoma(res);
  
       return res; 

    }
    
    public void novoCalculo(){
   
       multiplos.setMultiplo(0);
       multiplos.setSoma(0);
   
   }
       
   }



