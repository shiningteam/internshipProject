package base_URL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl {
    protected RequestSpecification spec;

    @Before
    public void setUp() {

        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/").build();
    }
}
