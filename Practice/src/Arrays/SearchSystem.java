package Arrays;

import java.util.Scanner;

// Practice in creating and using search systems

public class SearchSystem {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int i;
		String films[][] = {
				{"Justice League",
					"2017", "IMDb 7.7", "120 min", "Fueled by his restored faith"
					+ " in humanity and inspired by Superman's selfless act, Bruce Wayne"
					+ " enlists the help of his newfound ally, Diana Prince, to face an even"
					+ " greater enemy. Together, Batman and Wonder Woman work quickly to find"
					+ " and recruit a tea..." },
				
				{"Suicide Squad",
					"2016", "IMDb 6.2", "123 min", "It feels good to be bad...Assemble a team"
					+ " of the world's most dangerous, incarcerated Super Villains, provide"
					+ " them with the most powerful arsenal at the government's disposal,"
					+ " and send them off on a mission to defeat an enigmatic, insuperable entity...."},
				
				{"Deadpool",
					"2016", "IMDb 8.1", "108 min", "This is the origin story of former Special Forces"
					+ " operative turned mercenary Wade Wilson, who after being subjected to a rogue"
					+ " experiment that leaves him with accelerated healing powers, adopts the alter"
					+ " ego Deadpool. Armed with his new abilities and..."},
				
				{"It",
					"2017", "IMDb 7.8", "135 min", "In the Town of Derry, the local kids are disappearing"
					+ " one by one, leaving behind bloody remains. In a place known as 'The Barrens',"
					+ " a group of seven kids are united by their horrifying and strange encounters"
					+ " with an evil clown and their determination..."},
				
				{"Harry Potter And The Sorcerer's Stone",
					"2017", "IMDb 7.5 ", "152 min", "This is the tale of Harry Potter, an ordinary"
					+ " 11-year-old boy serving as a sort of slave for his aunt and uncle who learns"
					+ " that he is actually a wizard and has been invited to attend the Hogwarts School"
					+ " for Witchcraft and Wizardry. Harry is snatched ..."	}
		};
		
		String search = in.nextLine();
		
		if(search.length() != 1) System.out.println("Usage: <Film name>");
		else {
			for(i = 0; i < films.length; i++) {
				
				if(films[i][0].equals(search)) {
					System.out.println(films[i][0] + ":" + films[i][1]);
					break;
					
				}
			}
			if(i == films.length) System.out.println("Name not found.");
		}
	}
}
