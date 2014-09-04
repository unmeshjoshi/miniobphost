package com.miniobp.host.party.service.jsonfacade;

import com.miniobp.host.party.service.application.PartyDTO;
import com.miniobp.host.party.service.application.PartySearchApplicationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/party/search/{partyName}")
public class PartySearchJsonFacade {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PartyDTO search(@PathParam("partyName") String partyName){
        PartySearchApplicationService applicationService = new PartySearchApplicationService();
        return applicationService.search(partyName);
    }
}
