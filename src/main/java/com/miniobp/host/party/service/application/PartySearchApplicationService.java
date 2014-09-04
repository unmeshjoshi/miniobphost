package com.miniobp.host.party.service.application;

public class PartySearchApplicationService {
    public PartyDTO search(String partyName) {
            return new PartyDTO("scott", "BA001", new PartyAddressDTO("Cranberry Hill", "Lexington", "MA", "USA"));
    }
}
