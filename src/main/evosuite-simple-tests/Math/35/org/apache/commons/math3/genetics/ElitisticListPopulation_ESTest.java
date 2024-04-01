/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 13:57:27 GMT 2023
 */
package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        int int0 = 1745;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1745, 1745);
        elitisticListPopulation0.setElitismRate(0.0);
        elitisticListPopulation0.setElitismRate((-3480.99221112174));
        Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
        // Undeclared exception!
        try {
            linkedList0.addLast(chromosome0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // elitism rate (-3,480.992)
            //
            verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1080, 1080);
        elitisticListPopulation0.setElitismRate(1080);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        linkedList0.spliterator();
        linkedList0.add((Chromosome) null);
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 61, 1.0);
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 174, 174);
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        int int0 = 0;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 0, (-763.75318048848));
        // Undeclared exception!
        try {
            elitisticListPopulation0.setElitismRate(int0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // population limit has to be positive
            //
            verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        int int0 = (-881);
        double double0 = 700.3623;
        ElitisticListPopulation elitisticListPopulation0 = null;
        try {
            elitisticListPopulation0 = new ElitisticListPopulation((-881), 700.3623);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // population limit has to be positive
            //
            verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1466, 1466);
        elitisticListPopulation0.setElitismRate((-1449.43));
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        List<Chromosome> list0 = null;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 0, 0);
        // Undeclared exception!
        try {
            elitisticListPopulation0.setChromosomes(list0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        int int0 = 1054;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1054, 0.0);
        List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
        ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(list0, 1054, 1054);
        elitisticListPopulation1.nextGeneration();
        elitisticListPopulation1.setElitismRate(1054);
        // Undeclared exception!
        try {
            elitisticListPopulation1.iterator();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // elitism rate (1,054)
            //
            verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 2727, 0.0);
        elitisticListPopulation0.setPopulationLimit(0);
        elitisticListPopulation0.getElitismRate();
        elitisticListPopulation0.nextGeneration();
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
        elitisticListPopulation0.setElitismRate(1);
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2545, 0.0);
        elitisticListPopulation0.getElitismRate();
        elitisticListPopulation0.setElitismRate(1.0);
        elitisticListPopulation0.getElitismRate();
        elitisticListPopulation0.setElitismRate(0.0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        int int0 = 284;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(284, 392.1632);
        List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
        ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(list0, (-3205), (-1045.9));
        elitisticListPopulation1.setElitismRate(int0);
        elitisticListPopulation0.getFittestChromosome();
        double double0 = 1912.3547646;
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 501.0);
        elitisticListPopulation0.setChromosomes((List<Chromosome>) null);
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(189, (-212.6545));
        elitisticListPopulation0.iterator();
        elitisticListPopulation0.getElitismRate();
        Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
        elitisticListPopulation0.addChromosome(chromosome0);
        double double0 = 1879.401100615;
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 2144003123, (-461.0231362));
        elitisticListPopulation0.setChromosomes(linkedList0);
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        int int0 = 2140129251;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2140129251, 2140129251);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        linkedList0.add((Chromosome) null);
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 61, 1204);
        elitisticListPopulation0.nextGeneration();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(254, 254);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        elitisticListPopulation0.forEach(consumer0);
        elitisticListPopulation0.setPopulationLimit((-1073741824));
        elitisticListPopulation0.addChromosome((Chromosome) null);
        List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
        ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(list0, 254, 254);
        elitisticListPopulation1.iterator();
        elitisticListPopulation1.nextGeneration();
        elitisticListPopulation0.nextGeneration();
        elitisticListPopulation0.nextGeneration();
        // Undeclared exception!
        try {
            elitisticListPopulation0.nextGeneration();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -253
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        linkedList0.add((Chromosome) null);
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 61, (-3312));
        elitisticListPopulation0.nextGeneration();
        linkedList0.add((Chromosome) null);
        elitisticListPopulation0.nextGeneration();
        elitisticListPopulation0.nextGeneration();
        elitisticListPopulation0.nextGeneration();
    }
}
