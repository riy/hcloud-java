import com.fasterxml.jackson.core.JsonProcessingException;
import com.sherzad.hcloud.HCloud;
import com.sherzad.hcloud.response.ServersResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
@Slf4j
public class ServersEndpointUnitTest {

    private static final String TOKEN = System.getProperty("token");

    @Test
    public void shouldReturnFirstPageForServers() throws JsonProcessingException {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServersResponse serversResponse = hcloud.getServers();

        // then
        // S_ystem.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(serversResponse));
        assertThat(serversResponse.getMeta().getPagination().getPage()).isEqualTo(1);
    }

    @Test
    public void shouldReturnFirstPageForServersWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServersResponse serversResponse = hcloud.getServers("hcloud-java-testserver");

        // then
        assertThat(serversResponse.getMeta().getPagination().getPage()).isEqualTo(1);
    }
}
