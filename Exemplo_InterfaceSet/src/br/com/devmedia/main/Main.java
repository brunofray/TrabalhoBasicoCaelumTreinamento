package br.com.devmedia.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

class Dog implements Comparable<Dog>{
    int size;
  
    public Dog(int s) {
        size = s;
    }
  
    public String toString() {
        return size + "";
    }
  
    @Override
    public int compareTo(Dog o) {
            return size - o.size;
    }
}
public class Main {
	
	
	// TESTE DE PERFORMANCE HASHSET, TREESET, LINKEDSET
	public static void main(String[] args) {
	      
	    Random r = new Random();
	  
	    HashSet<Dog> hashSet = new HashSet<Dog>();
	    TreeSet<Dog> treeSet = new TreeSet<Dog>();
	    LinkedHashSet<Dog> linkedSet = new LinkedHashSet<Dog>();
	  
	    // start time
	    long startTime = System.nanoTime();
	  
	    for (int i = 0; i < 1000; i++) {
	        int x = r.nextInt(1000 - 10) + 10;
	        hashSet.add(new Dog(x));
	    }
	    // end time
	    long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println("HashSet: " + duration);
	  
	  
	  
	  
	    // start time
	    startTime = System.nanoTime();
	  
	    for (int i = 0; i < 1000; i++) {
	        int x = r.nextInt(1000 - 10) + 10;
	        treeSet.add(new Dog(x));
	    }
	    // end time
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println("TreeSet: " + duration);
	  
	  
	  
	  
	    // start time
	    startTime = System.nanoTime();
	  
	    for (int i = 0; i < 1000; i++) {
	        int x = r.nextInt(1000 - 10) + 10;
	        linkedSet.add(new Dog(x));
	    }
	    // end time
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println("LinkedHashSet: " + duration);
	  
	}
}
