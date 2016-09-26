/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.model;

import java.util.List;

public class Annotation {

    private int id;
    private String title;
    private int start;
    private int end;
    private String rho;
    private String spot;
    private String link_probability;
    private List<String> dbpedia_categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public double getRho() {
        return Double.parseDouble(rho);
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

    public double getLink_probability() {
        return Double.parseDouble(link_probability);
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
