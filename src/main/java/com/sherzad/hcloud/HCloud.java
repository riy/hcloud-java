package com.sherzad.hcloud;

import java.util.Collections;

import com.sherzad.hcloud.request.ServerRequest;
import com.sherzad.hcloud.response.Action;
import com.sherzad.hcloud.response.ActionResponse;
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

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class HCloud {

    private static final String API_ENDPOINT = "https://api.hetzner.cloud/v1";

    private final String token;
    private final HttpHeaders httpHeaders;
    private final HttpEntity<String> entity;
    private final RestTemplate restTemplate;

    /**
     * Instantiate this instance with the API token of a specific project.
     * 
     * @param token The API token as returned by the Hetzner Cloud Console.
     */
    public HCloud(final String token) {
        this.token = token;

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        this.httpHeaders.add("Authorization", "Bearer " + token);
        this.entity = new HttpEntity<>("parameters", httpHeaders);

        restTemplate = new RestTemplate();
    }

    /**
     * https://docs.hetzner.cloud/#resources-servers-get
     * 
     * @return All object containing all servers.
     */
    public ServersResponse getServers() {
        return restTemplate.exchange(API_ENDPOINT + "/servers", HttpMethod.GET, entity, ServersResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-servers-get
     * 
     * @param name The server name to filter for.
     * @return An object containing all matching servers.
     */
    public ServersResponse getServers(final String name) {
        return restTemplate.exchange(API_ENDPOINT + "/servers?" + name, HttpMethod.GET, entity, ServersResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-servers-get-1
     * 
     * @param id The ID of the server to return.
     * @return An object containing the requested server, null otherwise.
     */
    public ServerResponse getServer(final Long id) {
        return restTemplate.exchange(API_ENDPOINT + "/servers/" + id, HttpMethod.GET, entity, ServerResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-servers-post
     * 
     * @param serverRequest The new server to create.
     * @return The newly created server.
     */
    public ServerResponse createServer(final ServerRequest serverRequest) {
        return restTemplate
                .postForEntity(API_ENDPOINT + "/servers", new HttpEntity<>(serverRequest, httpHeaders), ServerResponse.class)
                .getBody();
    }


    /**
     * https://docs.hetzner.cloud/#resources-servers-delete
     *
     * @param id The ID of the server to delete.
     * @return An object containing information about the deletion request.
     */
    public ActionResponse deleteServer(final Long id) {
        return restTemplate.exchange(API_ENDPOINT + "/servers/" + id, HttpMethod.DELETE, entity, ActionResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-server-types-get
     *
     * @return An object containing all server types.
     */
    public ServerTypesResponse getServerTypes() {
        return restTemplate.exchange(API_ENDPOINT + "/server_types", HttpMethod.GET, entity, ServerTypesResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-server-types-get
     *
     * @param name The server type name to filter for.
     * @return An object containing all matching server types.
     */
    public ServerTypesResponse getServerTypes(final String name) {
        return restTemplate.exchange(API_ENDPOINT + "/server_types?" + name, HttpMethod.GET, entity, ServerTypesResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-server-types-get-1
     *
     * @param id The ID of the server type to return.
     * @return An object containing the server type, null otherwise.
     */
    public ServerTypeResponse getServerType(final Long id) {
        return restTemplate.exchange(API_ENDPOINT + "/server_types/" + id, HttpMethod.GET, entity, ServerTypeResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-locations-get
     * 
     * @return An object containing all locations.
     */
    public LocationsResponse getLocations() {
        return restTemplate.exchange(API_ENDPOINT + "/locations", HttpMethod.GET, entity, LocationsResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-locations-get
     * 
     * @param name The location name to filter for.
     * @return An object containing all matching locations.
     */
    public LocationsResponse getLocations(final String name) {
        return restTemplate.exchange(API_ENDPOINT + "/locations?" + name, HttpMethod.GET, entity, LocationsResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-locations-get-1
     * 
     * @param id The ID of the location to return.
     * @return An object containing the location, null otherwise.
     */
    public LocationResponse getLocation(final Long id) {
        return restTemplate.exchange(API_ENDPOINT + "/locations/" + id, HttpMethod.GET, entity, LocationResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-datacenters-get
     * 
     * @return An object containing all datacenters.
     */
    public DatacentersResponse getDatacenters() {
        return restTemplate.exchange(API_ENDPOINT + "/datacenters", HttpMethod.GET, entity, DatacentersResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-datacenters-get
     * 
     * @param name The datacenter name to filter for.
     * @return An object containing all matching datacenters.
     */
    public DatacentersResponse getDatacenters(final String name) {
        return restTemplate.exchange(API_ENDPOINT + "/datacenters?" + name, HttpMethod.GET, entity, DatacentersResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-datacenters-get-1
     * 
     * @param id The ID of the datacenter to return.
     * @return An object containing the datacenter, null otherwise.
     */
    public DatacenterResponse getDatacenter(final Long id) {
        return restTemplate.exchange(API_ENDPOINT + "/datacenters/" + id, HttpMethod.GET, entity, DatacenterResponse.class)
                .getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-isos-get
     * 
     * @return An object containing all isos.
     */
    public IsosResponse getIsos() {
        return restTemplate.exchange(API_ENDPOINT + "/isos", HttpMethod.GET, entity, IsosResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-isos-get
     * 
     * @param name The iso name to filter for.
     * @return An object containing all matching isos.
     */
    public IsosResponse getIsos(final String name) {
        return restTemplate.exchange(API_ENDPOINT + "/isos?" + name, HttpMethod.GET, entity, IsosResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-isos-get-1
     * 
     * @param id The ID of the iso to return.
     * @return An object containing the iso, null otherwise.
     */
    public IsoResponse getIso(final Long id) {
        return restTemplate.exchange(API_ENDPOINT + "/isos/" + id, HttpMethod.GET, entity, IsoResponse.class).getBody();
    }

    /**
     * https://docs.hetzner.cloud/#resources-pricing-get
     * 
     * @return An object containing all pricijng information.
     */
    public PricingResponse getPricing() {
        return restTemplate.exchange(API_ENDPOINT + "/pricing", HttpMethod.GET, entity, PricingResponse.class).getBody();
    }

}
