/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.model;

public class Relatedness {

    private String couple;
    private double rel;
    private String err;

    public void setCouple(String couple) {
        this.couple = couple;
    }

    public double getRel() {
        return rel;
    }

    public void setRel(double rel) {
        this.rel = rel;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getErr() {
        return err;
    }
    
    public String getEntity0(){
    	return couple.split(" ")[0];
    }

    public String getEntity1(){
    	return couple.split(" ")[1];
    }
    
    public boolean entitiesExist(){
		return err == null;
    }
}
