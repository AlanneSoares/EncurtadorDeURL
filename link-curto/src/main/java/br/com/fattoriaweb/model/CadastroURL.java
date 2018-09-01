package br.com.fattoriaweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class CadastroURL {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    private String url;
    private String linkCurto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLinkCurto() {
        return linkCurto;
    }

    public void setLinkCurto(String linkCurto) {
        this.linkCurto = linkCurto;
    }

    @Override
    public String toString() {
        return "CadastroURL{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                ", linkCurto='" + linkCurto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadastroURL that = (CadastroURL) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}