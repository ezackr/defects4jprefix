/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 21:31:54 GMT 2023
 */
package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.sql.BatchUpdateException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransactionRollbackException;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonMappingException_ESTest extends JsonMappingException_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        jsonMappingException_Reference0.setIndex(63);
        assertEquals(63, jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        Object object0 = jsonMappingException_Reference0.getFrom();
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        Object object0 = jsonMappingException_Reference0.getFrom();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference();
        jsonMappingException_Reference0.setFieldName((String) null);
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, (Object) sQLIntegrityConstraintViolationException0, 11);
        String string0 = jsonMappingException0._buildMessage();
        assertEquals("(was java.sql.SQLIntegrityConstraintViolationException) (through reference chain: java.sql.SQLIntegrityConstraintViolationException[11])", string0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        jsonMappingException_Reference0.setDescription("");
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(bufferRecycler0);
        jsonMappingException_Reference0.getFieldName();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(defaultDeserializationContext_Impl0);
        int int0 = jsonMappingException_Reference0.getIndex();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference();
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        String string0 = jsonMappingException0.getPathReference();
        assertEquals("UNKNOWN[?]", string0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference();
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        String string0 = jsonMappingException0.getPathReference();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        jsonMappingException0.prependPath((Object) jsonMappingException_Reference0, 46);
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException jsonMappingException0 = new JsonMappingException("17%\"A.", (JsonLocation) null, sQLIntegrityConstraintViolationException0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Object[] objectArray0 = new Object[0];
        JsonMappingException jsonMappingException0 = defaultSerializerProvider_Impl0.mappingException("", objectArray0);
        assertNotNull(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        // Undeclared exception!
        try {
            JsonMappingException.from((DeserializationContext) null, (String) null, (Throwable) jsonMappingException0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonMappingException jsonMappingException0 = JsonMappingException.from((DeserializationContext) defaultDeserializationContext_Impl0, "/&5T#mvQ");
        assertNotNull(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonMappingException jsonMappingException0 = JsonMappingException.from((SerializerProvider) defaultSerializerProvider_Impl0, "f7?UIA6{k");
        Object object0 = jsonMappingException0.getProcessor();
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException("", "", sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.from((JsonGenerator) null, "", (Throwable) sQLTimeoutException0);
        sQLIntegrityConstraintViolationException0.addSuppressed(jsonMappingException0);
        sQLIntegrityConstraintViolationException0.printStackTrace();
        assertNull(sQLIntegrityConstraintViolationException0.getSQLState());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonMappingException jsonMappingException0 = JsonMappingException.from((SerializerProvider) defaultSerializerProvider_Impl0, "", (Throwable) sQLIntegrityConstraintViolationException0);
        assertNotNull(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        String string0 = jsonMappingException0.toString();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        String string0 = jsonMappingException0.toString();
        assertEquals("com.fasterxml.jackson.databind.JsonMappingException: (was java.sql.SQLIntegrityConstraintViolationException) (through reference chain: java.sql.SQLIntegrityConstraintViolationException[?])", string0);
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        jsonMappingException0.prependPath((Object) jsonMappingException_Reference0, ">On[.OET");
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, (Object) null, "Can not pass null fieldName");
        assertNotNull(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        JsonMappingException jsonMappingException0 = new JsonMappingException("z`<M", (JsonLocation) null);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        JsonLocation jsonLocation0 = new JsonLocation("0SEW x@'eK&^kn$V&", 0L, 30, 658);
        JsonMappingException jsonMappingException0 = new JsonMappingException((Closeable) null, "0SEW x@'eK&^kn$V&", jsonLocation0);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
        NullNode nullNode0 = jsonNodeFactory0.nullNode();
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(nullNode0);
        JsonMappingException jsonMappingException0 = JsonMappingException.from(jsonParser0, "\"#xP5/K>U*[=;nX&I%O");
        assertNotNull(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        jsonMappingException0.getLocalizedMessage();
        String string0 = jsonMappingException0._buildMessage();
        assertEquals("(was java.sql.SQLIntegrityConstraintViolationException) (through reference chain: java.sql.SQLIntegrityConstraintViolationException[?])", string0);
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        jsonMappingException0.getLocalizedMessage();
        String string0 = jsonMappingException0._buildMessage();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference();
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        JsonMappingException.fromUnexpectedIOE(jsonMappingException0);
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0, "3,ynRJtf'^MvMA\"]!>E");
        JsonMappingException.Reference jsonMappingException_Reference1 = null;
        try {
            jsonMappingException_Reference1 = new JsonMappingException.Reference(jsonMappingException_Reference0, (String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // Can not pass null fieldName
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        Class<FilterOutputStream> class0 = FilterOutputStream.class;
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(class0, "UNKNOWN[?]");
        JsonMappingException.Reference jsonMappingException_Reference1 = (JsonMappingException.Reference) jsonMappingException_Reference0.writeReplace();
        assertEquals((-1), jsonMappingException_Reference1.getIndex());
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        JsonParserSequence jsonParserSequence0 = JsonParserSequence.createFlattened(false, (JsonParser) null, (JsonParser) null);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate(jsonParserSequence0, tokenFilter0, false, false);
        BatchUpdateException batchUpdateException0 = new BatchUpdateException();
        // Undeclared exception!
        try {
            JsonMappingException.from((JsonParser) filteringParserDelegate0, "", (Throwable) batchUpdateException0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.util.JsonParserDelegate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        JsonMappingException jsonMappingException1 = JsonMappingException.wrapWithPath((Throwable) jsonMappingException0, jsonMappingException_Reference0);
        String string0 = jsonMappingException1._buildMessage();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        JsonMappingException jsonMappingException1 = JsonMappingException.wrapWithPath((Throwable) jsonMappingException0, jsonMappingException_Reference0);
        String string0 = jsonMappingException1._buildMessage();
        assertEquals("(was java.sql.SQLIntegrityConstraintViolationException) (through reference chain: java.sql.SQLIntegrityConstraintViolationException[?]->java.sql.SQLIntegrityConstraintViolationException[?])", string0);
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException("", "any", 1);
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLRecoverableException0);
        JsonMappingException.wrapWithPath((Throwable) sQLRecoverableException0, jsonMappingException_Reference0);
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException1 = new SQLIntegrityConstraintViolationException(sQLIntegrityConstraintViolationException0);
        JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException1, jsonMappingException_Reference0);
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        List<JsonMappingException.Reference> list0 = jsonMappingException0.getPath();
        assertTrue(list0.contains(jsonMappingException_Reference0));
    }

    @Test(timeout = 4000)
    public void test3036() throws Throwable {
        SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
        JsonMappingException.Reference jsonMappingException_Reference0 = new JsonMappingException.Reference(sQLIntegrityConstraintViolationException0);
        JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLIntegrityConstraintViolationException0, jsonMappingException_Reference0);
        List<JsonMappingException.Reference> list0 = jsonMappingException0.getPath();
        assertEquals((-1), jsonMappingException_Reference0.getIndex());
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException((String) null, "K$J");
        JsonMappingException jsonMappingException0 = new JsonMappingException((String) null, sQLTransactionRollbackException0);
        List<JsonMappingException.Reference> list0 = jsonMappingException0.getPath();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test3238() throws Throwable {
        JsonMappingException jsonMappingException0 = new JsonMappingException((String) null);
        jsonMappingException0._appendPathDesc((StringBuilder) null);
    }
}
