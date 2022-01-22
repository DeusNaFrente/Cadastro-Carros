package br.com.tin.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //informando que esta classe é um entidade
@Table(name = "veiculos", catalog = "milton") //especificando os detalhes da tabela
public class Veiculos implements Serializable {

    @Id //anotação para indicar a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //variáeis declaradas ---**
    private int id;

    private String veiculo;
    private String marca;
    private int ano;
    private String descricao;
    private String situacao;

    @Temporal(TemporalType.DATE)
    private Date dtcompra;

    @Temporal(TemporalType.DATE)
    private Date dtvenda;
    
    //final das variáveis **---
    
    //abaixo os getter e setter para cada variável ---**

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }

    public Date getDtvenda() {
        return dtvenda;
    }

    public void setDtvenda(Date dtvenda) {
        this.dtvenda = dtvenda;
    }

   //fim dos getter e setter *--- 
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    
    //sobrescrevendo métodos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculos other = (Veiculos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
