/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:08:29 GMT 2024
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
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
        UUIDDeserializer uUIDDeserializer0 = new UUIDDeserializer();
        uUIDDeserializer0._deserializeEmbedded("p^H", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<CollectionType> class0 = CollectionType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 33);
        Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<?>[] classArray0 = FromStringDeserializer.types();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
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
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(class0);
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
        fromStringDeserializer_Std0.isCachable();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<Charset> class0 = Charset.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
        fromStringDeserializer_Std0.isCachable();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<TimeZone> class0 = TimeZone.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<InetAddress> class0 = InetAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0);
        JsonParser jsonParser0 = arrayNode0.traverse();
        Class<SimpleType> class0 = SimpleType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, (-68703773));
        fromStringDeserializer_Std0.deserialize(jsonParser0, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 1);
        MockFile mockFile0 = (MockFile) fromStringDeserializer_Std0._deserialize(", problem: ", defaultDeserializationContext_Impl0);
        mockFile0.canWrite();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Class<MapType> class0 = MapType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        fromStringDeserializer_Std0._deserialize("[Ej7:3qVfj~lzS", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 2);
        fromStringDeserializer_Std0._deserialize("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 3);
        URI uRI0 = (URI) fromStringDeserializer_Std0._deserialize("com.fasterxml.jackson.databind.node.BigIntegerNode", defaultDeserializationContext_Impl0);
        uRI0.getHost();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 4);
        fromStringDeserializer_Std0._deserialize("p^H", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 5);
        fromStringDeserializer_Std0._deserialize("[", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 6);
        fromStringDeserializer_Std0._deserialize("['), but ", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 7);
        fromStringDeserializer_Std0._deserialize((String) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Object object0 = fromStringDeserializer_Std0._deserialize("I#>k_xB.8L3[", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Class<MapLikeType> class0 = MapLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 9);
        fromStringDeserializer_Std0._deserialize((String) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Class<ReferenceType> class0 = ReferenceType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 10);
        ZoneInfo zoneInfo0 = (ZoneInfo) fromStringDeserializer_Std0._deserialize("e_PeVD[~", (DeserializationContext) null);
        zoneInfo0.getID();
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Class<MapLikeType> class0 = MapLikeType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 11);
        Inet4Address inet4Address0 = (Inet4Address) fromStringDeserializer_Std0._deserialize("FCED0-5l)tL[OLK-", (DeserializationContext) null);
        inet4Address0.isLoopbackAddress();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Class<Currency> class0 = Currency.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, (-3));
        fromStringDeserializer_Std0._deserialize("/kt_C6[(\"y*Y3(s|#}", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Locale locale0 = (Locale) fromStringDeserializer_Std0._deserialize("[LyHt", defaultDeserializationContext_Impl0);
        locale0.getLanguage();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
        Object object0 = fromStringDeserializer_Std0._deserialize("USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Class<MapType> class0 = MapType.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        MockInetSocketAddress mockInetSocketAddress0 = (MockInetSocketAddress) fromStringDeserializer_Std0._deserialize("FQk/u'Bv~(If#Xu", (DeserializationContext) null);
        mockInetSocketAddress0.isUnresolved();
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        MockInetSocketAddress mockInetSocketAddress0 = (MockInetSocketAddress) fromStringDeserializer_Std0._deserialize("[]oYY)FWAA}SU%b5h6", defaultDeserializationContext_Impl0);
        mockInetSocketAddress0.getHostString();
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        Object object0 = fromStringDeserializer_Std0._deserialize(":83F :Ou`E", defaultDeserializationContext_Impl0);
        object0.toString();
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
        fromStringDeserializer_Std0._deserialize(":", defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Class<Currency> class0 = Currency.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 3);
        URI uRI0 = (URI) fromStringDeserializer_Std0._deserializeFromEmptyString();
        uRI0.getPort();
    }
}
