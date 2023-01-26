package com.manufacturing.plant.domain.service;

import com.manufacturing.plant.domain.repository.InventarioRepository;
import com.manufacturing.plant.persistence.entity.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class InventarioService implements InventarioRepository{
    @Autowired
    private InventarioRepository inventarioRepository;

    /**
     *
     * */
    @Override
    public List<Inventario> findAll() {
        return null;
    }

    @Override
    public List<Inventario> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Inventario> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Inventario> findAllById(Iterable<Long> longs) {
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
    public void delete(Inventario entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Inventario> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Inventario> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Inventario> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Inventario> findById(Long aLong) {
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
    public <S extends Inventario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Inventario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Inventario> entities) {

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
    public Inventario getOne(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public Inventario getById(Long aLong) {
        return null;
    }

    @Override
    public Inventario getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Inventario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Inventario> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Inventario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Inventario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Inventario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Inventario> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Inventario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
