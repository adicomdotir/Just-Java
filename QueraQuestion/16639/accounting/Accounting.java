package ir.javacup.accounting;

import java.util.ArrayList;
import java.util.List;

public class Accounting {
	private List<Cost> healthList = new ArrayList<>();
	private List<Cost> groceryList = new ArrayList<>();
	private List<Cost> homeAppliance = new ArrayList<>();
	
	public void addCost(Cost cost) {
		if (cost instanceof Health) {
			healthList.add(cost);
		} else if (cost instanceof Grocery) {
			groceryList.add(cost);
		} else if (cost instanceof HomeAppliance) {
			homeAppliance.add(cost);
		}
	}

	public Cost getCost() {
		Cost cost = null;
		for (Cost c : healthList) {
			if (cost == null) {
				cost = c;
			} else {
				Health h1 = (Health) cost;
				Health h2 = (Health) c;
				if (h1.getPriority() < h2.getPriority()) {
					cost = c;
				}
			}
		}
		if (cost != null && healthList.size() > 0) {
			healthList.remove(cost);
		}
		if (cost == null) {
			for (Cost c : groceryList) {
				cost = c;
				groceryList.remove(cost);
				break;
			}
		}
		if (cost == null && homeAppliance.size() > 0) {
			cost = homeAppliance.get(homeAppliance.size() - 1);
			homeAppliance.remove(cost);
		}
		return cost;
	}

	public static void main(String[] args) {
		Accounting acc = new Accounting();
		acc.addCost(new Grocery(50000, "meat"));
		acc.addCost(new Health(100000, 1, "CalMagZink capsule"));
		acc.addCost(new HomeAppliance(4000000, "TV"));
		acc.addCost(new Health(60000, 4, "yearly check up"));
		acc.addCost(new Grocery(4000, "pancake powder"));
		acc.addCost(new HomeAppliance(600000, "pot"));
		
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
	}

}
