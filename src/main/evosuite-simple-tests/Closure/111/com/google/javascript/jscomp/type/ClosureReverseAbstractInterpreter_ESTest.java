/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 05:24:29 GMT 2023
 */
package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
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
        Node node0 = new Node(1283, 1283, 1283);
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node0, (FlowScope) null, false);
        assertNull(flowScope0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
        Node node1 = new Node(37, node0, node0, node0, 4095, 52);
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node1, (FlowScope) null, true);
        assertNull(flowScope0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Node node0 = Node.newString("API tried to add two incompatible type tags. This should have been blocked and emitted a warning.");
        Node node1 = Node.newString(54, "API tried to add two incompatible type tags. This should have been blocked and emitted a warning.", 0, 43);
        Node node2 = new Node(37, node1, node1, node0, 4095, 52);
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, (JSTypeRegistry) null);
        FlowScope flowScope0 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node2, (FlowScope) null, true);
        assertNull(flowScope0);
    }
}
