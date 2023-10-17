/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 13:57:27 GMT 2023
 */
package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.junit.runner.RunWith;

public class ElitisticListPopulationTest {

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
        }
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
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
        }
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        int int0 = (-881);
        double double0 = 700.3623;
        ElitisticListPopulation elitisticListPopulation0 = null;
        try {
            elitisticListPopulation0 = new ElitisticListPopulation((-881), 700.3623);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // population limit has to be positive
        }
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        List<Chromosome> list0 = null;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 0, 0);
        // Undeclared exception!
        try {
            elitisticListPopulation0.setChromosomes(list0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
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
        }
    }

    @Test(timeout = 4000)
    public void test185() throws Throwable {
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
        }
    }
}
