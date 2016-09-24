/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
import it.enricocandino.tagme4j.TagMeClient;
import it.enricocandino.tagme4j.response.RelResponse;
import it.enricocandino.tagme4j.response.SpotResponse;
import it.enricocandino.tagme4j.response.TagResponse;
import junit.framework.TestCase;

public class TestMe extends TestCase {

    public void testMe() {

        TagMeClient tagMeClient = new TagMeClient(System.getenv("API_KEY"));

        TagResponse tagResponse = tagMeClient
                .tag()
                .text("My text")
                .execute();

        SpotResponse spotResponse = tagMeClient
                .spot()
                .text("My text")
                .execute();

        RelResponse relResponse = tagMeClient
                .rel()
                .tt("Linked_data Semantic_Web")
                .tt("University_of_Pisa Massachusetts_Institute_of_Technology")
                .tt("James_Cameron Downing_Street")
                .execute();

        System.out.println();
    }


}
