/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 15:46:57 GMT 2024
 */
package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
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
        Locale locale0 = new Locale("{JmVH$e%nC`wO", "{JmVH$e%nC`wO");
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0);
        Class<Calendar> class0 = Calendar.class;
        gson0.fromJson(jsonElement0, class0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        Gson gson0 = new Gson();
        TypeAdapter<Boolean> typeAdapter0 = TypeAdapters.BOOLEAN_AS_STRING;
        TypeAdapterRuntimeTypeWrapper<Boolean> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Boolean>(gson0, typeAdapter0, class0);
        TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<? extends Boolean>) class0, (TypeAdapter<? super Boolean>) typeAdapterRuntimeTypeWrapper0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Character> class0 = Character.class;
        TypeAdapter<Character> typeAdapter0 = TypeAdapters.CHARACTER;
        TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, typeAdapter0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<Object> class0 = Object.class;
        TypeToken<Object> typeToken0 = TypeToken.get(class0);
        Gson gson0 = new Gson();
        TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(typeToken0);
        TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, typeAdapter0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Gson gson0 = new Gson();
        ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
        Short short0 = new Short((short) (-5024));
        JsonElement jsonElement0 = objectTypeAdapter0.toJsonTree(short0);
        jsonElement0.isJsonArray();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Gson gson0 = new Gson();
        InetAddress inetAddress0 = MockInetAddress.getLocalHost();
        JsonPrimitive jsonPrimitive0 = (JsonPrimitive) gson0.toJsonTree((Object) inetAddress0);
        jsonPrimitive0.isBoolean();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Gson gson0 = new Gson();
        Byte byte0 = new Byte((byte) (-56));
        String string0 = gson0.toJson((Object) byte0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Gson gson0 = new Gson();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicBoolean0);
        jsonElement0.isJsonPrimitive();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Gson gson0 = new Gson();
        AtomicInteger atomicInteger0 = new AtomicInteger((-1452996919));
        JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicInteger0);
        jsonElement0.isJsonArray();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Gson gson0 = new Gson();
        ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        Currency currency0 = Currency.getInstance(locale0);
        String string0 = objectTypeAdapter0.toJson((Object) currency0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Gson gson0 = new Gson();
        Class<Currency> class0 = Currency.class;
        TypeToken<Currency> typeToken0 = TypeToken.get(class0);
        Type type0 = typeToken0.getType();
        gson0.fromJson("[", type0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Gson gson0 = new Gson();
        URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
        gson0.toJson((Object) uRLStreamHandler0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Class<BitSet> class0 = BitSet.class;
        BitSet bitSet0 = gson0.fromJson((JsonElement) jsonArray0, class0);
        bitSet0.length();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Gson gson0 = new Gson();
        Class<BitSet> class0 = BitSet.class;
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        BitSet bitSet0 = gson0.fromJson((JsonElement) jsonNull0, class0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Character character0 = new Character('_');
        jsonArray0.add(character0);
        Class<BitSet> class0 = BitSet.class;
        gson0.fromJson((JsonElement) jsonArray0, class0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Class<BitSet> class0 = BitSet.class;
        jsonArray0.add((Character) null);
        gson0.fromJson((JsonElement) jsonArray0, class0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Gson gson0 = new Gson();
        BitSet bitSet0 = new BitSet();
        bitSet0.flip(6);
        String string0 = gson0.toJson((Object) bitSet0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Gson gson0 = new Gson();
        Class<Boolean> class0 = Boolean.TYPE;
        gson0.fromJson("U?Q}~Nf$%", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Gson gson0 = new Gson();
        Class<Boolean> class0 = Boolean.TYPE;
        Calendar calendar0 = gson0.fromJson("null", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Gson gson0 = new Gson();
        Class<Boolean> class0 = Boolean.TYPE;
        gson0.fromJson("{JmVH$e%nC`wO", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Gson gson0 = new Gson();
        Class<Byte> class0 = Byte.TYPE;
        gson0.fromJson(" G%", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Gson gson0 = new Gson();
        Class<Short> class0 = Short.TYPE;
        gson0.fromJson("G%", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Gson gson0 = new Gson();
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        Class<Short> class0 = Short.class;
        Short short0 = gson0.fromJson((JsonElement) jsonNull0, class0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Gson gson0 = new Gson();
        Class<Integer> class0 = Integer.TYPE;
        gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$33", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Gson gson0 = new Gson();
        AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(3);
        String string0 = gson0.toJson((Object) atomicIntegerArray0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Gson gson0 = new Gson();
        Class<Long> class0 = Long.TYPE;
        gson0.fromJson("8gWk%L!<", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Gson gson0 = new Gson();
        Class<Character> class0 = Character.TYPE;
        gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$33", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Gson gson0 = new Gson();
        Class<Character> class0 = Character.TYPE;
        gson0.fromJson("T/Z2fpwV+WCh)|T", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Gson gson0 = new Gson();
        Character character0 = new Character('V');
        String string0 = gson0.toJson((Object) character0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        Gson gson0 = new Gson();
        Class<String> class0 = String.class;
        gson0.fromJson("4LDa[:L.", class0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Gson gson0 = new Gson();
        StringBuilder stringBuilder0 = new StringBuilder();
        ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
        String string0 = objectTypeAdapter0.toJson((Object) stringBuilder0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Gson gson0 = new Gson();
        JsonObject jsonObject0 = new JsonObject();
        Class<StringBuffer> class0 = StringBuffer.class;
        gson0.fromJson((JsonElement) jsonObject0, class0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Gson gson0 = new Gson();
        StringBuffer stringBuffer0 = new StringBuffer();
        String string0 = gson0.toJson((Object) stringBuffer0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        Gson gson0 = new Gson();
        Class<URL> class0 = URL.class;
        gson0.fromJson("CfFXsB^\"8LV(r>7GO", class0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Gson gson0 = new Gson();
        StringReader stringReader0 = new StringReader("null");
        Class<URL> class0 = URL.class;
        URL uRL0 = gson0.fromJson((Reader) stringReader0, class0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Gson gson0 = new Gson();
        ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
        URL uRL0 = MockURL.getHttpExample();
        JsonPrimitive jsonPrimitive0 = (JsonPrimitive) objectTypeAdapter0.toJsonTree(uRL0);
        jsonPrimitive0.isBoolean();
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Gson gson0 = new Gson();
        Class<URI> class0 = URI.class;
        gson0.fromJson("V>]r,F", class0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        Gson gson0 = new Gson();
        Class<URI> class0 = URI.class;
        URI uRI0 = gson0.fromJson("null", class0);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        Gson gson0 = new Gson();
        URI uRI0 = MockURI.aFTPURI;
        JsonElement jsonElement0 = gson0.toJsonTree((Object) uRI0);
        jsonElement0.isJsonNull();
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        Gson gson0 = new Gson();
        Class<InetAddress> class0 = InetAddress.class;
        Inet4Address inet4Address0 = (Inet4Address) gson0.fromJson("com.google.gson.internal.Streams$AppendableWriter$CurrentWrite", class0);
        inet4Address0.isMCLinkLocal();
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        Gson gson0 = new Gson();
        JsonArray jsonArray0 = new JsonArray();
        Class<UUID> class0 = UUID.class;
        gson0.fromJson((JsonElement) jsonArray0, class0);
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        Gson gson0 = new Gson();
        JsonNull jsonNull0 = JsonNull.INSTANCE;
        Class<UUID> class0 = UUID.class;
        UUID uUID0 = gson0.fromJson((JsonElement) jsonNull0, class0);
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        Gson gson0 = new Gson();
        ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
        UUID uUID0 = MockUUID.randomUUID();
        String string0 = objectTypeAdapter0.toJson((Object) uUID0);
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        Gson gson0 = new Gson();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
        Class<Calendar> class0 = Calendar.class;
        Calendar calendar0 = gson0.fromJson(jsonElement0, class0);
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        Gson gson0 = new Gson();
        JsonObject jsonObject0 = new JsonObject();
        Class<Calendar> class0 = Calendar.class;
        Calendar calendar0 = gson0.fromJson((JsonElement) jsonObject0, class0);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        Gson gson0 = new Gson();
        Class<Locale> class0 = Locale.class;
        Locale locale0 = gson0.fromJson("PyCd2FzY2ny*b*3k", class0);
        String string0 = gson0.toJson((Object) locale0);
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        Gson gson0 = new Gson();
        Class<JsonObject> class0 = JsonObject.class;
        gson0.fromJson("4[", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        Gson gson0 = new Gson();
        Class<JsonObject> class0 = JsonObject.class;
        gson0.fromJson("[", (Type) class0);
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        Gson gson0 = new Gson();
        Class<JsonObject> class0 = JsonObject.class;
        String string0 = gson0.toString();
        gson0.fromJson(string0, (Type) class0);
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        Gson gson0 = new Gson();
        JsonObject jsonObject0 = new JsonObject();
        Class<JsonArray> class0 = JsonArray.class;
        gson0.fromJson((JsonElement) jsonObject0, class0);
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        Gson gson0 = new Gson();
        String string0 = gson0.toJson((JsonElement) null);
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        Gson gson0 = new Gson();
        Double double0 = new Double(0.0);
        JsonElement jsonElement0 = gson0.toJsonTree((Object) double0);
        String string0 = gson0.toJson((Object) jsonElement0);
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        Gson gson0 = new Gson();
        ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
        Boolean boolean0 = Boolean.TRUE;
        JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
        String string0 = objectTypeAdapter0.toJson((Object) jsonPrimitive0);
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        Character character0 = new Character('k');
        jsonArray0.add(character0);
        jsonArray0.getAsJsonObject();
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        Gson gson0 = new Gson();
        JsonObject jsonObject0 = new JsonObject();
        jsonObject0.addProperty("com.google.gson.internal.$Gson$Types", (Character) null);
        String string0 = gson0.toJson((Object) jsonObject0);
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        Gson gson0 = new Gson();
        JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
        jsonElement0.isJsonNull();
    }

    @Test(timeout = 4000)
    public void test5656() throws Throwable {
        Gson gson0 = new Gson();
        Class<GregorianCalendar> class0 = GregorianCalendar.class;
        TypeToken<GregorianCalendar> typeToken0 = TypeToken.get(class0);
        TypeAdapter<GregorianCalendar> typeAdapter0 = gson0.getAdapter(typeToken0);
    }
}
