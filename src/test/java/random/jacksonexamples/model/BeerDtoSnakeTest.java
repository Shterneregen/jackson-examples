package random.jacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {

    @Test
    void testSnakeSerialize() throws JsonProcessingException {
        BeerDto dto = getDto();
        String json = getObjectMapper().writeValueAsString(dto);
        System.out.println(json);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerId\":\"96210649-4e8c-46c3-a005-0bd96ec78070\",\"beer_name\":\"BeerName\",\"beer_style\":\"Ale\",\"upc\":123123123,\"price\":12.99,\"created_date\":\"2020-04-26T01:20:43.9873525+03:00\",\"last_updated_date\":\"2020-04-26T01:20:43.9873525+03:00\"}";
        BeerDto dto = getObjectMapper().readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}
