
package br.edu.ifsul.cc.lpoo.om.model;

import java.util.List;

/**
 *
 * @author 20201PF.CC0114
 */
public class Cliente extends Pessoa{
    
    private String observacoes;
    private List<Veiculo> veiculos;
    
    public Cliente(){
        
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the veiculos
     */
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    /**
     * @param veiculos the veiculos to set
     */
    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    
}
