package br.com.vaanalvesr.service;

import br.com.vaanalvesr.model.BreedWrapper;
import br.com.vaanalvesr.model.CatFact;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "cat-service")
public interface CatService {

    @GET
    @Path("/fact")
    @Produces(MediaType.APPLICATION_JSON)
    CatFact getFact();

}
