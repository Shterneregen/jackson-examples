package random.jacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Test
    void testSerialize() throws JsonProcessingException {
        BeerDto dto = getDto();
        String json = getObjectMapper().writeValueAsString(dto);
        System.out.println(json);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerId\":\"7f812d70-f687-4b5c-8a3f-2c90678e18ca\",\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":123123123,\"price\":12.99,\"created-date\":\"2020-04-26T01:46:07.8465644+03:00\",\"last-updated-date\":\"2020-04-26T01:46:07.8465644+03:00\"}";
        BeerDto dto = getObjectMapper().readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}
