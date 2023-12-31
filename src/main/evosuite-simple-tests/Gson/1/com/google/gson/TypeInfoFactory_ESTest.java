/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 16:16:49 GMT 2023
 */
package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.GenericArrayTypeImpl;
import com.google.gson.ParameterizedTypeImpl;
import com.google.gson.TypeInfoFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TypeInfoFactory_ESTest extends TypeInfoFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl((Type) null);
        // Undeclared exception!
        try {
            TypeInfoFactory.getTypeInfoForArray(genericArrayTypeImpl0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
            //
            verifyException("com.google.gson.TypeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(type0).toString();
        Type[] typeArray0 = new Type[4];
        ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(type0, typeArray0, (Type) null);
        GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(parameterizedTypeImpl0);
        // Undeclared exception!
        try {
            TypeInfoFactory.getTypeInfoForField((Field) null, genericArrayTypeImpl0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.
            //
            verifyException("com.google.gson.TypeUtils", e);
        }
    }
}
