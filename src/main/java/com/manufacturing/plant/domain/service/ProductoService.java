package com.manufacturing.plant.domain.service;

import com.manufacturing.plant.domain.repository.ProductoRespository;
import com.manufacturing.plant.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ProductoService implements ProductoRespository{

    @Autowired
    private ProductoRespository productoRespository;

    @Override
    public List<Producto> findAll() {
        return null;
    }

    /**
     *
     * */
//    @Override
//    public static List<Producto> findAll() {
//        return productoRepository.findAll();
//    }

    @Override
    public List<Producto> findAll(Sort sort) {
        return productoRespository.findAll(sort);
    }

    @Override
    public Page<Producto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Producto> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Producto entity) {
        productoRespository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Producto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Producto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Producto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Producto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Producto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Producto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Producto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public Producto getOne(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public Producto getById(Long aLong) {
        return null;
    }

    @Override
    public Producto getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Producto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Producto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Producto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Producto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Producto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Producto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Producto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    public Optional<Object> getProduct(Long productId) {
        return Optional.of(productoRespository.getReferenceById(productId));
    }

    public Optional<Object> getByCategory(int categoryId) {
        return productoRespository.getByCategory(categoryId);
    }

    public Boolean delete(Long productId) {
        return getProduct(productId).map(product -> {
            productoRespository.delete(productId);
            return true;
        }).orElse(false);
    }
}
