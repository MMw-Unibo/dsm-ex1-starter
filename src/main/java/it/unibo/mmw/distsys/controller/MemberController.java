package it.unibo.mmw.distsys.controller;

import it.unibo.mmw.distsys.ejb.MemberRepository;
import it.unibo.mmw.distsys.models.Member;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Model
public class MemberController {

    @Produces
    @Named
    Member newMember;

    @Inject
    MemberRepository memberRepository;

    @PostConstruct
    public void initNewMember() {
        Member tmp = memberRepository.findById(1L);
        if (tmp == null) {
            newMember = new Member();
            newMember.setId(0L);
            newMember.setName("None");
            newMember.setEmail("none@example.com");
            newMember.setPhoneNumber("0000000000");
        } else {
            newMember = tmp;
        }
    }
}
