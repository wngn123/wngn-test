package com.zzia.wngn.common;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigurationTest {

    private static Logger logger = LoggerFactory.getLogger(Configuration.class);

    @Test
    public void testString() {
        String result = Configuration.getInstance().getString("test.string.a", "default");
        logger.info("------" + result);
    }

    @Test
    public void testInt() {
        int result = Configuration.getInstance().getInt("test.integer.a", 0);
        logger.info("------" + result);
    }

    @Test
    public void testLong() {
        long result = Configuration.getInstance().getLong("test.long.a", 0L);
        logger.info("------" + result);
    }

    @Test
    public void testBoolean() {
        boolean result = Configuration.getInstance().getBoolean("test.boolean.true.a", false);
        logger.info("------" + result);
    }

    @Test
    public void testList() {
        List<String> result = Configuration.getInstance().getList("test.list.a", "");
        logger.info("------" + result);
    }

    @Test
    public void testArray() {
        String[] result = Configuration.getInstance().getArray("test.list.a", "");
        logger.info("------" + result);
    }

}
