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
import org.junit.BeforeClass;

public class TagMeClientTest extends TestCase {

    private TagMeClient tagMeClient;

    @BeforeClass
    public void setUp() {
        String apiKey = System.getenv("API_KEY");
        tagMeClient = new TagMeClient(apiKey);
    }

    public void testTagRequest() {
        TagResponse tagResponse = tagMeClient
                .tag()
                .text("Obama visited Merkel in Budapest")
                .execute();

        for (Annotation a : tagResponse.getAnnotations()){
            System.out.printf("%s -> %s (id=%d, rho=%f, lp=%f)%n", a.getSpot(), a.getTitle(), a.getId(), a.getRho(), a.getLinkProbability());
        }
    }

    public void testSpotRequest() {
        SpotResponse spotResponse = tagMeClient
                .spot()
                .text("Ice cream is good because it contains sugar")
                .execute();

        for (Mention m : spotResponse.getSpots()){
            System.out.printf("%s (lp=%f)%n", m.getSpot(), m.getLp());
        }
    }

    public void testRelRequest_id() {
        RelResponse relResponse1 = tagMeClient
                .rel()
                .id(534366, 72671)
                .id(534366, 36787)
                .id(534366, 367873434324435L)
                .id(0, 367873434324435L)
                .execute();

        for (Relatedness r : relResponse1.getResult()) {
            if (r.getErr() == null) {
                System.out.printf("%s, %s rel=%f%n", r.getEntity1(), r.getEntity2(), r.getRel());
            } else {
                System.out.printf("Could not compute relatedness for entities [%s, %s] - Error: %s%n", r.getEntity1(), r.getEntity2(), r.getErr());
            }
        }
    }

    public void testRelRequest_tt() {
        RelResponse relResponse2 = tagMeClient
                .rel()
                .tt("Linked_data", "Semantic_Web")
                .tt("University_of_Pisa", "Massachusetts_Institute_of_Technology")
                .tt("James_Cameron", "Downing_Street")
                .tt("James_Cameron", "Non_Existing_Entity_ZXCASD")
                .execute();

        for (Relatedness r : relResponse2.getResult()) {
            if (r.getErr() == null) {
                System.out.printf("%s, %s rel=%f%n", r.getEntity1(), r.getEntity2(), r.getRel());
            } else {
                System.out.printf("Could not compute relatedness for entities [%s, %s] - Error: %s%n", r.getEntity1(), r.getEntity2(), r.getErr());
            }
        }
    }

}
