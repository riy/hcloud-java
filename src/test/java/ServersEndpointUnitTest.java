import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sherzad.hcloud.HCloud;
import com.sherzad.hcloud.request.ServerRequest;
import com.sherzad.hcloud.response.DatacenterResponse;
import com.sherzad.hcloud.response.DatacentersResponse;
import com.sherzad.hcloud.response.IsoResponse;
import com.sherzad.hcloud.response.IsosResponse;
import com.sherzad.hcloud.response.LocationResponse;
import com.sherzad.hcloud.response.LocationsResponse;
import com.sherzad.hcloud.response.PricingResponse;
import com.sherzad.hcloud.response.ServerResponse;
import com.sherzad.hcloud.response.ServerTypeResponse;
import com.sherzad.hcloud.response.ServerTypesResponse;
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
    private static final String HCLOUD_JAVA_TESTSERVER_PREFIX = "hcloud-java-testserver-";

    @Test
    public void shouldReturnAllServers() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServersResponse serversResponse = hcloud.getServers();

        // then
        prettyPrint(serversResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnServersWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);
        // TODO Create a server

        // when
        final ServersResponse serversResponse = hcloud.getServers("hcloud-java-testserver");

        // then
        prettyPrint(serversResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnSpecificServer() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);
        // TODO Create a server

        // when
        final ServerResponse serverResponse = hcloud.getServer(1L);

        // then
        prettyPrint(serverResponse);
        assertThat(serverResponse.getServer().getId()).isEqualTo(1L);
        // TODO assertThat(...)
    }

    @Test
    public void shouldCreateServer() {
        // given
        final ServerRequest serverRequest = ServerRequest.builder()
                .name("myserver06")
                .serverType("cx11")
                // .datacenter("fsn1-dc8") // datacenter and location are mutually exclusive
                .location("fsn1")
                .startAfterCreate(true)
                .image("debian-9")
                .sshKeys(Arrays.asList(2277L))
                .build();

        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerResponse serverResponse = hcloud.createServer(serverRequest);

        // then
        prettyPrint(serverResponse);
        assertThat(serverResponse.getServer().getName()).isEqualTo("myserver06");
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnAllServerTypes() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerTypesResponse serverTypesResponse = hcloud.getServerTypes();

        // then
        prettyPrint(serverTypesResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnServerTypesWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerTypesResponse serverTypesResponse = hcloud.getServerTypes("fsn1");

        // then
        prettyPrint(serverTypesResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnSpecificServerType() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerTypeResponse serverTypeResponse = hcloud.getServerType(1L);

        // then
        prettyPrint(serverTypeResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnAllLocations() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final LocationsResponse locationsResponse = hcloud.getLocations();

        // then
        prettyPrint(locationsResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnLocationsWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final LocationsResponse locationsResponse = hcloud.getLocations("fsn1");

        // then
        prettyPrint(locationsResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnSpecificLocation() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final LocationResponse locationResponse = hcloud.getLocation(1L);

        // then
        prettyPrint(locationResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnAllDatacenters() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final DatacentersResponse datacentersResponse = hcloud.getDatacenters();

        // then
        prettyPrint(datacentersResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnDatacentersWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final DatacentersResponse datacentersResponse = hcloud.getDatacenters("fsn1-dc8");

        // then
        prettyPrint(datacentersResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnSpecificDatacenter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final DatacenterResponse datacenterResponse = hcloud.getDatacenter(1L);

        // then
        prettyPrint(datacenterResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnAllIsos() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final IsosResponse isosResponse = hcloud.getIsos();

        // then
        prettyPrint(isosResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnIsosWithFilter() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final IsosResponse isosResponse = hcloud.getIsos("FreeBSD-11.0-RELEASE-amd64-dvd1");

        // then
        prettyPrint(isosResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnSpecificIso() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final IsoResponse isoResponse = hcloud.getIso(1L);

        // then
        prettyPrint(isoResponse);
        // TODO assertThat(...)
    }

    @Test
    public void shouldReturnPricing() {
        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final PricingResponse pricingResponse = hcloud.getPricing();

        // then2
        prettyPrint(pricingResponse);
        assertThat(pricingResponse.getPricing().getCurrency()).isEqualTo("EUR");
        assertThat(pricingResponse.getPricing().getVatRate()).isEqualTo(new Double(19));
        // TODO assertThat(...)
    }

    private void createServer() {
        final ServerRequest serverRequest = ServerRequest.builder()
                .name("myserver06")
                .serverType("cx11")
                // .datacenter("fsn1-dc8") // datacenter and location are mutually exclusive
                .location("fsn1")
                .startAfterCreate(true)
                .image("debian-9")
                .sshKeys(Arrays.asList(2277L))
                .build();

        // given
        final HCloud hcloud = new HCloud(TOKEN);

        // when
        final ServerResponse serverResponse = hcloud.createServer(serverRequest);
    }

    private void prettyPrint(final Object jsonObject) {
        try {
            final ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            log.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject));
        } catch (JsonProcessingException jpe) {
            jpe.printStackTrace();
        }
    }
}
