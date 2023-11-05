/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 22:54:53 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import java.util.LinkedHashSet;
import org.junit.runner.RunWith;

public class BuilderBasedDeserializerTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(49);
        BuilderBasedDeserializer builderBasedDeserializer0 = null;
        try {
            builderBasedDeserializer0 = new BuilderBasedDeserializer((BuilderBasedDeserializer) null, linkedHashSet0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BuilderBasedDeserializer builderBasedDeserializer0 = null;
        try {
            builderBasedDeserializer0 = new BuilderBasedDeserializer((BuilderBasedDeserializer) null, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
