package edu.pro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	FullTimeWorker john = new FullTimeWorker("john",1200);
	FullTimeWorker paul = new FullTimeWorker("paul",1500);
	List<FullTimeWorker> fullTimeWorkerList = new ArrayList<>();
	fullTimeWorkerList.add(john);
	fullTimeWorkerList.add(paul);
	PartTimeWorker george = new PartTimeWorker("george", 8, 100 );
	PartTimeWorker ringo = new PartTimeWorker("ringo", 8, 111 );
	List<PartTimeWorker> parTimeWorkerList = new ArrayList<>();
	parTimeWorkerList.add(george);
	parTimeWorkerList.add(ringo);

	// Total salary
        int total_salary = john.getSalary() + paul.getSalary() + george.getRate() * george.getHours() + ringo.getRate() * ringo.getHours();
     // Average salary
      double average = total_salary /4;

      // min salary
        List<Integer> salaries = new ArrayList<>();
        salaries.add(john.getSalary());  salaries.add(paul.getSalary());
        salaries.add(george.getRate() * george.getHours());  salaries.add(ringo.getRate() * ringo.getHours());
        salaries.sort(Comparator.comparingInt(Integer::intValue));
        int min = salaries.get(0);

        // max

        int max = salaries.get(3);

    }




}
