package domain;

public class Warehouse {

	private static String[] shelf;

	static {
		shelf = new String[10];
	}

	public static void addItem(String item, int itemNum) {
		itemNum--;
		if (itemNum < 0 || itemNum > 9) {
			System.out.println("Enter Number Between 1 To 10...!!!");
			return;
		} else {
			for (int i = 0; i < shelf.length; i++) {
				if (shelf[i] == null && i == itemNum) {
					shelf[i] = item;
					System.out.println("Item '" + item + "' added to shelf " + (itemNum + 1));
					return;
				}
			}

		}
	}

	public static void removeItem(int shelfNum) {
		shelfNum--;
		if (shelfNum < 0 || shelfNum > 9) {
			System.out.println("Enter Number Between 1 And 10...!!!");
			return;
		} else {
			for (int i = 0; i < shelf.length; i++) {
				if (shelf[i] != null && i == shelfNum) {
					shelf[i] = null;
					System.out.println("Item is Removed...");
					return;
				}
			}
			System.out.println("Shelf IS Empty...!!!");
		}

	}

	public static void displayContents() {
		for (int i = 0; i < shelf.length; i++) {
			if (shelf[i] == null) {
				System.out.println("Shelf " + (i + 1) + " : [empty]");
			} else {
				System.out.println("Shelf " + (i + 1) + " : [" + shelf[i] + "]");

			}
		}
	}
}
