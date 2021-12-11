package edu.neu.csye6200;

import java.util.*;
import java.util.function.Consumer;

public class WeightLossClub extends AbstractClub {

	private List<AbstractPerson> persons = new ArrayList<>();
	
	public WeightLossClub() {
		super();
	}
	
	public WeightLossClub(String[] csvs) {
		super();
		parseCSVData(csvs);
	}

	@Override
	void add(AbstractPerson p) {
		persons.add(p);
	}
	
	@Override
	void sortAndShow(Comparator compare, Consumer<AbstractPerson> action) {
		persons.sort(compare);
		persons.forEach(action);
	}

	@Override
	List<Integer> getWeightLossStats() {
		List<Integer> list = new ArrayList<>();
		persons.forEach(p -> list.add(p.getWeightLossLbs())); 
		return list;
	}
	
	private void parseCSVData(String[] csvData) {
		Arrays.stream(csvData).forEach(s -> {
			parseCSVLine(s);
		});
	}
	
	private void parseCSVLine(String line) {
		Scanner in = new Scanner(line);
		in.useDelimiter(",");
		int id, age, weight, weightLoss;
//		int age;
		String name;
//		int weight;
//		int weightLoss;
		try {
			id = in.nextInt();
			age = in.nextInt();
			name = in.next();
			weight = in.nextInt();
			weightLoss = in.nextInt();
			add(new Person(id, age, name, weight, weightLoss));
		} catch (Exception e) {
			e.printStackTrace();
		}
		in.close();
	}
	
	public static void demo() {
		System.out.println("Final part 2 The People's Weight Club:");
		String[] csvs = {
			"1,25,Jim,311,11",
			"2,21,Sam,315,15",
			"3,17,Dan,314,14",
			"4,19,Bob,312,12",
			"5,16,Ann,310,10",
			"6,23,Eve,313,13",
		};
		
		AbstractClub club = new WeightLossClub(csvs);
		
		System.out.println("Compare by name:");
		club.sortAndShow(Person::compareByName, System.out::println);
		
		System.out.println("\nCompare by weight loss:");
		club.sortAndShow(Person::compareByWeightLoss, System.out::println);
		
		System.out.println("\nGraph current weight loss:");
		List<Integer> current = club.getWeightLossStats();
		System.out.println("ascending");
		Collections.sort(current);
		current.forEach(wl -> {
			System.out.print(wl+" ");
			for(int i=0; i<wl; i++) {
				System.out.print("*");
			}
			System.out.println();
		});
		System.out.println("\ndescending");
		Collections.sort(current, Comparator.reverseOrder());
		current.forEach(wl -> {
			System.out.print(wl+" ");
			for(int i=0; i<wl; i++) {
				System.out.print("*");
			}
			System.out.println();
		});
		
		System.out.println("\nGraph project 1 month weight loss:");
		List<Integer> predicted1 = new ArrayList<>(); 
		current.forEach(wl -> predicted1.add(wl+10));
		System.out.println("ascending");
		Collections.sort(predicted1);
		predicted1.forEach(wl -> {
			System.out.print(wl+" ");
			for(int i=0; i<wl; i++) {
				System.out.print("*");
			}
			System.out.println();
		});
		System.out.println("\ndescending");
		Collections.sort(predicted1, Comparator.reverseOrder());
		predicted1.forEach(wl -> {
			System.out.print(wl+" ");
			for(int i=0; i<wl; i++) {
				System.out.print("*");
			}
			System.out.println();
		});
		
		System.out.println("\nGraph project 12 months weight loss:");
		List<Integer> predicted2 = new ArrayList<>(); 
		current.forEach(wl -> predicted2.add(wl+wl*10));
		System.out.println("ascending");
		Collections.sort(predicted2);
		predicted2.forEach(wl -> {
			System.out.print(wl+" ");
			for(int i=0; i<wl; i++) {
				System.out.print("*");
			}
			System.out.println();
		});
		System.out.println("\ndescending");
		Collections.sort(predicted2, Comparator.reverseOrder());
		predicted2.forEach(wl -> {
			System.out.print(wl+" ");
			for(int i=0; i<wl; i++) {
				System.out.print("*");
			}
			System.out.println();
		});
	}

}
