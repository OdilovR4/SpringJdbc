package dasturlash.uz.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ScannerService {

    @Bean
    public Scanner scannerText(){
        return new Scanner(System.in);
    }
    @Bean
    public Scanner scannerNumber(){
        return new Scanner(System.in);
    }
    @Bean
    public Scanner scannerWord(){
        return new Scanner(System.in);
    }


}
