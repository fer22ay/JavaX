package com.fernando.javax;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 08 de febrero del 2020
 */
public class JavaScanner {
    
    public static void main(String [] args){
        
        String input = "1,2,3,4,5";
        try(Scanner sc = new Scanner(input).useDelimiter(",")){
            while (sc.hasNext()) {                
                System.out.println(sc.next());
            }
        }
        
        String str = "2020-01-30 12:30:41";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        LocalDateTime localDateTime = LocalDateTime.parse(str, dtf);
        
        String result = localDateTime.format(dtf);
        System.out.println(result);
        
    }
    
}
