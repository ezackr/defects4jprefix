/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:15:57 GMT 2023
 */
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CoreOperationRelationalExpression_ESTest extends CoreOperationRelationalExpression_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Constant constant0 = new Constant((String) null);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, constant0);
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, coreOperationLessThanOrEqual0);
        Object object0 = coreOperationGreaterThanOrEqual0.computeValue((EvalContext) null);
        assertEquals(true, object0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Expression[] expressionArray0 = new Expression[0];
        CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, coreOperationUnion0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
        // Undeclared exception!
        try {
            coreOperationLessThan0.computeValue((EvalContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Constant constant0 = new Constant("");
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1644));
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationGreaterThanOrEqual0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, coreOperationLessThan0);
        Expression[] expressionArray0 = new Expression[0];
        coreOperationGreaterThan0.args = expressionArray0;
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationLessThan0);
        ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
        // Undeclared exception!
        try {
            coreOperationLessThanOrEqual0.computeValue(parentContext0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Constant constant0 = new Constant("#>pk#&dKo@NH$");
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationGreaterThanOrEqual0, coreOperationEqual0);
        UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
        Object object0 = coreOperationGreaterThan0.computeValue(unionContext0);
        assertEquals(false, object0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Double double0 = new Double((-952.0));
        Constant constant0 = new Constant(double0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThan0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, coreOperationEqual0);
        Object object0 = coreOperationGreaterThan0.computeValue((EvalContext) null);
        assertEquals(false, object0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Double double0 = new Double((-952.0));
        Constant constant0 = new Constant(double0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
        boolean boolean0 = coreOperationLessThan0.isSymmetric();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Double double0 = new Double((-952.0));
        Constant constant0 = new Constant(double0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
        int int0 = coreOperationLessThan0.getPrecedence();
        assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        Constant constant0 = new Constant("");
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
        RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
        Object object0 = coreOperationGreaterThanOrEqual0.computeValue(rootContext0);
        assertEquals(true, object0);
    }
}
