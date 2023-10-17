/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 16:43:57 GMT 2023
 */
package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.DefaultDateTypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PipedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import org.junit.runner.RunWith;

public class DefaultDateTypeAdapterTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, dateFormat0, dateFormat0);
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree((Date) null);
        jsonElement0.isJsonArray();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, "");
        MockDate mockDate0 = new MockDate(1462, 1462, 0, 0, 8233);
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree(mockDate0);
        defaultDateTypeAdapter0.fromJsonTree(jsonElement0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, (DateFormat) null, (DateFormat) null);
        defaultDateTypeAdapter0.toString();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        StringReader stringReader0 = new StringReader("DefaultDateTypeAdapter(SimpleDateFormat)");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        defaultDateTypeAdapter0.read(jsonReader0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DateFormat dateFormat0 = MockDateFormat.getDateInstance();
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, dateFormat0, dateFormat0);
        PipedReader pipedReader0 = new PipedReader();
        JsonReader jsonReader0 = new JsonReader(pipedReader0);
        defaultDateTypeAdapter0.read(jsonReader0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, (String) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, " i");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, 123, 0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(1489, 1489);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, dateFormat0, dateFormat0);
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        java.sql.Date date0 = new java.sql.Date((-1L));
        defaultDateTypeAdapter0.write(jsonWriter0, (Date) date0);
        jsonWriter0.isLenient();
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        Class<Date> class0 = Date.class;
        DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, dateFormat0, dateFormat0);
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        defaultDateTypeAdapter0.fromJsonTree(jsonNull0);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        Class<Date> class0 = Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        defaultDateTypeAdapter0.write((JsonWriter) null, (Date) null);
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter((Class<? extends Date>) null);
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        StringWriter stringWriter0 = new StringWriter();
        BufferedWriter bufferedWriter0 = new BufferedWriter(stringWriter0, 86);
        JsonWriter jsonWriter0 = new JsonWriter(bufferedWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value("");
        MockDate mockDate0 = new MockDate(86, (-1179), 2937, 0, (-1179), 8233);
        defaultDateTypeAdapter0.write(jsonWriter1, (Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(0, 0);
        MockDate mockDate0 = new MockDate(0);
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree(mockDate0);
        Date date0 = defaultDateTypeAdapter0.fromJsonTree(jsonElement0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0);
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, dateFormat0, dateFormat0);
        MockDate mockDate0 = new MockDate(0);
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree(mockDate0);
        Date date0 = defaultDateTypeAdapter0.fromJsonTree(jsonElement0);
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, "");
        defaultDateTypeAdapter0.read((JsonReader) null);
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        Class<java.sql.Date> class0 = java.sql.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        String string0 = defaultDateTypeAdapter0.toString();
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        Class<Date> class0 = Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, 60000);
    }
}
