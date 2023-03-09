package sdk.api.development.examples.festivo_api.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import sdk.api.development.examples.festivo_api.model.Country;
import sdk.api.development.examples.festivo_api.model.HolidayResponse;

public class HolidaysApi {
    private final String API_URL = "https://api.getfestivo.com/v2";
    private String apiKey;

    public HolidaysApi(String apiKey) {
        this.apiKey = apiKey;
    }

    public List<Country> listCountries() throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + "/countries?" + "api_key=" + apiKey);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(uri)
            .header("Content-Type", "application/json")
            .GET()
            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        List<Country> countries = mapper.readValue(response.body(), new TypeReference<List<Country>>() {});
        return countries;
    }

    public HolidayResponse listHolidays(String country, int year) throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + "/holidays?" + "api_key=" + apiKey + "&country=" + country + "&year=" + year);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(uri)
            .header("Content-Type", "application/json")
            .GET()
            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        HolidayResponse holidayResponse = mapper.readValue(response.body(), new TypeReference<HolidayResponse>() {});
        return holidayResponse;
    }
}
