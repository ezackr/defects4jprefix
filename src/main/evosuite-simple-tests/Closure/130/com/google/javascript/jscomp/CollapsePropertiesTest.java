/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 06:18:48 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class CollapsePropertiesTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, true, true);
        Node node0 = Node.newNumber(1.0);
        collapseProperties0.process(node0, node0);
        assertTrue(node0.isNumber());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        CollapseProperties collapseProperties0 = new CollapseProperties((AbstractCompiler) null, false, false);
        Node node0 = Node.newNumber(1.0);
        collapseProperties0.process(node0, node0);
        assertFalse(node0.hasMoreThanOneChild());
    }
}
