package craft;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 
public class Potter {
 
	private TreeMap<Book, Integer> basket;
	private int numBooks;
 
	public static enum Book {
		FIRST, SECOND, THIRD, FOURTH, FIFTH
	}
 
	public Potter() {
		basket = new TreeMap<Book, Integer>();
	}
 
	public double buy(Book... list) {
		double cost = 0;
 
		numBooks = list.length;
		createCart(list);
		cost = minCost();
 
		return cost;
	}
 
	private double minCost() {
		double cost = fullCartCost();
 
		for (int i = 0; i < basket.size(); i++) {
			int num = 0;
			for (int set = basket.size() - i; set >= 0; set--) {
				double thisCartCost = 0;
				Map<Book, Integer> secondCart = (Map<Book, Integer>) basket.clone();
				Set<Book> thisSet = null;
				do {
					thisSet = createSet(secondCart, set);
					double setCost = calculateSetPrize(thisSet);
					thisCartCost += setCost;
					num += thisSet.size();
				} while (thisSet.size() > 0);
				if(thisCartCost < cost && num == numBooks) {
					cost = thisCartCost;
				}
			}
		}
 
		return cost;
	}
 
	private double fullCartCost() {
		int copies = 0;
		for (Book book : basket.keySet()) {
			copies += basket.get(book);
		}
 
		return copies * 8;
	}
 
	private Set<Book> createSet(Map<Book, Integer> basket, int size) {
		Set<Book> thisSet = new HashSet<Book>();
		for (Book book : basket.keySet()) {
			int copies = basket.get(book);
			if (copies > 0) {
				thisSet.add(book);
				basket.put(book, copies - 1);
			}
			if (thisSet.size() >= size)
				break;
		}
		return thisSet;
	}
 
	private double calculateSetPrize(Set<Book> thisSet) {
		double cost = 0;
		switch (thisSet.size()) {
		case 5:
			cost += thisSet.size() * 8 * 0.75;
			break;
		case 4:
			cost += thisSet.size() * 8 * 0.8;
			break;
		case 3:
			cost += thisSet.size() * 8 * 0.9;
			break;
		case 2:
			cost += thisSet.size() * 8 * 0.95;
			break;
		default:
			cost += thisSet.size() * 8;
			break;
		}
		return cost;
	}
 
	private void createCart(final Book... from) {
		basket.clear();
 
		for (Book book : from) {
			if (!basket.containsKey(book)) {
				basket.put(book, 0);
			}
			basket.put(book, basket.get(book) + 1);
		}
	}
 
	public static void main(String []args){
		
		Potter p = new Potter();
		double amount = p.buy(
								Potter.Book.FIRST,Potter.Book.FIRST,
								Potter.Book.SECOND,Potter.Book.SECOND,
								Potter.Book.THIRD, Potter.Book.THIRD,
								Potter.Book.FOURTH,
								Potter.Book.FIFTH);
		System.out.println(amount);
		
	}
	
	
}