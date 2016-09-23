/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.response;

import it.enricocandino.tagme4j.model.Spot;

import java.util.List;

public class SpotResponse extends TagMeResponse {

    private List<Spot> spots;

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }
}
