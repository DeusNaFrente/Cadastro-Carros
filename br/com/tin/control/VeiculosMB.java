package br.com.tin.control;

import br.com.tin.dao.VeiculosDao;
import br.com.tin.model.Veiculos;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;

@ManagedBean(name = "veiculosMB") //nomeando o meu Bean
@ViewScoped //anotação JSF, eu uso para que o objeto permanece menos tempo na memória.
public class VeiculosMB implements Serializable {

    private List<Veiculos> listaVeiculos;
    private Veiculos veiculos = new Veiculos();
    private int etapa = 0; //utilizo esta váriavel para controlar o que vai aparecer na tela
    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    //este método eu uso para buscar os dados na tabela.
    //cada vez que manipulo um registro ele atualiza a tela.
    public void refresh() { 
        setListaVeiculos(new VeiculosDao().getAll(Veiculos.class));
    }

    public List<Veiculos> getListaVeiculos() {
        if (listaVeiculos == null) {
            refresh();
        }
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculos> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public Veiculos getVeiculos() {

        return veiculos;
    }

    public void setVeiculos(Veiculos veiculos) {
        this.veiculos = veiculos;
    }

    //abaixo estão os métodos que utilizei para manipular os registros.
    
    public void novo() {
        setVeiculos(new Veiculos());
        etapa = 1;
    }

    public void salvar() {
        if (getVeiculos() == null) {
            return;
        }
        if (getVeiculos().getMarca() == null) {
            PrimeFaces.current().dialog().showMessageDynamic(new FacesMessage(FacesMessage.SEVERITY_INFO, "Dados inválidos!", "O registro de nome marca é obrigatório"));
            return;
        }

        if (getVeiculos().getVeiculo() == null) {
            PrimeFaces.current().dialog().showMessageDynamic(new FacesMessage(FacesMessage.SEVERITY_INFO, "Dados inválidos!", "O campo de nome veículo é obrigatório"));
            return;
        }
        
        if (getVeiculos().getAno() == 0) {
            PrimeFaces.current().dialog().showMessageDynamic(new FacesMessage(FacesMessage.SEVERITY_INFO, "Dados inválidos!", "O campo de nome ano é obrigatório"));
            return;
        }
        
        

        new VeiculosDao().save(getVeiculos());
        refresh();
        setEtapa(0);
        novo();
    }

    public void editar() {
        setEtapa(1);
    }

    public void excluir() {
        if (getVeiculos() == null) {
            return;
        }
        if (getVeiculos().getId() == 0) {
            return;
        }
        new VeiculosDao().delete(Veiculos.class, getVeiculos().getId());
        refresh();
        setEtapa(0);
        novo();
    }
}
