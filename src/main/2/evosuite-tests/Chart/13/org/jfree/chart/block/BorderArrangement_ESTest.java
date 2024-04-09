/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 21:11:15 GMT 2024
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.text.AttributedCharacterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 8.292359831009149);
      assertEquals(8.292359831009149, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      Range range0 = new Range(0.0, 0.0);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, range0, lengthConstraintType0, 0.0, range0, lengthConstraintType1);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      RectangleConstraint rectangleConstraint1 = rectangleConstraint0.toFixedHeight(Double.NEGATIVE_INFINITY);
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 2362.19551276);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Range range0 = new Range((-1767.158166739011), (-1767.158166739011));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Range range0 = new Range((-1767.27), (-1767.27));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Range range0 = new Range((-1767.27), (-1767.27));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, (Object) null);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(false);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(range0, range0);
      Size2D size2D0 = borderArrangement0.arrange(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.LANGUAGE;
      boolean boolean0 = borderArrangement0.equals(attributedCharacterIterator_Attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement1.equals(borderArrangement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement1.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer(borderArrangement1);
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      borderArrangement1.add(blockContainer0, (Object) null);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }
}
