package br.com.vaanalvesr.model;

import java.util.List;

public class BreedWrapper {

    private Integer currentPage;
    private List<Breed> data;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<Breed> getData() {
        return data;
    }

    public void setData(List<Breed> data) {
        this.data = data;
    }
}
