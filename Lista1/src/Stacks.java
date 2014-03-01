public class Stacks<T> implements StackInterface {
	int[] tab;
	int rozmiar;
	int wskaznik = -1;

	public Stacks(int rozmiar) {
		this.rozmiar = rozmiar;
		tab = new int[rozmiar];
	}

	public void push(int value) {
		if (wskaznik < rozmiar) {
			tab[wskaznik+1] = value;

		} else {
			int[] tab1 = new int[2 * rozmiar];
			for (int i = 0; i < wskaznik; i++) {
				tab1[i] = tab[i];
				tab1[wskaznik] = value;
			}
		}

		wskaznik++;

	}

	public int top() {

		// dla pustego stosu wyrzuci wyjatek index out of bounds exception
		if (wskaznik != -1)
			return tab[wskaznik];
		else {
			System.out.println("Pusty stos");
			return -1;
		}
	}

	public void pop() {
		if (wskaznik >= 0)
			wskaznik--;
		else
			System.out.println("Na stosie nic juz nie ma");
	}

	public int max() { // nie zadziala
		int max = -1;
		if (wskaznik != -1) {
			for (int i = 0; i < tab.length; i++)
				if (tab[i] > max)
					max = tab[i];
			return max;
		}

		else {
			System.out.println("Pusty stos");
			return -1;
		}

	}
	public int liczbaelnastosie(){
		int liczba=0;
		top();
		while(wskaznik>=0){
			wskaznik--;
			liczba++;
		}
		
		return liczba;
	}
	
}
