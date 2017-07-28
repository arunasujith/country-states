package io.arunsujith.countrystate.provider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.arunsujith.countrystate.model.Country;
import io.arunsujith.countrystate.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aruna Karunarathna
 */
public class CountryStateProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryStateProvider.class);

    private static List<Country> countries;

    static {
        ObjectMapper mapper = new ObjectMapper();
        try {
            countries = mapper.readValue(new File(Constants.COUNTRY_STATES_FILE_PATH),
                    new TypeReference<List<Country>>() {
            });
        } catch (IOException e) {
            LOGGER.error("Exception occurred", e);
        }
    }

    public static List<Country> getStates(String countryId) {
        return countries
                .stream()
                .filter(country -> country.getCountry().equals(countryId))
                .collect(Collectors.toList());

    }

}
