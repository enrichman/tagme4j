/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
import it.enricocandino.tagme4j.TagMeClient;
import it.enricocandino.tagme4j.model.Annotation;
import it.enricocandino.tagme4j.model.Mention;
import it.enricocandino.tagme4j.model.Relatedness;
import it.enricocandino.tagme4j.response.RelResponse;
import it.enricocandino.tagme4j.response.SpotResponse;
import it.enricocandino.tagme4j.response.TagResponse;
import junit.framework.TestCase;

public class TestMe extends TestCase {

    public void testMe() {

        TagMeClient tagMeClient = new TagMeClient("MY_TAGME_KEY");

        TagResponse tagResponse = tagMeClient
                .tag()
                .text("Obama visited Merkel in Budapest")
                .execute();
        
        for (Annotation a : tagResponse.getAnnotations()){
            System.out.printf("%s -> %s (rho=%f, lp=%f)%n", a.getSpot(), a.getTitle(), a.getRho(), a.getLink_probability());
        }

        SpotResponse spotResponse = tagMeClient
                .spot()
                .text("Ice cream is good because it contains sugar")
                .execute();
        for (Mention m : spotResponse.getSpots()){
            System.out.printf("%s (lp=%f)%n", m.getSpot(), m.getLp());
        }

        RelResponse relResponse = tagMeClient
                .rel()
                .tt("Linked_data Semantic_Web")
                .tt("University_of_Pisa Massachusetts_Institute_of_Technology")
                .tt("James_Cameron Downing_Street")
                .tt("James_Cameron Downing_Stre")
                .execute();
        

        for (Relatedness r : relResponse.getResult())
        	if (r.entitiesExist())
        		System.out.printf("%s, %s rel=%f%n", r.getEntity0(), r.getEntity1(), r.getRel());
    }


}
