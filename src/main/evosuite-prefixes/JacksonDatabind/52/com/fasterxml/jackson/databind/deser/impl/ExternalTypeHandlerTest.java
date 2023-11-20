/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:46:25 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.LinkedList;
import org.junit.runner.RunWith;

public class ExternalTypeHandlerTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(collectionType0, typeFactory0);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(collectionType0, classNameIdResolver0, "string", true, collectionType0);
        externalTypeHandler_Builder0.addExternal((SettableBeanProperty) null, asPropertyTypeDeserializer0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ExternalTypeHandler externalTypeHandler0 = null;
        externalTypeHandler0 = new ExternalTypeHandler((ExternalTypeHandler) null);
    }
}
