/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Annotation {

    private int id;
    private String title;
    private int start;
    private int end;
    private double rho;
    private String spot;
    @SerializedName("link_probability")
    private double linkProbability;
    @SerializedName("dbpedia_categories")
    private List<String> dbpediaCategories;

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
        return rho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public double getLinkProbability() {
        return linkProbability;
    }

    public void setLinkProbability(double linkProbability) {
        this.linkProbability = linkProbability;
    }

    public List<String> getDbpediaCategories() {
        return dbpediaCategories;
    }

    public void setDbpediaCategories(List<String> dbpediaCategories) {
        this.dbpediaCategories = dbpediaCategories;
    }


}
