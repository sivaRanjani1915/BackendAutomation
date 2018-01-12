package com.services.responses.search.productSearch;

import java.util.ArrayList;
import java.util.List;

public class Meta {

    public Integer totalResults;
    public Integer startingIndex;
    public Integer resultsReturned;
    public String sort;
    public List<Facet> facets = new ArrayList<>();
    public List<Category> categories = new ArrayList<>();

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getStartingIndex() {
        return startingIndex;
    }

    public void setStartingIndex(Integer startingIndex) {
        this.startingIndex = startingIndex;
    }

    public Integer getResultsReturned() {
        return resultsReturned;
    }

    public void setResultsReturned(Integer resultsReturned) {
        this.resultsReturned = resultsReturned;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
