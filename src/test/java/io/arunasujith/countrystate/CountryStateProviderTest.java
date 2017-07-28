package io.arunasujith.countrystate;

import io.arunsujith.countrystate.provider.CountryStateProvider;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aruna Karunarathna
 */
public class CountryStateProviderTest {

    @Test
    public void getStatesTest() {
        Assert.assertEquals(57, CountryStateProvider.getStates("US").size());
        Assert.assertEquals(13, CountryStateProvider.getStates("CA").size());
        Assert.assertEquals(16, CountryStateProvider.getStates("AU").size());
        Assert.assertEquals(32, CountryStateProvider.getStates("MX").size());
    }
}
