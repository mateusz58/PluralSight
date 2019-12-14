package com.globomantics.productservice;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class TestingSqlQueries {

    private static final String ENCODING = "UTF-8";
    public static String CREATE_TABLE;
    public static String DROP_TABLE;

    static {
        try {
            CREATE_TABLE = FileUtils.readFileToString(new File("src/main/resources/schema.sql"), ENCODING);
            DROP_TABLE = FileUtils.readFileToString(new File("src/main/resources/DROP-ALL-TABLES.sql"), ENCODING);
        } catch (IOException e) {
            System.out.println("Testing");
        }
    }
}
