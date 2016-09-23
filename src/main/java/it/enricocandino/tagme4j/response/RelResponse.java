/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.response;

import it.enricocandino.tagme4j.model.Couple;
import java.util.List;

public class RelResponse extends TagMeResponse {

    private List<Couple> result;

    public List<Couple> getResult() {
        return result;
    }

    public void setResult(List<Couple> result) {
        this.result = result;
    }
}
