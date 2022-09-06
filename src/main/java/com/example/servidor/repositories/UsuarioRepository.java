package com.example.servidor.repositories;

import com.example.servidor.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsuarioRepository implements CrudRepository<UsuarioModel, Long> {
    @Override
    public <S extends UsuarioModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioModel> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UsuarioModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<UsuarioModel> findAll() {
        return null;
    }

    @Override
    public Iterable<UsuarioModel> findAllById(Iterable<Long> longs) {
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
    public void delete(UsuarioModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsuarioModel> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
