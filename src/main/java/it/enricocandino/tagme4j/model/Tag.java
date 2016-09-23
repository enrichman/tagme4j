/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.model;

import java.util.List;

public class Tag {

    private Long id;
    private String title;
    private Long start;
    private Long end;
    private String rho;
    private String spot;
    private String link_probability;
    private List<String> dbpedia_categories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String getRho() {
        return rho;
    }

    public void setRho(String rho) {
        this.rho = rho;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getLink_probability() {
        return link_probability;
    }

    public void setLink_probability(String link_probability) {
        this.link_probability = link_probability;
    }

    public List<String> getDbpedia_categories() {
        return dbpedia_categories;
    }

    public void setDbpedia_categories(List<String> dbpedia_categories) {
        this.dbpedia_categories = dbpedia_categories;
    }


}
