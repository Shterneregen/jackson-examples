package random.jacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = getObjectMapper().writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123,\"price\":\"12.99\",\"createdDate\":\"2020-04-26T02:49:56+0300\",\"lastUpdatedDate\":\"2020-04-26T02:49:56.6732143+03:00\",\"myLocalDate\":\"20200426\",\"beerId\":\"f51faf30-bbc3-4821-b267-7100469f14e3\"}";
        BeerDto dto = getObjectMapper().readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}