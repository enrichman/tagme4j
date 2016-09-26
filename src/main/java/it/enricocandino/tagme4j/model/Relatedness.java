/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.model;

public class Relatedness {

    private String couple;
    private String rel;

    public void setCouple(String couple) {
        this.couple = couple;
    }

    public double getRel() {
        return Double.parseDouble(rel);
    }

    public void setRel(String rel) {
        this.rel = rel;
    }
    
    public String getEntity0(){
    	return couple.split(" ")[0];
    }

    public String getEntity1(){
    	return couple.split(" ")[1];
    }
    
    public boolean entitiesExist(){
        return rel != null;
    }
}
