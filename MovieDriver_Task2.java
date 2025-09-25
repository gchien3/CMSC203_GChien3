import java.util.Scanner;
public class MovieDriver_Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie movie = new Movie();
		String another;
		do {
		System.out.println("Enter the name of a movie");
		movie.setTitle(sc.nextLine());
		
		System.out.println("Enter the rating of the movie");
		movie.setRating(sc.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie");
		movie.setSoldTickets(sc.nextInt());
		
		System.out.println(movie.toString());
		sc.nextLine();
		System.out.println("Do you want to enter another? (y or n)");
		another = sc.nextLine();
		} while (another.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		sc.close();
	}
}
