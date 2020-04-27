package z1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Z1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        
        String uzytkownik, haslo;
        
        while (true)
        {
            System.out.printf("uzytkownik: ");
            uzytkownik = scanner.nextLine();
            
            // jezeli 'q' - przerwij petle pobierania danych
            if (uzytkownik.equals("q")) break;
            
            System.out.printf("haslo: ");
            haslo = scanner.nextLine();
            
            map.put(uzytkownik, haslo);
        }
        
        System.out.printf("\n ---- \n");
        System.out.printf("wpisz nazwe uzytkownika, aby zobaczyc jego haslo: ");
        
        uzytkownik = scanner.nextLine();
        
        // jezeli brak danych o uzytkowniku
        if (map.get(uzytkownik) == null)
            System.out.printf("blad: brak danych o takim uzytkowniku\n");
        else
            System.out.printf("haslo: %s\n", map.get(uzytkownik));
    }
}