/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 16:25:41 GMT 2023
 */
package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.junit.runner.RunWith;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
        Gson gson0 = new Gson();
        jsonAdapterAnnotationTypeAdapterFactory0.create(gson0, (TypeToken<Object>) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Class<Excluder> class0 = Excluder.class;
        JsonAdapter jsonAdapter0 = mock(JsonAdapter.class, new ViolatedAssumptionAnswer());
        doReturn(class0).when(jsonAdapter0).value();
        Gson gson0 = new Gson();
        JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter((ConstructorConstructor) null, gson0, (TypeToken<?>) null, jsonAdapter0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Gson gson0 = new Gson();
        Class<DateTypeAdapter> class0 = DateTypeAdapter.class;
        TypeToken<DateTypeAdapter> typeToken0 = TypeToken.get(class0);
        JsonAdapter jsonAdapter0 = mock(JsonAdapter.class, new ViolatedAssumptionAnswer());
        doReturn(class0).when(jsonAdapter0).value();
        JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter((ConstructorConstructor) null, gson0, typeToken0, jsonAdapter0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
        Gson gson0 = new Gson();
        Class<Integer> class0 = Integer.TYPE;
        TypeToken<Integer> typeToken0 = TypeToken.get(class0);
        TypeAdapter<Integer> typeAdapter0 = jsonAdapterAnnotationTypeAdapterFactory0.create(gson0, typeToken0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Gson gson0 = new Gson();
        Class<Integer> class0 = Integer.TYPE;
        TypeToken<Integer> typeToken0 = TypeToken.get(class0);
        JsonAdapter jsonAdapter0 = mock(JsonAdapter.class, new ViolatedAssumptionAnswer());
        doReturn(class0).when(jsonAdapter0).value();
        JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter((ConstructorConstructor) null, gson0, typeToken0, jsonAdapter0);
    }
}
