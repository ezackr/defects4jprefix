/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 15:22:30 GMT 2024
 */
package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.TypeInfoFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeInfoFactory_ESTest extends TypeInfoFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        TypeInfoFactory.getTypeInfoForArray((Type) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        TypeInfoFactory.getTypeInfoForField((Field) null, (Type) null);
    }
}
