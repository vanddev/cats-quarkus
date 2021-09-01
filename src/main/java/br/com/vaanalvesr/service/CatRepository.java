package br.com.vaanalvesr.service;

import br.com.vaanalvesr.model.Cat;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CatRepository implements PanacheRepository<Cat> {
}
