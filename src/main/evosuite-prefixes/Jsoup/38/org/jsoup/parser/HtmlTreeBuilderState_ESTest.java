/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:33:50 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class HtmlTreeBuilderState_ESTest extends HtmlTreeBuilderState_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        HtmlTreeBuilderState[] htmlTreeBuilderStateArray0 = HtmlTreeBuilderState.values();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        HtmlTreeBuilderState.valueOf("AfterAfterFrameset");
    }
}
