import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RunWith(JUnit4.class)
@Slf4j
public class RunMeUnitTest {

    @Test
    public void testIt() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("Authorization", "Bearer ");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<ServersResponse> responseEntity = restTemplate
                .exchange("https://api.hetzner.cloud/v1/servers", HttpMethod.GET, entity, ServersResponse.class);

        System.out.println("==== RESTful API Response using Spring RESTTemplate START =======");
        System.out.println(responseEntity.getBody().getMeta().getPagination().getPage());
    }
}
