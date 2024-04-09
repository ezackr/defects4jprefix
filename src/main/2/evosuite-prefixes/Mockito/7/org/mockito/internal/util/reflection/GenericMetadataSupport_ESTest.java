/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:33:27 GMT 2024
 */
package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class GenericMetadataSupport_ESTest extends GenericMetadataSupport_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Type[] typeArray0 = new Type[2];
        TypeVariable<Method> typeVariable0 = (TypeVariable<Method>) mock(TypeVariable.class, new ViolatedAssumptionAnswer());
        doReturn((Object) typeArray0, (Object) null).when(typeVariable0).getBounds();
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType0 = new GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        GenericMetadataSupport.inferFrom(genericMetadataSupport_TypeVarBoundedType0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType0 = new GenericMetadataSupport.TypeVarBoundedType((TypeVariable) null);
        TypeVariable typeVariable0 = genericMetadataSupport_TypeVarBoundedType0.typeVariable();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        Type[] typeArray0 = genericMetadataSupport_WildCardBoundedType0.interfaceBounds();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(wildcardType0).toString();
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        WildcardType wildcardType1 = genericMetadataSupport_WildCardBoundedType0.wildCard();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType0 = new GenericMetadataSupport.TypeVarBoundedType((TypeVariable) null);
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType1 = new GenericMetadataSupport.TypeVarBoundedType((TypeVariable) null);
        genericMetadataSupport_TypeVarBoundedType0.equals(genericMetadataSupport_TypeVarBoundedType1);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType0 = new GenericMetadataSupport.TypeVarBoundedType((TypeVariable) null);
        boolean boolean0 = genericMetadataSupport_TypeVarBoundedType0.equals(genericMetadataSupport_TypeVarBoundedType0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType0 = new GenericMetadataSupport.TypeVarBoundedType((TypeVariable) null);
        boolean boolean0 = genericMetadataSupport_TypeVarBoundedType0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        GenericMetadataSupport.TypeVarBoundedType genericMetadataSupport_TypeVarBoundedType0 = new GenericMetadataSupport.TypeVarBoundedType((TypeVariable) null);
        Object object0 = new Object();
        boolean boolean0 = genericMetadataSupport_TypeVarBoundedType0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Type[] typeArray0 = new Type[0];
        WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        doReturn(typeArray0).when(wildcardType0).getLowerBounds();
        doReturn(typeArray0).when(wildcardType0).getUpperBounds();
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        GenericMetadataSupport.inferFrom(genericMetadataSupport_WildCardBoundedType0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Type[] typeArray0 = new Type[1];
        WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        doReturn((Type[]) null).when(wildcardType0).getLowerBounds();
        doReturn((Type[]) null).when(wildcardType0).getUpperBounds();
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        GenericMetadataSupport.inferFrom(genericMetadataSupport_WildCardBoundedType0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        WildcardType wildcardType1 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType1 = new GenericMetadataSupport.WildCardBoundedType(wildcardType1);
        genericMetadataSupport_WildCardBoundedType0.equals(genericMetadataSupport_WildCardBoundedType1);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        boolean boolean0 = genericMetadataSupport_WildCardBoundedType0.equals(genericMetadataSupport_WildCardBoundedType0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType((WildcardType) null);
        boolean boolean0 = genericMetadataSupport_WildCardBoundedType0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType((WildcardType) null);
        boolean boolean0 = genericMetadataSupport_WildCardBoundedType0.equals("nk|VSM)|9@8f=");
    }
}
