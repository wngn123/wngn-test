package com.zzia.wngn.common;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Configuration extends Properties {

    private static final long serialVersionUID = 5044046358027224342L;
    private static Logger logger = LoggerFactory.getLogger(Configuration.class);

    private static Configuration instance = null;

    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key, String defaultValue) {
        String val = getProperty(key);
        return (val == null || val.isEmpty()) ? defaultValue : val;
    }

    public String getString(String name, String defaultValue) {
        return this.getProperty(name, defaultValue);
    }

    public int getInt(String name, int defaultValue) {
        String val = this.getProperty(name);
        return (val == null || val.isEmpty()) ? defaultValue : Integer.parseInt(val);
    }

    public long getLong(String name, long defaultValue) {
        String val = this.getProperty(name);
        return (val == null || val.isEmpty()) ? defaultValue : Integer.parseInt(val);
    }

    public float getFloat(String name, float defaultValue) {
        String val = this.getProperty(name);
        return (val == null || val.isEmpty()) ? defaultValue : Float.parseFloat(val);
    }

    public double getDouble(String name, double defaultValue) {
        String val = this.getProperty(name);
        return (val == null || val.isEmpty()) ? defaultValue : Double.parseDouble(val);
    }

    public byte getByte(String name, byte defaultValue) {
        String val = this.getProperty(name);
        return (val == null || val.isEmpty()) ? defaultValue : Byte.parseByte(val);
    }

    public boolean getBoolean(String name, boolean defaultValue) {
        String val = this.getProperty(name);
        if (val == null || val.isEmpty()) {
            return defaultValue;
        }
        return ("true".equalsIgnoreCase(val) || "1".equalsIgnoreCase(val) || "yes".equalsIgnoreCase(val)) ? true : false;
    }

    public List<String> getList(String name, String defaultValue) {
        List<String> list = new ArrayList<String>();
        String val = this.getString(name, defaultValue);
        if (val != null && val.length() > 0) {
            String[] values = val.split(",");
            for (String value : values) {
                list.add(value);
            }
        }
        return list;
    }

    public String[] getArray(String name, String defaultValue) {
        String val = this.getString(name, defaultValue);
        if (val != null && val.length() > 0) {
            return val.split(",");
        }
        return new String[]{};
    }

    public Configuration() {
        InputStream in = null;
        try {
            in = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
            this.load(in);
        } catch (Exception e) {
            logger.error("configuration load config.properties error:{}", ExceptionUtils.getStackTrace(e));
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
