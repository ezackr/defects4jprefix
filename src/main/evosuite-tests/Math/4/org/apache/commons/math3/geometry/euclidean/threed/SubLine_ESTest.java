/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:45:18 GMT 2023
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(291.5, vector3D0, (-397.80643760046), vector3D0, 1.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertEquals((-4.904884955916964E-15), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(4420.3, 1.0, 4420.3);
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertEquals(0.9999998976408995, vector3D2.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNotSame(vector3D1, vector3D2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNotSame(vector3D0, vector3D2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      // Undeclared exception!
      try { 
        subLine0.intersection((SubLine) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(291.5, vector3D0, 291.5, vector3D0, 291.5, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      Vector1D vector1D0 = Vector1D.NaN;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
      SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint(orientedPoint0, intervalsSet0);
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(subOrientedPoint0);
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine1 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.intersection(subLine1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-2448.464), (-2448.464));
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew((BSPTree<Euclidean1D>) null);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.getSegments();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-2448.464), (-2448.464));
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>("n5D`yg^|E7HA");
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      // Undeclared exception!
      try { 
        subLine0.getSegments();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine((Vector3D) null, (Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine((Segment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.SubLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Line line0 = new Line(vector3D0, vector3D1);
      Segment segment0 = new Segment(vector3D1, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine1, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine1.intersection(subLine0, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine1, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine1.intersection(subLine0, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Segment segment0 = new Segment(vector3D0, vector3D0, (Line) null);
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine(segment0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      SubLine subLine0 = null;
      try {
        subLine0 = new SubLine(vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }
}
