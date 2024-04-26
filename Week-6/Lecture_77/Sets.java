
import java.util.*; 

public class Sets { 

	
	public static void main(String[] args) 
	{ 
=
		Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Hyderabad");
        hash_Set.add("Delhi");
        hash_Set.add("Mumbai");
        hash_Set.add("Bangalore");
        hash_Set.add("Chennai");
        hash_Set.add("Kolkata");
        hash_Set.add("Pune");
        hash_Set.add("Jaipur");

		// Printing elements of HashSet object 
		System.out.println(hash_Set);
        System.out.println("Size of the hash set: " + hash_Set.size());
        System.out.println("Is the hash set empty? " + hash_Set.isEmpty());
        System.out.println("Does the hash set contain 'Mumbai'? " + hash_Set.contains("Mumbai"));
        System.out.println("Removing 'Mumbai' from the hash set");
        hash_Set.remove("Mumbai");
        System.out.println("Does the hash set contain 'Mumbai'? " + hash_Set.contains("Mumbai"));
        System.out.println("Size of the hash set: " + hash_Set.size());
        System.out.println("Clearing the hash set");
        hash_Set.clear();
        System.out.println("Is the hash set empty? " + hash_Set.isEmpty());
		System.out.println(hash_Set);

	} 
}
