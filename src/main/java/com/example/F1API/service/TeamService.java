package com.example.F1API.service;

import com.example.F1API.model.Team;
import com.example.F1API.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService implements TeamRepository {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public List<Team> findAll() {
        return null;
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Team> findAllById(Iterable<Long> longs) {
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
    public void delete(Team entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Team> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Team> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Team> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Team> findById(Long aLong) {
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
    public <S extends Team> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Team> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Team> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Team getOne(Long aLong) {
        return null;
    }

    @Override
    public Team getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Team> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Team> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Team> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Team> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Team> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Team> boolean exists(Example<S> example) {
        return false;
    }
}
