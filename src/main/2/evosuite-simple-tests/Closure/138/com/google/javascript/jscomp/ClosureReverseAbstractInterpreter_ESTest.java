/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 08:26:45 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.FlowScope;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ClosureReverseAbstractInterpreter_ESTest extends ClosureReverseAbstractInterpreter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(defaultCodingConvention0, (JSTypeRegistry) null);
        Node node0 = Node.newString("~<O3UX5xE+z,^<L");
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.firstPreciserScopeKnowingConditionOutcome(node0, (FlowScope) null, false);
        assertNull(flowScope0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        Node node0 = Node.newString("cub]B");
        Node node1 = new Node(37, node0);
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, (FlowScope) null, true);
        assertNull(flowScope0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        Node node0 = Node.newString("cub]B");
        Node node1 = new Node(37, node0);
        node1.addChildrenToBack(node1);
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, (FlowScope) null, true);
        assertNull(flowScope0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        Node node0 = Node.newString("cub]B");
        Node node1 = new Node(37, node0);
        node0.setType(33);
        Node node2 = new Node(38, 39, 2);
        node1.addChildrenToBack(node2);
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        // Undeclared exception!
        try {
            closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, (FlowScope) null, true);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // NAME 39 is not a string node
            //
            verifyException("com.google.javascript.rhino.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        Node node0 = Node.newString("cub]B");
        Node node1 = new Node(37, node0);
        node0.setType(33);
        node1.addChildrenToBack(node1);
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, (FlowScope) null, false);
        assertNull(flowScope0);
    }
}
