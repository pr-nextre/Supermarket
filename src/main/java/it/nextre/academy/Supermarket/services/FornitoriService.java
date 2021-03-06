package it.nextre.academy.Supermarket.services;


import it.nextre.academy.Supermarket.model.Fornitori;

import java.util.List;

public interface FornitoriService {

    Fornitori findByPartitaIva(String partitaIva);

    <S extends Fornitori> S save(S entity);
    <S extends Fornitori> List<S> saveAll(Iterable<S> entities);
    List<Fornitori> findAll();
    void deleteById(Long aLong);
    void deleteAll();

}//end interface
