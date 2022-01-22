package br.com.tin.control;


import br.com.tin.model.Votos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "votosMB")
@ViewScoped
public class VotosMB implements Serializable {

    private List<Votos> listaVotos = new ArrayList<>();
    private Votos votos = new Votos();

    public List<Votos> getListaVotos() {

        listaVotos.add(votos); 

        return listaVotos;
    }

    public void setListaVotos(List<Votos> listaVotos) {
        this.listaVotos = listaVotos;
    }

    public Votos getVotos() {
        return votos;
    }

    public void setVotos(Votos votos) {
        this.votos = votos;
    }

}
