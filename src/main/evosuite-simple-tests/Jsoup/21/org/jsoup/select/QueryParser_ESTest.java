/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:30:52 GMT 2023
 */
package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class QueryParser_ESTest extends QueryParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":eq(%d)");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("9*u>aGAo{70[:");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query 'aGAo{70[:]': unexpected token at '{70[:]'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":lt(");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("#");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":gt(");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":has(");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // :has(el) subselect must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("org.jsoup.select.StructuralEvaluator$Not");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query 'org.jsoup.select.StructuralEvaluator$Not': unexpected token at '$Not'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":not(selector) subselect must not be empty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("+[psu|+~dJ;");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("yNHZ,8[aOV04");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("b>xg~a`55}yQ6wa");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query 'a`55}yQ6wa': unexpected token at '`55}yQ6wa'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(",z r");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Unknown combinator: ,
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("ed~8m");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(",{s*=%s(]");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query '{s*=%s(])': unexpected token at '{s*=%s(])'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":contains(text) query must not be empty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":containsOwn(%s");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":matches(regex) query must not be empty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":matchesOwn(%s");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("2oQ|_p-qRK(KgW");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query '2oQ|_p-qRK(KgW': unexpected token at '(KgW'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s$=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[^%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%(=%]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s!=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s^=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s~=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s*=%s]");
        assertNotNull(evaluator0);
    }
}
