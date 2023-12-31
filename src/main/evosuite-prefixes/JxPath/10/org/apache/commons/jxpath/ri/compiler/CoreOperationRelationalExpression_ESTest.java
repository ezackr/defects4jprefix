/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:21:43 GMT 2023
 */
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CoreOperationRelationalExpression_ESTest extends CoreOperationRelationalExpression_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Double double0 = new Double((-952.0));
        Constant constant0 = new Constant(double0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
        boolean boolean0 = coreOperationLessThan0.isSymmetric();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Constant constant0 = new Constant("oAaP?Ft1Zu");
        CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, coreOperationDivide0);
        int int0 = coreOperationLessThan0.getPrecedence();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Expression[] expressionArray0 = new Expression[0];
        CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, coreOperationUnion0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
        coreOperationLessThan0.computeValue((EvalContext) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Expression[] expressionArray0 = new Expression[0];
        CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAnd0, coreOperationAnd0);
        coreOperationLessThan0.args = expressionArray0;
        coreOperationLessThan0.computeValue((EvalContext) null);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Constant constant0 = new Constant("B?EQl^#+fqO#G\u0000?(:^");
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
        RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationGreaterThanOrEqual0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, coreOperationLessThan0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationLessThan0);
        Iterator iterator0 = coreOperationLessThanOrEqual0.iterate(rootContext0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        QName qName0 = new QName("0E+AF", "W12i:jw}a=");
        VariableReference variableReference0 = new VariableReference(qName0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(variableReference0, variableReference0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, variableReference0);
        Locale locale0 = Locale.CANADA;
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreOperationLessThanOrEqual0, nodePointer0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
        EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
        Object object0 = coreOperationLessThan0.compute(evalContext0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        QName qName0 = new QName("0E+AF", "W12i:jw}a=");
        VariableReference variableReference0 = new VariableReference(qName0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(variableReference0, variableReference0);
        Locale locale0 = Locale.CANADA;
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreOperationLessThanOrEqual0, nodePointer0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(variableReference0, coreOperationLessThanOrEqual0);
        Object object0 = coreOperationGreaterThanOrEqual0.computeValue(rootContext0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        Constant constant0 = new Constant((String) null);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, constant0);
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, coreOperationLessThanOrEqual0);
        Object object0 = coreOperationGreaterThanOrEqual0.computeValue((EvalContext) null);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        Constant constant0 = new Constant("");
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
        RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationGreaterThanOrEqual0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, coreOperationLessThan0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationLessThan0);
        Object object0 = coreOperationLessThanOrEqual0.compute(rootContext0);
    }
}
