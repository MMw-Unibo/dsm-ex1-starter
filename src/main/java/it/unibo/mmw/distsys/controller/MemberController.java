package it.unibo.mmw.distsys.controller;

import it.unibo.mmw.distsys.models.Member;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Model
public class MemberController {

    @Produces
    @Named
    Member newMember;

    @PostConstruct
    public void initNewMember() {
        newMember = new Member();
        newMember.setId(1L);
        newMember.setName("Pippo");
        newMember.setEmail("pippo@example.com");
        newMember.setPhoneNumber("1231231234");
    }
}
