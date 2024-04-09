/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 16:12:29 GMT 2024
 */
package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.DefaultDateTypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.StringReader;
import java.sql.Date;
import java.sql.Timestamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DefaultDateTypeAdapter_ESTest extends DefaultDateTypeAdapter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, 0);
        String string0 = defaultDateTypeAdapter0.toString();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, "");
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        MockDate mockDate0 = new MockDate('r', 'r', 'r', 'r', 'r');
        Class<Date> class0 = Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree(mockDate0);
        java.util.Date date0 = defaultDateTypeAdapter0.fromJsonTree(jsonElement0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0, 0, 0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(0, 0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = null;
        defaultDateTypeAdapter0 = new DefaultDateTypeAdapter((Class<? extends java.util.Date>) null);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Class<Date> class0 = Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        MockFileWriter mockFileWriter0 = new MockFileWriter("DefaultDateTypeAdapter", true);
        JsonWriter jsonWriter0 = new JsonWriter(mockFileWriter0);
        defaultDateTypeAdapter0.write(jsonWriter0, (java.util.Date) null);
        jsonWriter0.getSerializeNulls();
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        StringReader stringReader0 = new StringReader("{3(Y4u");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        defaultDateTypeAdapter0.read(jsonReader0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        MockDate mockDate0 = new MockDate(0, 0, 0, 0, 41);
        Class<java.util.Date> class0 = java.util.Date.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree(mockDate0);
        java.util.Date date0 = defaultDateTypeAdapter0.fromJsonTree(jsonElement0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        Class<Timestamp> class0 = Timestamp.class;
        DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(class0);
        MockDate mockDate0 = new MockDate(407, 0, 0, 'r', 'r');
        JsonElement jsonElement0 = defaultDateTypeAdapter0.toJsonTree(mockDate0);
        java.util.Date date0 = defaultDateTypeAdapter0.fromJsonTree(jsonElement0);
        date0.toString();
    }
}
