/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:39:12 GMT 2023
 */
package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class AttributeContext_ESTest extends AttributeContext_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) nodeNameTest0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        attributeContext0.setPosition(1214);
        attributeContext0.getCurrentNodePointer();
        assertEquals(4, attributeContext0.getPosition());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        QName qName0 = new QName("dDx");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
        AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
        // Undeclared exception!
        try {
            attributeContext0.setPosition(23);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.axes.AttributeContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BasicNodeSet basicNodeSet0 = new BasicNodeSet();
        NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
        QName qName0 = new QName("oGlT-kLAKW");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "oGlT-kLAKW");
        AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
        attributeContext0.getSingleNodePointer();
        // Undeclared exception!
        try {
            attributeContext0.setPosition(4171);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) null);
        QName qName0 = new QName("Z};iUF%%4x~;E`kN+h", "Z};iUF%%4x~;E`kN+h");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Z};iUF%%4x~;E`kN+h");
        BasicVariables basicVariables0 = new BasicVariables();
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
        InitialContext initialContext0 = (InitialContext) rootContext0.getConstantContext(variablePointer0);
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        // Undeclared exception!
        try {
            attributeContext0.setPosition(115);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // No such variable: 'Z};iUF%%4x~;E`kN+h:Z};iUF%%4x~;E`kN+h'
            //
            verifyException("org.apache.commons.jxpath.BasicVariables", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) fileSystemHandling0);
        QName qName0 = new QName("");
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        VariableReference variableReference0 = new VariableReference(qName0);
        CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
        Expression[] expressionArray0 = new Expression[7];
        Step[] stepArray0 = new Step[6];
        ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
        PredicateContext predicateContext0 = new PredicateContext(initialContext0, expressionPath0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        AttributeContext attributeContext0 = new AttributeContext(predicateContext0, nodeNameTest0);
        // Undeclared exception!
        try {
            attributeContext0.nextNode();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Undefined variable:
            //
            verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) null);
        QName qName0 = new QName("Z};iUF%%4x~;E`kN+h", "Z};iUF%%4x~;E`kN+h");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
        EvalContext[] evalContextArray0 = new EvalContext[8];
        evalContextArray0[0] = (EvalContext) rootContext0;
        UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
        AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
        // Undeclared exception!
        try {
            attributeContext0.nextNode();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        QName qName0 = new QName("", "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
        unionContext0.getCurrentNodePointer();
        // Undeclared exception!
        try {
            attributeContext0.nextNode();
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) null);
        QName qName0 = new QName("Z};iUF%%4x~;E`kN+h", "Z};iUF%%4x~;E`kN+h");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Z};iUF%%4x~;E`kN+h");
        BasicVariables basicVariables0 = new BasicVariables();
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
        InitialContext initialContext0 = (InitialContext) rootContext0.getConstantContext(variablePointer0);
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        // Undeclared exception!
        try {
            attributeContext0.nextNode();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // No such variable: 'Z};iUF%%4x~;E`kN+h:Z};iUF%%4x~;E`kN+h'
            //
            verifyException("org.apache.commons.jxpath.BasicVariables", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) nodeNameTest0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        attributeContext0.setPosition(1214);
        boolean boolean0 = attributeContext0.nextNode();
        assertEquals(5, attributeContext0.getPosition());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) nodeNameTest0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        attributeContext0.setPosition(1214);
        boolean boolean0 = attributeContext0.nextNode();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) nodeNameTest0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        boolean boolean0 = attributeContext0.nextNode();
        assertEquals(1, attributeContext0.getPosition());
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) nodeNameTest0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        boolean boolean0 = attributeContext0.nextNode();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        QName qName0 = new QName("", "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
        // Undeclared exception!
        try {
            attributeContext0.nextNode();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.axes.AttributeContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) nodeNameTest0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
        attributeContext0.reset();
        assertEquals(0, attributeContext0.getPosition());
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(521);
        AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
        attributeContext0.nextNode();
        boolean boolean0 = attributeContext0.nextNode();
        assertEquals(2, attributeContext0.getPosition());
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(521);
        AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
        attributeContext0.nextNode();
        boolean boolean0 = attributeContext0.nextNode();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        QName qName0 = new QName("", "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
        boolean boolean0 = attributeContext0.setPosition(0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        QName qName0 = new QName("", "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
        boolean boolean0 = attributeContext0.setPosition((-39));
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        QName qName0 = new QName("", "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
        NodePointer nodePointer0 = attributeContext0.getCurrentNodePointer();
        assertNull(nodePointer0);
    }
}
