package com.manufacturing.plant.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {
    /**
     * Table attribute declaration according to db
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "descripcion_estado")
    private String descripcionEstado;

    /**
     * Creation of relationships according to db
     * */
    @OneToMany(mappedBy = "estado")
    private List<Producto> productos;

    /**
     * the constructor is generated
     * */
    public Estado(){

    }

    public Estado(Integer idEstado, String descripcionEstado, List<Producto> productos) {
        this.idEstado = idEstado;
        this.descripcionEstado = descripcionEstado;
        this.productos = productos;
    }

    /**
     * Generete Getters and Setters
     * */
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    /**
     *  Creation of getters and setters of relations between tables
     * */
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
