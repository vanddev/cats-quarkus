package br.com.vaanalvesr.resource;

import br.com.vaanalvesr.model.Cat;
import br.com.vaanalvesr.service.CatService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@Path("cats")
public class CatResource {

    @Inject
    @RestClient
    CatService catService;

    @GET
    @Path("/fact")
    @Produces(MediaType.APPLICATION_JSON)
    public String getFact() {
        return catService.getFact().getFact();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(@Valid Cat cat) {
        cat.persist();
    }

    @GET
    @Path("/{id}")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Cat getById(@PathParam("id") UUID id) {
        return Cat.findById(id);
    }

    @GET
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cat> getAll() {
        return Cat.listAll();
    }

    @GET
    @Path("/kittens")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cat> getById() {
        return Cat.findKittens();
    }
}
