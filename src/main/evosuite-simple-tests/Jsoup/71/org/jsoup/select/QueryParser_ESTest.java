/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 06:13:10 GMT 2023
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
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("Ya~pm*");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":containsData(");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Did not find balanced marker at ''
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":lt(");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(">D.P0,4#-Us>+M%r`_");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query '4#-Us': unexpected token at 'Us'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":gt(");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":has(el) subselect must not be empty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":not(selector) subselect must not be empty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":contains(texI)qWerymust not be emty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(",DU k~PbAFo>5L7,WsGd");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("ygv+o-Stn,qOPl");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("hy~u~:nth-child(n)");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // No match found
            //
            verifyException("java.util.regex.Matcher", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse("Znv,Qda@[{Zs");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Did not find balanced marker at '{Zs'
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("*|~pre");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s~=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":containsOwn(%s)");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":matches(regex) query must not be empty");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":matchesOwn(%s)");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":nth-last-child(");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse nth-index '': unexpected format
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":nth-of-type(");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse nth-index '': unexpected format
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(":nth-last-of-type(");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse nth-index '': unexpected format
            //
            verifyException("org.jsoup.select.QueryParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":first-child");
        assertEquals(":first-child", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":last-child");
        assertEquals(":last-child", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":first-of-type");
        assertEquals(":first-of-type", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":last-of-type");
        assertEquals(":last-of-type", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":only-child");
        assertEquals(":only-child", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":only-of-type");
        assertEquals(":only-of-type", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":empty");
        assertEquals(":empty", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse(":root");
        assertEquals(":root", evaluator0.toString());
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("r|");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[^-a-zA-Z0-9_:.]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("option[selected]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s!=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s^=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s$=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("[%s*=%s]");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        Evaluator evaluator0 = QueryParser.parse("8 t>:nth-child(eVEn)");
        assertNotNull(evaluator0);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        // Undeclared exception!
        try {
            QueryParser.parse(">:nth-child(0)");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // No match found
            //
            verifyException("java.util.regex.Matcher", e);
        }
    }
}
