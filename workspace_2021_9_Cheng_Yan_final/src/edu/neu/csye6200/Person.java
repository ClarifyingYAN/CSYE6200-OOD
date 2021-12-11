package edu.neu.csye6200;

public class Person extends AbstractPerson {
	
	private int id;
	private int age;
	private String name;
	private int weightLbs;
	private int weightLossLbs;
	
	public Person(int id, int age, String name, int weightLbs, int weightLossLbs) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.weightLbs = weightLbs;
		this.weightLossLbs = weightLossLbs;
	}

	@Override
	int getId() {
		return id;
	}

	@Override
	void setId(int id) {
		this.id=id;
	}

	@Override
	int getAge() {
		return age;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	int getWeightLbs() {
		return weightLbs;
	}

	@Override
	void setWeightLbs(int weightLbs) {
		this.weightLbs = weightLbs;
	}

	@Override
	int getWeightLossLbs() {
		return weightLossLbs;
	}

	@Override
	void setWeightLossLbs(int weightLossLbs) {
		this.weightLossLbs = weightLossLbs;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", weightLbs=" + weightLbs + ", weightLossLbs="
				+ weightLossLbs + "]";
	}

	public static int compareByName(Object o1, Object o2) {
		AbstractPerson p1 = null;
		AbstractPerson p2 = null;
		if (o1 instanceof AbstractPerson)
			p1 = (AbstractPerson) o1;
		if (o2 instanceof AbstractPerson)
			p2 = (AbstractPerson) o2;
		if (p1==null || p2==null)
			System.exit(-1);
		int cmp = p1.getName().compareTo(p2.getName());
		return cmp;
	}
	
	public static int compareByWeightLoss(Object o1, Object o2) {
		AbstractPerson p1 = null;
		AbstractPerson p2 = null;
		if (o1 instanceof AbstractPerson)
			p1 = (AbstractPerson) o1;
		if (o2 instanceof AbstractPerson)
			p2 = (AbstractPerson) o2;
		if (p1==null || p2==null)
			System.exit(-1);
		int cmp = p1.getWeightLossLbs()-p2.getWeightLossLbs();
		return cmp;
	}

}
