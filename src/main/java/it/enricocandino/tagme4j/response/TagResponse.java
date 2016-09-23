/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.response;

import it.enricocandino.tagme4j.model.Tag;

import java.util.List;

public class TagResponse extends TagMeResponse {

    private String test;
    private List<Tag> annotations;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<Tag> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Tag> annotations) {
        this.annotations = annotations;
    }
}
