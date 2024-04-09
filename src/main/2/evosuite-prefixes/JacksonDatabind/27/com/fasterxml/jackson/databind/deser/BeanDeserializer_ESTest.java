/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:28:12 GMT 2024
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanDeserializer_ESTest extends BeanDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        NameTransformer nameTransformer0 = NameTransformer.simpleTransformer("6nSc]#/K$i", "No ObjectCodec defined");
        NameTransformer nameTransformer1 = NameTransformer.chainedTransformer(nameTransformer0, nameTransformer0);
        BeanDeserializer beanDeserializer0 = null;
        beanDeserializer0 = new BeanDeserializer((BeanDeserializerBase) null, nameTransformer1);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        BeanDeserializer beanDeserializer0 = null;
        beanDeserializer0 = new BeanDeserializer((BeanDeserializerBase) null, linkedHashSet0);
    }
}
