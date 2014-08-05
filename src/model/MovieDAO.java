package model;

import java.util.ArrayList;

public class MovieDAO {
	private ArrayList<Movie> movieList;
	
	public MovieDAO() {
		movieList = new ArrayList<Movie>();
		Movie movie1 = new Movie();
		movie1.setTitle("Captain America: The Winter Soldier 3D");
		movie1.setRating("PG-13");
		movie1.setRuntime("2 hr 15 min");
		movie1.setDescription("After the cataclysmic events in New York with his fellow Avengers, "
				+ "Steve Rogers, aka Capt. America (Chris Evans), lives in the nation's capital as "
				+ "he tries to adjust to modern times. An attack on a S.H.I.E.L.D. colleague throws "
				+ "Rogers into a web of intrigue that places the whole world at risk. Joining forces "
				+ "with the Black Widow (Scarlett Johansson) and a new ally, the Falcon, Rogers "
				+ "struggles to expose an ever-widening conspiracy, but he and his team soon come up "
				+ "against an unexpected enemy.");
		ArrayList<String> times = new ArrayList<String>();
		times.add("6:00p");
		times.add("9:10p");
		movie1.setShowings(times);
		
		movieList.add(movie1);
		
		Movie movie2 = new Movie();
		movie2.setTitle("Captain America: The Winter Soldier");
		movie2.setRating("PG-13");
		movie2.setRuntime("2 hr 8 min");
		movie2.setDescription("After the cataclysmic events in New York with his fellow Avengers, "
				+ "Steve Rogers, aka Capt. America (Chris Evans), lives in the nation's capital as "
				+ "he tries to adjust to modern times. An attack on a S.H.I.E.L.D. colleague throws "
				+ "Rogers into a web of intrigue that places the whole world at risk. Joining forces "
				+ "with the Black Widow (Scarlett Johansson) and a new ally, the Falcon, Rogers "
				+ "struggles to expose an ever-widening conspiracy, but he and his team soon come up "
				+ "against an unexpected enemy.");
		times.clear();
		times.add("11:30a");
		times.add("12:30p");
		times.add("1:30p");
		times.add("1:30p");
		times.add("2:10p");
		times.add("2:40p");
		times.add("3:40p");
		times.add("4:40p");
		times.add("4:40p");
		times.add("5:20p");
		times.add("7:00p");
		times.add("8:00p");
		times.add("8:00p");
		times.add("8:30p");
		times.add("9:15p");
		times.add("10:20p");
		times.add("11:00p");
		movie2.setShowings(times);
		
		movieList.add(movie2);
		
		Movie movie3 = new Movie();
		movie3.setTitle("Noah");
		movie3.setRating("PG-13");
		movie3.setRuntime("2 hr 17 min");
		movie3.setDescription("The Biblical Noah suffers visions of an apocalyptic deluge "
				+ "and takes measures to protect his family from the coming flood.");
		times.clear();
		times.add("12:15p");
		times.add("3:30p");
		times.add("7:15p");
		times.add("10:25p");
		movie3.setShowings(times);
		
		movieList.add(movie3);
		
		Movie movie4 = new Movie();
		movie4.setTitle("Sabotage");
		movie4.setRating("R");
		movie4.setRuntime("1 hr 49 min");
		movie4.setDescription("In \"Sabotage\", Arnold Schwarzenegger leads an elite DEA task "
				+ "force that takes on the world's deadliest drug cartels. When the team "
				+ "successfully executes a high-stakes raid on a cartel safe house, they think "
				+ "their work is done - until, one-by-one, the team members mysteriously start "
				+ "to be eliminated. As the body count rises, everyone is a suspect.");
		times.clear();
		times.add("6:30p");
		times.add("9:15p");
		movie4.setShowings(times);
		
		movieList.add(movie4);
		
		Movie movie5 = new Movie();
		movie5.setTitle("Divergent");
		movie5.setRating("PG-13");
		movie5.setRuntime("2 hr 20 min");
		movie5.setDescription("DIVERGENT is a thrilling action-adventure film set in a "
				+ "world where people are divided into distinct factions based on human "
				+ "virtues. Tris Prior (Shailene Woodley) is warned she is Divergent and "
				+ "will never fit into any one group. When she discovers a conspiracy by "
				+ "a faction leader (Kate Winslet) to destroy all Divergents, Tris must "
				+ "learn to trust in the mysterious Four (Theo James) and together they "
				+ "must find out what makes being Divergent so dangerous before it's too "
				+ "late. Based on the best-selling book series by Veronica Roth.");
		times.clear();
		times.add("5:30p");
		times.add("8:35p");
		movie5.setShowings(times);
		
		movieList.add(movie5);
		
		Movie movie6 = new Movie();
		movie6.setTitle("Muppets Most Wanted");
		movie6.setRating("PG");
		movie6.setRuntime("1 hr 46 min");
		movie6.setDescription("Disney’s “Muppets Most Wanted” takes the entire Muppets gang "
				+ "on a global tour, selling out grand theaters in some of Europe’s most "
				+ "exciting destinations, including Berlin, Madrid and London. But mayhem "
				+ "follows the Muppets overseas, as they find themselves unwittingly entangled "
				+ "in an international crime caper headed by Constantine—the World’s Number "
				+ "One Criminal and a dead ringer for Kermit—and his dastardly sidekick "
				+ "Dominic, aka Number Two, portrayed by Ricky Gervais. The film stars Tina "
				+ "Fey as Nadya, a feisty prison guard, and Ty Burrell as Interpol agent Jean Pierre Napoleon. ");
		times.clear();
		times.add("6:15p");
		times.add("9:00p");
		movie6.setShowings(times);
		
		movieList.add(movie6);
		
		Movie movie7 = new Movie();
		movie7.setTitle("300: Rise of an Empire");
		movie7.setRating("R");
		movie7.setRuntime("1 hr 43 min");
		movie7.setDescription("Based on Frank Miller's latest graphic novel, Xerxes, and told "
				+ "in the breathtaking visual style of the blockbuster 300, this new chapter "
				+ "of the epic saga takes the action to a fresh battlefield—on the sea—as Greek "
				+ "general Themistokles (Sullivan Stapleton) attempts to unite all of Greece by "
				+ "leading the charge that will change the course of the war. 300: Rise of an "
				+ "Empire pits Themistokles against the massive invading Persian forces led by "
				+ "mortal-turned-god Xerxes (Rodrigo Santoro), and Artemesia (Eva Green), vengeful "
				+ "commander of the Persian navy.");
		times.clear();
		times.add("5:15p");
		times.add("7:50p");
		movie7.setShowings(times);
		
		movieList.add(movie7);
		
		Movie movie8 = new Movie();
		movie8.setTitle("Mr. Peabody & Sherman");
		movie8.setRating("PG");
		movie8.setRuntime("1 hr 31 min");
		movie8.setDescription("Mr. Peabody (Ty Burrell), the most accomplished canine in the "
				+ "world, and his boy, Sherman (Max Charles), use a time machine called the "
				+ "Wabac to embark on outrageous adventures. However, when Sherman takes the "
				+ "Wabac without permission to impress his friend Penny (Ariel Winter), he "
				+ "accidentally rips a hole in the universe and causes havoc with world history. "
				+ "It's up to Mr. Peabody to mount a rescue and prevent the past, present and "
				+ "future from being permanently altered.");
		times.clear();
		times.add("5:15p");
		times.add("7:45p");
		movie8.setShowings(times);
		
		movieList.add(movie8);
		
		Movie movie9 = new Movie();
		movie9.setTitle("Non-Stop");
		movie9.setRating("PG-13");
		movie9.setRuntime("1 hr 47 min");
		movie9.setDescription("Global action star Liam Neeson stars in \"Non-Stop,\" a suspense "
				+ "thriller played out at 40,000 feet in the air. During a transatlantic flight "
				+ "from New York City to London, U.S. Air Marshal Bill Marks (Neeson) receives a "
				+ "series of cryptic text messages demanding that he instruct the airline to "
				+ "transfer $150 million into an off-shore account. Until he secures the money, a "
				+ "passenger on his flight will be killed every 20 minutes. The film reunites "
				+ "Neeson with \"Unknown\" director Jaume Collet-Serra and producer Joel Silver, "
				+ "and co-stars Golden Globe Award winner Julianne Moore.");
		times.clear();
		times.add("5:15p");
		times.add("8:15p");
		movie9.setShowings(times);
		
		movieList.add(movie9);
	}
	
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
	
	public Movie getMovie(String name) {
		for (int m = 0; m < movieList.size(); m++) {
			if (movieList.get(m).getTitle().equalsIgnoreCase(name)) {
				return movieList.get(m);
			}
		}
		
		return null;
	}
}
