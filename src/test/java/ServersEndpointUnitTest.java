import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sherzad.hcloud.HCloud;
import com.sherzad.hcloud.request.ServerRequest;
import com.sherzad.hcloud.response.ServerResponse;
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
    public void shouldReturnFirstPageForServers() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServersResponse serversResponse = hcloud.getServers();

        // then
        prettyPrint(serversResponse);
        assertThat(serversResponse.getMeta().getPagination().getPage()).isEqualTo(1);
    }

    @Test
    public void shouldReturnFirstPageForServersWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServersResponse serversResponse = hcloud.getServers("hcloud-java-testserver");

        // then
        prettyPrint(serversResponse);
        assertThat(serversResponse.getMeta().getPagination().getPage()).isEqualTo(1);
    }

    @Test
    public void shouldReturnFirstPageForSpecificServer() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerResponse serverResponse = hcloud.getServer(493691L);

        // then
        prettyPrint(serverResponse);
        assertThat(serverResponse.getServer().getId()).isEqualTo(493691);
    }

    @Test
    public void shouldCreateServer() {
        // given
        final ServerRequest serverRequest = ServerRequest.builder()
                .name("myserver06")
                .serverType("cx11")
                // .datacenter("fsn1-dc8")
                .location("fsn1")
                .startAfterCreate(true)
                .image("debian-9")
                .sshKeys(Arrays.asList(2277L))
                .userData("``")
                .build();

        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerResponse serverResponse = hcloud.createServer(serverRequest);

        // then
        prettyPrint(serverResponse);
        assertThat(serverResponse.getServer().getName()).isEqualTo("myserver06");
    }

    private void prettyPrint(final Object jsonObject) {
        try {
            log.debug(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject));
        } catch (JsonProcessingException jpe) {
            jpe.printStackTrace();
        }
    }
}
