package com.miniobp.host.party.service.application;

public class PartyDTO {
    String name;
    String branchName;
    PartyAddressDTO partyAddress;

    public PartyDTO(String name, String branchName, PartyAddressDTO partyAddress) {
        this.name = name;
        this.branchName = branchName;
        this.partyAddress = partyAddress;
    }

    public String getName() {
        return name;
    }

    public String getBranchName() {
        return branchName;
    }

    public PartyAddressDTO getPartyAddress() {
        return partyAddress;
    }
}
