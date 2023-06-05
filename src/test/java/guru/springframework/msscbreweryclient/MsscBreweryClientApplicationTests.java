package guru.springframework.msscbreweryclient;

import guru.springframework.msscbreweryclient.web.client.BreweryClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class MsscBreweryClientApplicationTests {

    @Autowired
    BreweryClient client;

    @Test
    void testDeleteBeer(){
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    public void contextLoads() {
    }

}
