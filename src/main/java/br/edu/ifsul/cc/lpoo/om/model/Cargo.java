
package br.edu.ifsul.cc.lpoo.om.model;

/**
 *
 * @author 20201PF.CC0114
 */
public class Cargo {
    
    private Integer id;
    private String descricao;
    
    public Cargo(){
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
