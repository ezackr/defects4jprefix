/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 10:42:09 GMT 2024
 */
package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class UnionContext_ESTest extends UnionContext_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "VswYb");
        ChildContext childContext0 = new ChildContext(initialContext0, nodeNameTest0, false, false);
        EvalContext[] evalContextArray0 = new EvalContext[2];
        UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
        int int0 = unionContext0.getDocumentOrder();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, (NodeTest) null);
        AttributeContext attributeContext0 = new AttributeContext(ancestorContext0, (NodeTest) null);
        DescendantContext descendantContext0 = new DescendantContext(attributeContext0, false, (NodeTest) null);
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext(descendantContext0, evalContextArray0);
        unionContext0.setPosition(2);
        unionContext0.next();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        InitialContext initialContext1 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "VswYb");
        ChildContext childContext0 = new ChildContext(initialContext1, nodeNameTest0, false, false);
        EvalContext[] evalContextArray0 = new EvalContext[2];
        UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
        evalContextArray0[0] = (EvalContext) initialContext1;
        evalContextArray0[1] = (EvalContext) initialContext0;
        unionContext0.setPosition(1081);
        unionContext0.getPosition();
    }
}
