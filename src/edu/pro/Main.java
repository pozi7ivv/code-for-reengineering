package edu.pro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<FullTimeWorker> fullTimeWorkerList = new ArrayList<>();
        List<PartTimeWorker> partTimeWorkerList = new ArrayList<>();
        fullTimeWorkerList.add(new FullTimeWorker("john", 1200));
        fullTimeWorkerList.add(new FullTimeWorker("paul", 1500));
        partTimeWorkerList.add(new PartTimeWorker("george", 8, 100));
        partTimeWorkerList.add(new PartTimeWorker("ringo", 8, 111));
        // Total salary
        int[] fullTimeWorkerSalaryList = fullTimeWorkerList
                .stream()
                .mapToInt(FullTimeWorker::getSalary)
                .toArray();
        int[] partTimeWorkerSalaryList = partTimeWorkerList
                .stream()
                .mapToInt(worker -> worker.getRate() * worker.getHours())
                .toArray();
        int totalSalary = IntStream.of(fullTimeWorkerSalaryList).sum() + IntStream.of(partTimeWorkerSalaryList).sum();
        // Average salary
        int averageSalary = totalSalary / (fullTimeWorkerList.size() + partTimeWorkerList.size());
        // min salary
        int minSalary = Math.min(
                IntStream.of(fullTimeWorkerSalaryList).min().orElse(0),
                IntStream.of(partTimeWorkerSalaryList).min().orElse(0)
        );
        // max salary
        int maxSalary = Math.max(
                IntStream.of(fullTimeWorkerSalaryList).max().orElse(0),
                IntStream.of(partTimeWorkerSalaryList).max().orElse(0)
        );

        System.out.println("total salary " + totalSalary);
        System.out.println("average salary " + averageSalary);
        System.out.println("min salary " + minSalary);
        System.out.println("max salary " + maxSalary);
    }
}
