package com.manufacturing.plant.domain.service;

import com.manufacturing.plant.domain.repository.OrdenRepository;
import com.manufacturing.plant.persistence.entity.Orden_Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class OrdenCompraService implements OrdenRepository{
    @Autowired
    private OrdenRepository ordenRepository;

    /**
     *
     * */
    @Override
    public List<Orden_Compra> findAll() {
        return null;
    }

    @Override
    public List<Orden_Compra> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Orden_Compra> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Orden_Compra> findAllById(Iterable<Long> longs) {
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
    public void delete(Orden_Compra entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Orden_Compra> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Orden_Compra> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Orden_Compra> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Orden_Compra> findById(Long aLong) {
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
    public <S extends Orden_Compra> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Orden_Compra> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Orden_Compra> entities) {

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
    public Orden_Compra getOne(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public Orden_Compra getById(Long aLong) {
        return null;
    }

    @Override
    public Orden_Compra getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Orden_Compra> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Orden_Compra> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Orden_Compra> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Orden_Compra> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Orden_Compra> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Orden_Compra> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Orden_Compra, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
