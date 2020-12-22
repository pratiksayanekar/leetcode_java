package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JP_permutation {
	static Set<String> hash_Set = new HashSet<>(); 

// Recursive function to generate 
// permutations of the string 
static void Permutation(String str, String ans) 
{ 

    // If string is empty 
    if (str.length() == 0) { 

        // Add the generated permutation to the 
        // set in order to avoid duplicates 
        hash_Set.add(ans); 
        return; 
    } 

    for (int i = 0; i < str.length(); i++) { 

        // ith character of str 
        char ch = str.charAt(i); 

        // Rest of the string after excluding 
        // the ith character 
        String ros = str.substring(0, i) 
                     + str.substring(i + 1); 

        // Recurvise call 
        Permutation(ros, ans + ch); 
    } 
} 

// Driver code 
public static void main(String[] args) 
{ 
    String s = "abb"; 

    // Generate permutations 
    Permutation(s, ""); 

    // Print the generated permutations 
    hash_Set.forEach((n) -> System.out.println(n)); 
    System.out.println(hash_Set.size());
} 
}