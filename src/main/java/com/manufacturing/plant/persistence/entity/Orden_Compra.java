package com.manufacturing.plant.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "orden_Compra")
public class Orden_Compra {

    /**
     * Table attribute declaration according to db
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Integer idOrden;

    private Integer cantidad;

    @Column(name = "id_producto")
    private Integer idProducto;

    /**
     * Creation of relationships according to db
     * */
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto productoOrd;

    /**
     * the constructor is generated
     * */
    public Orden_Compra () {

    }

    public Orden_Compra(Integer idOrden, Integer cantidad, Integer idProducto, Producto productoOrd) {
        this.idOrden = idOrden;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.productoOrd = productoOrd;
    }

    /**
     * Generete Getters and Setters
     * */
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     *  Creation of getters and setters of relations between tables
     * */
    public Producto getProductoOrd() {
        return productoOrd;
    }

    public void setProductoOrd(Producto productoOrd) {
        this.productoOrd = productoOrd;
    }
}
