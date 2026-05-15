package com.sample.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang.StringUtils;
import java.util.Iterator;

@Slf4j
public class PropertyUtils {

    private PropertyUtils() {
    }

    private static final Configuration configuration;

    private static final String PROPERTIES_WHENSDAY_PROPERTIES = "properties/sampleapp.properties";

    static {
        configuration = PropertyUtils.getConfiguration(PROPERTIES_WHENSDAY_PROPERTIES);
    }

    public static String getString(String str) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
