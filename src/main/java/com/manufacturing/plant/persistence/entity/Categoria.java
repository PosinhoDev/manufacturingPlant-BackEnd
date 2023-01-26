package com.manufacturing.plant.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {
    /**
     * Table attribute declaration according to db
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "descipcion_categoria")
    private String descripcionCategoria;

    /**
     * Creation of relationships according to db
     * */
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productoList;

    /**
     * the constructor is generated
     * */
    public Categoria() {

    }

    public Categoria(Integer idCategoria, String descripcionCategoria, List<Producto> productos) {
        this.idCategoria = idCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.productoList = productos;
    }

    /**
     * Generete Getters and Setters
     * */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    /**
     *  Creation of getters and setters of relations between tables
     * */
    public List<Producto> getProductos() {
        return productoList;
    }

    public void setProductos(List<Producto> productos) {
        this.productoList = productos;
    }
}
