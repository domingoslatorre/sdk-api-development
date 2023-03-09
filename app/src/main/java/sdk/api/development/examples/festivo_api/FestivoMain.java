package sdk.api.development.examples.festivo_api;

import java.io.IOException;

import sdk.api.development.examples.festivo_api.api.HolidaysApi;
import sdk.api.development.examples.festivo_api.model.HolidayResponse;

public class FestivoMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        String apiKey = System.getenv("FESTIVO_API_KEY");
       
        HolidaysApi holidaysApi = new HolidaysApi(apiKey);

        HolidayResponse holidayResponse = holidaysApi.listHolidays("BR", 2022);

        holidayResponse.getHolidays().forEach(System.out::println);
    }
}
