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
        String json = "{\"beer_name\":\"BeerName\",\"beer_style\":\"Ale\",\"upc\":123123123,\"price\":\"12.99\",\"created_date\":\"2020-04-26T02:50:43+0300\",\"last_updated_date\":\"2020-04-26T02:50:43.3226226+03:00\",\"my_local_date\":\"20200426\",\"beerId\":\"7843c21c-5ad3-4f40-8229-f09d4b4ce782\"}";
        BeerDto dto = getObjectMapper().readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}
