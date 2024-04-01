/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:59:37 GMT 2023
 */
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Expression_ESTest extends Expression_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, (NodeTest) null);
        SelfContext selfContext0 = new SelfContext(ancestorContext0, (NodeTest) null);
        Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(selfContext0);
        // Undeclared exception!
        try {
            expression_ValueIterator0.next();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, (NodeTest) null);
        QName qName0 = new QName("ke1_bNO\"SvIaxG'S");
        Locale locale0 = Locale.ITALY;
        Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(descendantContext0, qName0, locale0);
        // Undeclared exception!
        try {
            expression_PointerIterator0.next();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Float float0 = new Float(2250.7079);
        Constant constant0 = new Constant(float0);
        NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
        boolean boolean0 = nameAttributeTest0.isContextDependent();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Expression[] expressionArray0 = new Expression[7];
        QName qName0 = new QName("", "");
        ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
        expressionArray0[1] = (Expression) extensionFunction0;
        boolean boolean0 = expressionArray0[1].computeContextDependent();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Expression[] expressionArray0 = new Expression[6];
        Short short0 = new Short((short) 46);
        Constant constant0 = new Constant(short0);
        expressionArray0[0] = (Expression) constant0;
        boolean boolean0 = expressionArray0[0].computeContextDependent();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Expression[] expressionArray0 = new Expression[4];
        CoreFunction coreFunction0 = new CoreFunction((-571), expressionArray0);
        CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNotEqual0, coreOperationNotEqual0);
        expressionArray0[3] = (Expression) coreOperationEqual0;
        Object object0 = expressionArray0[3].compute((EvalContext) null);
        assertEquals(true, object0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Expression[] expressionArray0 = new Expression[1];
        QName qName0 = new QName("No such function: ");
        ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(extensionFunction0, extensionFunction0);
        expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
        // Undeclared exception!
        try {
            coreOperationLessThanOrEqual0.iteratePointers((EvalContext) null);
            fail("Expecting exception: StackOverflowError");
        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
        AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
        // Undeclared exception!
        try {
            coreOperationOr0.iterate(ancestorContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.isContextDependent();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Expression[] expressionArray0 = new Expression[2];
        CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
        expressionArray0[1] = (Expression) coreOperationAnd0;
        EvalContext evalContext0 = null;
        // Undeclared exception!
        try {
            expressionArray0[1].computeValue(evalContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Expression[] expressionArray0 = new Expression[6];
        Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator");
        CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, constant0);
        // Undeclared exception!
        try {
            coreOperationEqual0.computeContextDependent();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
        AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, (NodeTest) null);
        // Undeclared exception!
        try {
            coreOperationGreaterThanOrEqual0.compute(attributeContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Double double0 = new Double(1.0);
        Constant constant0 = new Constant(double0);
        // Undeclared exception!
        try {
            constant0.iteratePointers((EvalContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Constant constant0 = new Constant("");
        CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
        boolean boolean0 = coreOperationNotEqual0.isContextDependent();
        boolean boolean1 = coreOperationNotEqual0.isContextDependent();
        assertTrue(boolean1 == boolean0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        QName qName0 = new QName("p07kjpqdwS&Z *");
        EvalContext[] evalContextArray0 = new EvalContext[8];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "substring-after($p07kjpqdwS&Z *, org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002 and org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003)");
        NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, nodeNameTest0);
        Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(namespaceContext0);
        // Undeclared exception!
        try {
            expression_ValueIterator0.hasNext();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, (NodeTest) null);
        SelfContext selfContext0 = new SelfContext(ancestorContext0, (NodeTest) null);
        Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(selfContext0);
        // Undeclared exception!
        try {
            expression_ValueIterator0.remove();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Expression[] expressionArray0 = new Expression[3];
        CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
        expressionArray0[0] = (Expression) coreFunction0;
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreFunction0, expressionArray0[0]);
        expressionArray0[1] = (Expression) coreOperationEqual0;
        CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[0], coreOperationOr0);
        Iterator iterator0 = coreOperationGreaterThan0.iterate((EvalContext) null);
        QName qName0 = new QName("gUYL!;'1WEJ");
        Locale locale0 = Locale.GERMANY;
        Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(iterator0, qName0, locale0);
        boolean boolean0 = expression_PointerIterator0.hasNext();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
        Locale locale0 = Locale.KOREA;
        Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator((Iterator) null, qName0, locale0);
        // Undeclared exception!
        try {
            expression_PointerIterator0.remove();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", e);
        }
    }
}
