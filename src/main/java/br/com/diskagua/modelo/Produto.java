package br.com.diskagua.modelo;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Tardeli
 */
@Entity
@Table(name = "Produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XStreamAsAttribute
    private Long codigo;
    private String nome;
    private String descricao;
    //@NotNull(message = "Erro preco")
    @Column(scale = 7, precision = 2)
    private Double preco;
    @Transient
    private String caminho;

    public Produto() {
    }
    
    public Produto(Long codigo, String nome, String descricao, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
   
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    
    public String visualizar() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + '}';
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + '}';
    }
    
    
}
