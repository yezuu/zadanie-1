package z2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Z2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        String wejscie = scanner.nextLine();
        
        Set<Integer> set1 = parse(wejscie.substring(1, wejscie.indexOf("]")).split(","));
        Set<Integer> set2 = parse(wejscie.substring(wejscie.lastIndexOf("[") + 1, wejscie.lastIndexOf("]")).split(","));

        switch (wejscie.substring(wejscie.indexOf("]") + 1, wejscie.lastIndexOf("[")))
        {
            case "*":
                set1.retainAll(set2);
                break;
                
            case "+":
                set1.addAll(set2);
                break;
                
            case "-":
                set1.removeAll(set2);
            break;
        }
        
        System.out.println(set1.toString());
    }
    
    private static Set<Integer> parse(String[] liczby)
    {
        Set<Integer> set = new TreeSet<>();
        
        for (String liczba : liczby) set.add(Integer.parseInt(liczba.trim()));
        
        return set;
    }
}