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
        String json = "{\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":123123123,\"price\":\"12.99\",\"created-date\":\"2020-04-26T02:51:24+0300\",\"last-updated-date\":\"2020-04-26T02:51:24.3665569+03:00\",\"my-local-date\":\"20200426\",\"beerId\":\"4feb665d-5743-4624-8512-817d4354abf5\"}";
        BeerDto dto = getObjectMapper().readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}
