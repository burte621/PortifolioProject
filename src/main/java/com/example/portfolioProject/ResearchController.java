package com.example.portfolioProject;

import model.Member;
import model.Research;
import model.Researchs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController

public class ResearchController {

    public Researchs researches;

    @GetMapping("/researchs")
    public List<Research> getResearches() {
        Member member1 = new Member();
        member1.setName("Birtukan");
        member1.setId(1);

        Member member2 = new Member();
        member2.setId(2);
        member2.setName("Efrem");

        Member member3 = new Member();
        member3.setName("Getu");
        member3.setId(3);

        ArrayList<Member> memberList1 = new ArrayList<>();
        memberList1.add(member1);
        memberList1.add(member2);

        ArrayList<Member> memberList2 = new ArrayList<>();
        memberList2.add(member3);
        memberList2.add(member2);

        Research research1 = new Research();
        research1.setTitle("Research 1 title");
        research1.setYear(2010);
        research1.setDescription("Research 1 description");
        research1.setListOfMembers(memberList1);

        Research research2 = new Research();
        research2.setTitle("Research 2 title");
        research2.setYear(2021);
        research2.setDescription("Research 2 description");
        research2.setListOfMembers(memberList2);


        ArrayList<Research> researchList = new ArrayList<>();
        researchList.add(research1);
        researchList.add(research2);



        researches = new Researchs();
        researches.setResearchs(researchList);

        return researches.getResearchs();
    }
}