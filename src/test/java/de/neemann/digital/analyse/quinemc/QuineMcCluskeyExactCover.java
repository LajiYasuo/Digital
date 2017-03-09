package de.neemann.digital.analyse.quinemc;

import de.neemann.digital.analyse.expression.Variable;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by hneemann on 09.03.17.
 */
public class QuineMcCluskeyExactCover extends TestCase {


    public void testExactCoverLoop() {
        ArrayList<Variable> vars = new ArrayList<>();
        vars.add(new Variable("a"));
        vars.add(new Variable("b"));
        vars.add(new Variable("c"));
        vars.add(new Variable("d"));
        ArrayList<TableRow> primes = new ArrayList<>();
        primes.add(new TableRow(9, 0).addSource(1,3,5,7,9));
        primes.add(new TableRow(9, 1).addSource(0,1,2,3,5,6,7,8,9));
        primes.add(new TableRow(9, 2).addSource(0,2,3,5,8,9));
        primes.add(new TableRow(9, 3).addSource(1,2,4,6,8,9));
        primes.add(new TableRow(9, 4).addSource(0,1,4,5,8,9));
        primes.add(new TableRow(9, 5).addSource(2,3,6,8,9));
        primes.add(new TableRow(9, 6).addSource(2,4,5,7,9));
        primes.add(new TableRow(9, 7).addSource(0,1,3,6,7,9));


        QuineMcCluskey qmc = new QuineMcCluskey(vars, null, primes);
        qmc=qmc.simplifyPrimes(null);
    }

}