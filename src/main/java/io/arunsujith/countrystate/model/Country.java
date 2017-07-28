package io.arunsujith.countrystate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * @author Aruna Karunarathna
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Country {

    private String country;
    private String state;
    private String region;
    @JsonProperty("short")
    private String shortName;
    @JsonProperty("english")
    private String englishName;
    private String name;
    private String [] alt;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAlt() {
        return alt;
    }

    public void setAlt(String[] alt) {
        this.alt = alt;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", region='" + region + '\'' +
                ", shortName='" + shortName + '\'' +
                ", englishName='" + englishName + '\'' +
                ", name='" + name + '\'' +
                ", alt=" + Arrays.toString(alt) +
                '}';
    }
}
