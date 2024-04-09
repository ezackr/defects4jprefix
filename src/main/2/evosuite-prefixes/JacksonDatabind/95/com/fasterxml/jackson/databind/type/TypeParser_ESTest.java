/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:56:30 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeParser_ESTest extends TypeParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        typeParser0.parse("[I,?IB#,");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        TypeFactory typeFactory1 = typeFactory0.withClassLoader(classLoader0);
        typeFactory1.equals((Object) typeFactory0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeParser typeParser1 = typeParser0.withFactory(typeFactory0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        JavaType javaType0 = typeParser0.parse("com.fasterxml.jackson.databind.type.TypeParser");
        javaType0.isInterface();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        typeParser0.parse("");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TypeParser.MyTokenizer typeParser_MyTokenizer0 = new TypeParser.MyTokenizer("<");
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        typeParser_MyTokenizer0.pushBack("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        typeParser0.parseType(typeParser_MyTokenizer0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeParser.MyTokenizer typeParser_MyTokenizer0 = new TypeParser.MyTokenizer("com.fasterxml.jackson.databind.DeserializationConfig");
        typeParser0.parseTypes(typeParser_MyTokenizer0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeParser.MyTokenizer typeParser_MyTokenizer0 = new TypeParser.MyTokenizer("com.fasterxml.jackson.databind.DeserializationConfig");
        typeParser_MyTokenizer0.pushBack("com.fasterxml.jackson.databind.DeserializationConfig");
        typeParser0.parseTypes(typeParser_MyTokenizer0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser.MyTokenizer typeParser_MyTokenizer0 = new TypeParser.MyTokenizer(">");
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        typeParser_MyTokenizer0.pushBack("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer");
        typeParser0.parseTypes(typeParser_MyTokenizer0);
        typeParser_MyTokenizer0.getRemainingInput();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        TypeParser.MyTokenizer typeParser_MyTokenizer0 = new TypeParser.MyTokenizer(",S");
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        typeParser_MyTokenizer0.pushBack("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        typeParser0.parseTypes(typeParser_MyTokenizer0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        TypeParser typeParser0 = new TypeParser((TypeFactory) null);
        typeParser0.parse("LF{|YqZ");
    }
}
