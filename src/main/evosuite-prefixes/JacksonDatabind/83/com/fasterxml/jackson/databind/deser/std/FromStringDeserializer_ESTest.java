/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 23:14:01 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.time.chrono.ChronoLocalDate;
import java.util.Currency;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FromStringDeserializer_ESTest extends FromStringDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<InetAddress> class0 = InetAddress.class;
        Inet4Address inet4Address0 = (Inet4Address) objectMapper0.convertValue((Object) class0, class0);
        inet4Address0.isLinkLocalAddress();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        POJONode pOJONode0 = new POJONode(objectMapper0);
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(pOJONode0);
        JsonParserSequence jsonParserSequence0 = JsonParserSequence.createFlattened(true, jsonParser0, jsonParser0);
        jsonParserSequence0.nextFieldName();
        UUIDDeserializer uUIDDeserializer0 = new UUIDDeserializer();
        uUIDDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 0);
        Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<?>[] classArray0 = FromStringDeserializer.types();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<File> class0 = File.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<URL> class0 = URL.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<URI> class0 = URI.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
        URI uRI0 = (URI) fromStringDeserializer_Std0._deserializeFromEmptyString();
        uRI0.getHost();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null);
        LongNode longNode0 = new LongNode(138L);
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(longNode0);
        JsonParserSequence jsonParserSequence0 = JsonParserSequence.createFlattened(false, jsonParser0, jsonParser0);
        Class<MapType> class0 = MapType.class;
        jsonParserSequence0.readValueAs(class0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<Currency> class0 = Currency.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<Pattern> class0 = Pattern.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<Locale> class0 = Locale.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<Charset> class0 = Charset.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<TimeZone> class0 = TimeZone.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Class<StringBuilder> class0 = StringBuilder.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
        Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse();
        UUIDDeserializer uUIDDeserializer0 = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence0 = JsonParserSequence.createFlattened(true, jsonParser0, jsonParser0);
        jsonParserSequence0.nextFieldName();
        uUIDDeserializer0.deserialize((JsonParser) jsonParserSequence0, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        StdTypeResolverBuilder stdTypeResolverBuilder0 = StdTypeResolverBuilder.noTypeInfoBuilder();
        Class<InetAddress> class0 = InetAddress.class;
        objectMapper0.convertValue((Object) stdTypeResolverBuilder0, class0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        POJONode pOJONode0 = new POJONode((Object) null);
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(pOJONode0);
        JsonParserSequence jsonParserSequence0 = JsonParserSequence.createFlattened(true, jsonParser0, jsonParser0);
        jsonParserSequence0.nextFieldName();
        UUIDDeserializer uUIDDeserializer0 = new UUIDDeserializer();
        UUID uUID0 = uUIDDeserializer0.deserialize((JsonParser) jsonParserSequence0, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Class<Charset> class0 = Charset.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 1);
        MockFile mockFile0 = (MockFile) fromStringDeserializer_Std0._deserialize("[Bx6dO9](V[U|<*m,", defaultDeserializationContext_Impl0);
        mockFile0.isAbsolute();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 2);
        fromStringDeserializer_Std0._deserialize("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 3);
        URI uRI0 = (URI) fromStringDeserializer_Std0._deserialize("w+EthAlhgGPj5(S", (DeserializationContext) null);
        uRI0.getRawUserInfo();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<String> class0 = String.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 4);
        fromStringDeserializer_Std0._deserialize("}", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<CollectionType> class0 = CollectionType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 5);
        fromStringDeserializer_Std0._deserialize(">%ZgZ72ij\"`", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Class<MapType> class0 = MapType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 6);
        fromStringDeserializer_Std0._deserialize("[Bx6O9](V[U]|*m,", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 7);
        fromStringDeserializer_Std0._deserialize("[RT9Q83z:fh0$.6D_!", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<URL> class0 = URL.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Object object0 = fromStringDeserializer_Std0._deserialize("MODIFIED-FOR-URL", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Class<URI> class0 = URI.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 9);
        fromStringDeserializer_Std0._deserialize("[Bx6dO9](V[U|<*m,", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 10);
        ZoneInfo zoneInfo0 = (ZoneInfo) fromStringDeserializer_Std0._deserialize("JKS", (DeserializationContext) null);
        zoneInfo0.getID();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<MapLikeType> class0 = MapLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        fromStringDeserializer_Std0._deserialize("[B`6dO9]{V[U|:*m,", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Class<Charset> class0 = Charset.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 13);
        Object object0 = fromStringDeserializer_Std0._deserialize("a0QWjhrdtlr2ksrZ+", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, (-2816));
        fromStringDeserializer_Std0._deserialize("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Class<Charset> class0 = Charset.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Locale locale0 = (Locale) fromStringDeserializer_Std0._deserialize("[[[Bx6O]V[U]|*m,", defaultDeserializationContext_Impl0);
        locale0.getLanguage();
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<URL> class0 = URL.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Locale locale0 = (Locale) fromStringDeserializer_Std0._deserialize("RT9Q83z:fh0$.6D_!", defaultDeserializationContext_Impl0);
        locale0.toString();
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<URL> class0 = URL.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Locale locale0 = (Locale) fromStringDeserializer_Std0._deserialize("RT9Q83z:fh0$.6D_!", defaultDeserializationContext_Impl0);
        locale0.getCountry();
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        Class<Charset> class0 = Charset.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        Object object0 = fromStringDeserializer_Std0._deserialize("]D~?", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test3536() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        fromStringDeserializer_Std0._deserialize("[", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test3637() throws Throwable {
        Class<Charset> class0 = Charset.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        Object object0 = fromStringDeserializer_Std0._deserialize("[Bx6dO9](V[U|<*m,", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test3738() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<Currency> class0 = Currency.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        MockInetSocketAddress mockInetSocketAddress0 = (MockInetSocketAddress) fromStringDeserializer_Std0._deserialize("uXe:{:),", defaultDeserializationContext_Impl0);
        mockInetSocketAddress0.isUnresolved();
    }

    @Test(timeout = 4000)
    public void test3839() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<File> class0 = File.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        fromStringDeserializer_Std0._deserialize("RqT9Q83z:fh$.6D_!", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test3940() throws Throwable {
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
        object0.toString();
    }
}
