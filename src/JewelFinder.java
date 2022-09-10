import java.util.Scanner;

public class JewelFinder {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Input for the size of the grid
        System.out.println("	Choose a size for your grid (n for n x n): ");
        int sizeGrid = keyboard.nextInt();
        
        // Input for the number of jewels stored in the grid
        System.out.println("	Enter the number of jewels you want to store: ");
        int jewelNb = keyboard.nextInt();
        
		// Initiate variable that stores the final output
		String out = "";
		
		// Create 8x8 grid
		String[][] Grid = new String[sizeGrid + 1][sizeGrid + 1];
		
		// Store 3 Jewels in a random position in the grid
		for (int i = 0; i < jewelNb; i++) {
			// Get random Row and Random Column
			int randX = (int)(Math.random() * Grid.length);
			int randY = (int)(Math.random() * Grid.length);
			
			// Store the jewel
			Grid[randX][randY] = "Jewel";
		}
		
		// Search for jewel case by case on the grid
		for (int i = 0; i < Grid.length; i++) {
			for (int j = 0; j < Grid.length; j++) {
				if (Grid[i][j] == "Jewel") {
					out += "Jewel found in row: " + i + " column:" + j + "\n";
				}
			}
			
		}
		
		// Print final output
		System.out.println(out);
	}
 
}
