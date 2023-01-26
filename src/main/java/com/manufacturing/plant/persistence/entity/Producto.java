package com.manufacturing.plant.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {
    /**
     * Table attribute declaration according to db
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    /**
     * Creation of relationships according to db
     * */
    @ManyToOne
    @JoinColumn(name = "id_estado", insertable = false, updatable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "productoOrd")
    private List<Orden_Compra> orden_compra;

    @OneToMany(mappedBy = "productoInv")
    private List<Inventario> inventario;

    /**
     * the constructor is generated
     * */
    public Producto () {

    }

    public Producto(Integer idProducto, String nombre, Integer idEstado, Integer idCategoria, Estado estado, Categoria categoria, List<Orden_Compra> orden_compra, List<Inventario> inventario) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.idEstado = idEstado;
        this.idCategoria = idCategoria;
        this.estado = estado;
        this.categoria = categoria;
        this.orden_compra = orden_compra;
        this.inventario = inventario;
    }

    /**
     * Generete Getters and Setters
     * */
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     *  Creation of getters and setters of relations between tables
     * */
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Orden_Compra> getOrden_compra() {
        return orden_compra;
    }

    public void setOrden_compra(List<Orden_Compra> orden_compra) {
        this.orden_compra = orden_compra;
    }

    public List<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }
}
