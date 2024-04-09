/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 15:44:14 GMT 2024
 */
package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonElement;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonTreeWriter_ESTest extends JsonTreeWriter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        JsonWriter jsonWriter0 = jsonTreeWriter0.name("-");
        jsonWriter0.endArray();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.getSerializeNulls();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.value(false);
        jsonWriter0.isLenient();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.value(0L);
        jsonWriter0.isHtmlSafe();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) null);
        jsonWriter0.getSerializeNulls();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginArray();
        jsonTreeWriter0.get();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.jsonValue("JjOwc*Y-~%a");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonElement jsonElement0 = jsonTreeWriter0.get();
        jsonElement0.isJsonNull();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        JsonWriter jsonWriter0 = jsonTreeWriter0.name("com.google.gson.internal.bind.JsonTreeWriter$1");
        JsonWriter jsonWriter1 = jsonTreeWriter0.nullValue();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
        jsonWriter0.name("8^iD66");
        JsonWriter jsonWriter1 = jsonTreeWriter0.value("8^iD66");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setSerializeNulls(false);
        jsonTreeWriter0.name("com.google.gson.internal.bind.JsonTreeWriter$1");
        JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
        jsonWriter0.isHtmlSafe();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginArray();
        JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
        jsonWriter0.getSerializeNulls();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        jsonTreeWriter0.nullValue();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        jsonTreeWriter0.endArray();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.endArray();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
        JsonWriter jsonWriter1 = jsonWriter0.endArray();
        jsonWriter1.isLenient();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
        JsonWriter jsonWriter1 = jsonTreeWriter0.endObject();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.endObject();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        JsonWriter jsonWriter0 = jsonTreeWriter0.name("Incomplete document");
        jsonWriter0.endObject();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginArray();
        jsonTreeWriter0.endObject();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.name("Fy|otfVvSk6Q5Y~;r");
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginObject();
        JsonWriter jsonWriter0 = jsonTreeWriter0.name("-");
        jsonWriter0.name("-");
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.beginArray();
        jsonTreeWriter0.name("Fy|otfVvSk6Q5Y~;r");
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.value((String) null);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.setLenient(true);
        JsonWriter jsonWriter0 = jsonTreeWriter0.value(1712.5936);
        jsonWriter0.isLenient();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        JsonWriter jsonWriter0 = jsonTreeWriter0.value(1712.5936);
        jsonWriter0.isHtmlSafe();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        Double double0 = new Double((-4488.750997864898));
        JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) double0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.setLenient(true);
        Integer integer0 = new Integer((-1040));
        JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) integer0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        Double double0 = Double.valueOf("NaN");
        jsonTreeWriter0.value((Number) double0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        Float float0 = Float.valueOf("-Infinity");
        jsonTreeWriter0.value((Number) float0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        jsonTreeWriter0.close();
        jsonTreeWriter0.close();
    }
}
