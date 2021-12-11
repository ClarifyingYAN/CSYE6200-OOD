package edu.neu.csye6200;

import java.util.*;
import java.util.function.Consumer;

abstract class AbstractClub {
	/**
	 * Add a person
     * 
     * @param p    person to add
	 */
	abstract void add(AbstractPerson p);
	
	/**
	 * Sort and output to Console all members.
     * 
     * @param compare    Comparator for sorting members
     * @param action    Consumer Action for output to Console
	 */
	abstract void sortAndShow(Comparator compare, Consumer<AbstractPerson> action);
	
	/**
	 * Get the pounds lost by each member
     * @return
	 */
	abstract List<Integer> getWeightLossStats();
}
