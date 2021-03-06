package it.nextre.academy.Supermarket.services;

import it.nextre.academy.Supermarket.model.Dipendente;

import java.util.List;

public interface DipendenteService {

    Dipendente findByIban(String iban);
    List<Dipendente> findByRuolo(Dipendente.Ruolo ruolo);

    <S extends Dipendente> S save(S entity);
    <S extends Dipendente> List<S> saveAll(Iterable<S> entities);
    List<Dipendente> findAll();
    void deleteById(Long aLong);
    void deleteAll();

}//end interface
