package model;

import java.util.List;
//@Entity

public class Researchs {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private List<Research> researchs;

    public List<Research> getResearchs() {
        return researchs;
    }

    public void setResearchs(List<Research> researchs) {
        this.researchs = researchs;
    }
}