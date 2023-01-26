package com.manufacturing.plant.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {
    /**
     * Table attribute declaration according to db
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private Integer idInventario;

    @Column(name = "id_producto")
    private Integer idProducto;

    private Integer cantidad;

    /**
     * Creation of relationships according to db
     * */
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto productoInv;

    /**
     * the constructor is generated
     * */
    public  Inventario(){

    }

    public Inventario(Integer idInventario, Integer idProducto, Integer cantidad, Producto productoInv) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.productoInv = productoInv;
    }

    /**
     * Generete Getters and Setters
     * */
    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *  Creation of getters and setters of relations between tables
     * */
    public Producto getProductoInv() {
        return productoInv;
    }

    public void setProductoInv(Producto productoInv) {
        this.productoInv = productoInv;
    }
}
