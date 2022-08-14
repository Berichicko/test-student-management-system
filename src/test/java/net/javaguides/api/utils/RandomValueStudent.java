package net.javaguides.api.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValueStudent {

    public static final String STUDENT_NAME = RandomStringUtils.randomAlphabetic(2, 10);

    public static final String STUDENT_LAST_NAME = RandomStringUtils.randomAlphabetic(2, 10);

    public static final String STUDENT_EMAIL = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";

}
