/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 15:55:00 GMT 2024
 */
package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Gson gson0 = new Gson();
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0);
        jsonElement0.isJsonPrimitive();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Gson gson0 = new Gson();
        String string0 = gson0.toString();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Locale> class0 = Locale.class;
        TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<? extends Locale>) class0, (TypeAdapter<? super Locale>) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<JsonObject> class0 = JsonObject.class;
        TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<JsonObject>) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<BitSet> class0 = BitSet.class;
        TypeToken<BitSet> typeToken0 = TypeToken.get(class0);
        TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<BitSet>) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Gson gson0 = new Gson();
        Short short0 = new Short((short) 758);
        JsonPrimitive jsonPrimitive0 = (JsonPrimitive) gson0.toJsonTree((Object) short0);
        jsonPrimitive0.isNumber();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Gson gson0 = new Gson();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
        String string0 = gson0.toJson((Object) jsonElement0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Gson gson0 = new Gson();
        Class<Byte> class0 = Byte.TYPE;
        JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
        Class<JsonNull> class1 = JsonNull.class;
        JsonNull jsonNull0 = gson0.fromJson(jsonElement0, class1);
        jsonNull0.isJsonArray();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Gson gson0 = new Gson();
        Class<AtomicBoolean> class0 = AtomicBoolean.class;
        gson0.fromJson("O%u[fO", class0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Gson gson0 = new Gson();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        String string0 = gson0.toJson((Object) atomicBoolean0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Gson gson0 = new Gson();
        Class<AtomicInteger> class0 = AtomicInteger.class;
        gson0.fromJson("{^j)i8^2={E2IF,", class0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Gson gson0 = new Gson();
        AtomicInteger atomicInteger0 = new AtomicInteger((-1425));
        String string0 = gson0.toJson((Object) atomicInteger0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Gson gson0 = new Gson();
        Locale locale0 = Locale.US;
        Currency currency0 = Currency.getInstance(locale0);
        JsonElement jsonElement0 = gson0.toJsonTree((Object) currency0);
        jsonElement0.isJsonNull();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Gson gson0 = new Gson();
        Class<Currency> class0 = Currency.class;
        gson0.fromJson("NLCLnCKqR&", class0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<String> class0 = String.class;
        Gson gson0 = new Gson();
        gson0.toJsonTree((Object) class0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Gson gson0 = new Gson();
        BitSet bitSet0 = new BitSet();
        bitSet0.set(31);
        JsonArray jsonArray0 = (JsonArray) gson0.toJsonTree((Object) bitSet0);
        jsonArray0.size();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Gson gson0 = new Gson();
        Class<Boolean> class0 = Boolean.TYPE;
        gson0.fromJson("v/'", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        Gson gson0 = new Gson();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
        AtomicBoolean atomicBoolean0 = gson0.fromJson(jsonElement0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Class<Boolean> class0 = Boolean.TYPE;
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Gson gson0 = new Gson();
        URL uRL0 = MockURL.getFileExample();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) uRL0);
        Class<Byte> class0 = Byte.TYPE;
        gson0.fromJson(jsonElement0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Gson gson0 = new Gson();
        Class<Byte> class0 = Byte.class;
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        Byte byte0 = gson0.fromJson((JsonElement) jsonNull0, class0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Gson gson0 = new Gson();
        Class<Short> class0 = Short.TYPE;
        gson0.fromJson("d#ar*/6gZ?5Gv^", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Gson gson0 = new Gson();
        Class<Short> class0 = Short.TYPE;
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        AtomicBoolean atomicBoolean0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Class<Integer> class0 = Integer.TYPE;
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Gson gson0 = new Gson();
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        Class<Integer> class0 = Integer.TYPE;
        Integer integer0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Gson gson0 = new Gson();
        AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(458);
        JsonArray jsonArray0 = (JsonArray) gson0.toJsonTree((Object) atomicIntegerArray0);
        jsonArray0.size();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Class<Long> class0 = Long.TYPE;
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Gson gson0 = new Gson();
        Class<Long> class0 = Long.TYPE;
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        AtomicBoolean atomicBoolean0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Gson gson0 = new Gson();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
        Class<Character> class0 = Character.TYPE;
        AtomicBoolean atomicBoolean0 = gson0.fromJson(jsonElement0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        StringReader stringReader0 = new StringReader("H}u&");
        Gson gson0 = new Gson();
        Class<Character> class0 = Character.class;
        gson0.fromJson((Reader) stringReader0, class0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Gson gson0 = new Gson();
        Class<Character> class0 = Character.TYPE;
        gson0.fromJson("\"00000000-0100-4000-8200-000003000000\"", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Gson gson0 = new Gson();
        Character character0 = Character.valueOf('G');
        JsonElement jsonElement0 = gson0.toJsonTree((Object) character0);
        jsonElement0.isJsonPrimitive();
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Gson gson0 = new Gson();
        Class<Character> class0 = Character.TYPE;
        gson0.toJson((Object) null, (Type) class0, (Appendable) null);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        Class<String> class0 = String.class;
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Gson gson0 = new Gson();
        Class<String> class0 = String.class;
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        AtomicBoolean atomicBoolean0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Gson gson0 = new Gson();
        Class<StringBuilder> class0 = StringBuilder.class;
        gson0.fromJson("{w1ZBuz!XZS\"4H0Hq@", class0);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Gson gson0 = new Gson();
        Class<StringBuilder> class0 = StringBuilder.class;
        StringBuilder stringBuilder0 = gson0.fromJson("null", class0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        StringBuilder stringBuilder0 = new StringBuilder();
        Gson gson0 = new Gson();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuilder0);
        jsonElement0.isJsonPrimitive();
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        Gson gson0 = new Gson();
        Class<StringBuffer> class0 = StringBuffer.class;
        gson0.fromJson("ugk[#Ch<", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        Gson gson0 = new Gson();
        StringBuffer stringBuffer0 = new StringBuffer();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
        jsonElement0.isJsonNull();
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        Gson gson0 = new Gson();
        Class<URL> class0 = URL.class;
        gson0.fromJson("qwSF", class0);
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        Class<URI> class0 = URI.class;
        Gson gson0 = new Gson();
        StringReader stringReader0 = new StringReader("os*:Zc");
        gson0.fromJson((Reader) stringReader0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        Gson gson0 = new Gson();
        URI uRI0 = MockURI.aHttpURI;
        JsonElement jsonElement0 = gson0.toJsonTree((Object) uRI0);
        jsonElement0.isJsonPrimitive();
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        Gson gson0 = new Gson();
        Class<InetAddress> class0 = InetAddress.class;
        Inet4Address inet4Address0 = (Inet4Address) gson0.fromJson("_", class0);
        inet4Address0.isMCLinkLocal();
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        Gson gson0 = new Gson();
        StringReader stringReader0 = new StringReader("null");
        Class<InetAddress> class0 = InetAddress.class;
        InetAddress inetAddress0 = gson0.fromJson((Reader) stringReader0, class0);
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        Gson gson0 = new Gson();
        Class<UUID> class0 = UUID.class;
        UUID uUID0 = gson0.fromJson("e", class0);
        uUID0.toString();
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        Gson gson0 = new Gson();
        Class<UUID> class0 = UUID.class;
        UUID uUID0 = gson0.fromJson("null", class0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        Gson gson0 = new Gson();
        UUID uUID0 = MockUUID.randomUUID();
        String string0 = gson0.toJson((Object) uUID0);
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        Gson gson0 = new Gson();
        Class<Calendar> class0 = Calendar.class;
        gson0.fromJson("NZSnJ*afZ12@U(", class0);
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        Gson gson0 = new Gson();
        Class<GregorianCalendar> class0 = GregorianCalendar.class;
        gson0.fromJson("{^8)i8^2Q{E2IF,", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        Gson gson0 = new Gson();
        Class<Locale> class0 = Locale.class;
        Locale locale0 = gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$17", class0);
        locale0.getISO3Country();
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        Gson gson0 = new Gson();
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        String string0 = gson0.toJson((Object) locale0);
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        Gson gson0 = new Gson();
        Class<JsonPrimitive> class0 = JsonPrimitive.class;
        JsonArray jsonArray0 = new JsonArray();
        Boolean boolean0 = new Boolean("DB5Zfx.VSd5PZ2");
        jsonArray0.add(boolean0);
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        Gson gson0 = new Gson();
        Class<JsonPrimitive> class0 = JsonPrimitive.class;
        JsonPrimitive jsonPrimitive0 = gson0.fromJson("Expected", class0);
        jsonPrimitive0.isJsonPrimitive();
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        Excluder excluder0 = Excluder.DEFAULT;
        Gson gson0 = new Gson();
        Class<JsonPrimitive> class0 = JsonPrimitive.class;
        JsonElement jsonElement0 = gson0.toJsonTree((Object) excluder0);
        gson0.fromJson(jsonElement0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        Gson gson0 = new Gson();
        String string0 = gson0.toJson((JsonElement) null);
    }
}
