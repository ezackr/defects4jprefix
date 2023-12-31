/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 02:22:59 GMT 2023
 */
package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.debugging.sourcemap.SourceMapConsumerV3;
import com.google.debugging.sourcemap.proto.Mapping;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.JSONObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SourceMapConsumerV3_ESTest extends SourceMapConsumerV3_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
        try {
            sourceMapConsumerV3_0.parse("com.google.protobuf.FieldSet");
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // JSON parse exception: org.evosuite.runtime.mock.java.lang.MockThrowable: A JSONObject text must begin with '{' at character 1
            //
            verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
        JSONObject jSONObject0 = new JSONObject();
        try {
            sourceMapConsumerV3_0.parse(jSONObject0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // JSON parse exception: org.evosuite.runtime.mock.java.lang.MockThrowable: JSONObject[\"version\"] not found.
            //
            verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
        JSONObject jSONObject0 = null;
        try {
            jSONObject0 = new JSONObject(sourceMapConsumerV3_0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // java.lang.reflect.InvocationTargetException
            //
            verifyException("org.json.JSONObject", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SourceMapConsumerV3.DefaultSourceMapSupplier sourceMapConsumerV3_DefaultSourceMapSupplier0 = new SourceMapConsumerV3.DefaultSourceMapSupplier();
        String string0 = sourceMapConsumerV3_DefaultSourceMapSupplier0.getSourceMap("'uhsZfnd<-{UF+THH#@");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
        Mapping.OriginalMapping mapping_OriginalMapping0 = sourceMapConsumerV3_0.getMappingForLine((-580), (-580));
        assertNull(mapping_OriginalMapping0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
        // Undeclared exception!
        try {
            sourceMapConsumerV3_0.getMappingForLine(5225, 5225);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
        // Undeclared exception!
        try {
            sourceMapConsumerV3_0.getReverseMapping("", (-3779), (-3779));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
        }
    }
}
