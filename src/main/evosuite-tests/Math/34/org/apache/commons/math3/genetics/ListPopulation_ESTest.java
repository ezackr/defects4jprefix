/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 13:39:32 GMT 2023
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.apache.commons.math3.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListPopulation_ESTest extends ListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((-323), (-323));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3542, 0.21449066);
      elitisticListPopulation0.toString();
      int int0 = (-1108);
      elitisticListPopulation0.setPopulationLimit((-1108));
      double double0 = 0.9;
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setElitismRate(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 3535, 3535);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation0.addChromosome((Chromosome) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.addChromosomes(linkedList0);
      Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
      // Undeclared exception!
      try { 
        linkedList0.add(chromosome0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      linkedList0.offer((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1, 1);
      elitisticListPopulation0.toString();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.getChromosomes();
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation1.iterator();
      elitisticListPopulation1.addChromosome((Chromosome) null);
      elitisticListPopulation1.addChromosomes(linkedList0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 3227;
      double double0 = 0.9;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3227, 0.9);
      elitisticListPopulation0.setChromosomes((List<Chromosome>) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      linkedList0.add((Chromosome) null);
      elitisticListPopulation0.setChromosomes(linkedList0);
      elitisticListPopulation0.getPopulationSize();
      // Undeclared exception!
      try { 
        elitisticListPopulation0.iterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      elitisticListPopulation0.setPopulationLimit(1499);
      linkedList0.add((Chromosome) null);
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.setChromosomes(linkedList0);
      elitisticListPopulation0.setPopulationLimit(1);
      LinkedList<Chromosome> linkedList1 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      // Undeclared exception!
      try { 
        elitisticListPopulation1.setChromosomes(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation0.getFittestChromosome();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((-279), (-279));
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomeList();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(184, 0.0);
      elitisticListPopulation0.getChromosomes();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 189, (-212.6545));
      elitisticListPopulation0.getChromosomes();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(925, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setChromosomes(list0);
      elitisticListPopulation0.getFittestChromosome();
      elitisticListPopulation0.setChromosomes(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = 0.0;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(298, 0.0);
      elitisticListPopulation0.getFittestChromosome();
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getFittestChromosome();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      elitisticListPopulation0.addChromosomes(linkedList0);
      elitisticListPopulation0.toString();
      elitisticListPopulation0.nextGeneration();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2312, 0.0);
      elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.toString();
      Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
      elitisticListPopulation0.addChromosome(chromosome0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomes();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 372, 0.0);
      elitisticListPopulation0.iterator();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(29, 0.0);
      elitisticListPopulation0.setPopulationLimit((-3288));
      elitisticListPopulation0.getFittestChromosome();
      elitisticListPopulation0.getPopulationSize();
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3545, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      elitisticListPopulation0.setElitismRate(0.0);
      elitisticListPopulation0.getElitismRate();
      List<Chromosome> list1 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list1);
      elitisticListPopulation0.getElitismRate();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation0.toString();
      elitisticListPopulation0.addChromosomes(list1);
      elitisticListPopulation0.getChromosomeList();
      int int0 = (-1108);
      elitisticListPopulation0.setPopulationLimit((-1108));
      elitisticListPopulation0.setPopulationLimit(int0);
      double double0 = 0.9;
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(415, 0.0);
      elitisticListPopulation0.setPopulationLimit(415);
      Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
      elitisticListPopulation0.addChromosome(chromosome0);
      LinkedList<Chromosome> linkedList0 = null;
      try {
        linkedList0 = new LinkedList<Chromosome>();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3153, 0.0);
      elitisticListPopulation0.getPopulationLimit();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      int int1 = 0;
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setPopulationLimit(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2983, 0.0);
      elitisticListPopulation0.addChromosomes((Collection<Chromosome>) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 3236;
      double double0 = 0.9;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3236, 0.9);
      elitisticListPopulation0.setChromosomes((List<Chromosome>) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 345, 1.0);
      elitisticListPopulation0.getPopulationSize();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      List<Chromosome> list1 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation0.setPopulationLimit(1);
      int int0 = new Integer(1);
      Population population0 = elitisticListPopulation0.nextGeneration();
      elitisticListPopulation0.getPopulationLimit();
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation0.setChromosomes(list1);
      population0.addChromosome((Chromosome) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      Integer integer0 = new Integer(1);
      elitisticListPopulation0.getPopulationLimit();
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation0.setChromosomes(list0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation0.setChromosomes(list0);
      elitisticListPopulation0.setChromosomes(list0);
      elitisticListPopulation0.getElitismRate();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      List<Chromosome> list1 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation0.setPopulationLimit(1);
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      elitisticListPopulation0.spliterator();
      elitisticListPopulation0.getPopulationLimit();
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation1.addChromosome((Chromosome) null);
      elitisticListPopulation1.getChromosomeList();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      List<Chromosome> list1 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation0.setPopulationLimit(1);
      Integer integer0 = new Integer(1);
      Population population0 = elitisticListPopulation0.nextGeneration();
      elitisticListPopulation0.getPopulationLimit();
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation0.setChromosomes(list1);
      population0.addChromosome((Chromosome) null);
      elitisticListPopulation0.getElitismRate();
      elitisticListPopulation0.getChromosomeList();
      population0.getPopulationSize();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      List<Chromosome> list1 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setPopulationLimit(1);
      Integer integer0 = new Integer(1);
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      elitisticListPopulation0.getPopulationLimit();
      elitisticListPopulation0.nextGeneration();
      elitisticListPopulation1.setChromosomes(list1);
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation1.addChromosome((Chromosome) null);
      elitisticListPopulation1.addChromosomes(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      elitisticListPopulation0.addChromosomes(list0);
      List<Chromosome> list1 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setChromosomes(list1);
      elitisticListPopulation0.setPopulationLimit(1);
      Integer integer0 = new Integer(1);
      Population population0 = elitisticListPopulation0.nextGeneration();
      int int0 = new Integer(1);
      elitisticListPopulation0.getPopulationSize();
      elitisticListPopulation0.setChromosomes(list1);
      population0.addChromosome((Chromosome) null);
      elitisticListPopulation0.getChromosomes();
      population0.addChromosome((Chromosome) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.addChromosomes(linkedList0);
      elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setPopulationLimit(1);
      Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
      // Undeclared exception!
      try { 
        linkedList0.add(chromosome0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.addChromosomes(linkedList0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      elitisticListPopulation0.getChromosomes();
      linkedList0.add((Chromosome) null);
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.setPopulationLimit(1);
      LinkedList<Chromosome> linkedList1 = new LinkedList<Chromosome>();
      linkedList0.addAll((Collection<? extends Chromosome>) linkedList1);
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      elitisticListPopulation1.setChromosomes(linkedList0);
      elitisticListPopulation0.getPopulationSize();
      // Undeclared exception!
      try { 
        elitisticListPopulation1.iterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      elitisticListPopulation0.setPopulationLimit(1512);
      linkedList0.add((Chromosome) null);
      linkedList0.offer((Chromosome) null);
      elitisticListPopulation0.setChromosomes(linkedList0);
      elitisticListPopulation0.setPopulationLimit(1);
      LinkedList<Chromosome> linkedList1 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      // Undeclared exception!
      try { 
        elitisticListPopulation1.setChromosomes(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      linkedList0.offer((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1, 0.0);
      elitisticListPopulation0.getFittestChromosome();
      elitisticListPopulation0.getElitismRate();
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getChromosomes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }
}
