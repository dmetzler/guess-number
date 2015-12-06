package edu.isen.jee.guess;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class ServletTest extends JettyHarness {

    @Test
    public void itCanAccesMainPage() throws Exception {
        String result = get(getBaseUri() + "/guess");

        assertTrue(StringUtils.isNotEmpty(result));
        assertTrue(result.contains("Hello"));

    }

}
