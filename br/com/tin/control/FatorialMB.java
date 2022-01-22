package br.com.tin.control;

import br.com.tin.model.Fatorial;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "fatorialMB")
@ViewScoped
public class FatorialMB implements Serializable {

    private Fatorial fatorial = new Fatorial();

   

    public Fatorial getFatorial() {
        return fatorial;
    }

    public void setFatorial(Fatorial fatorial) {
        this.fatorial = fatorial;
    }

    public int calculoFatorial() throws SQLException {

        int numero = fatorial.getFator();

        int fator = 1;
        for (int i=1 ;i <= numero; i++) {

            fator = fator * i;

        }
        
        fatorial.setResultado(fator);
        
        return fator;
        
    }

   public void novoCalculo(){
   
       fatorial.setFator(0);
       fatorial.setResultado(0);
   
   }

}
