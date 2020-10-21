/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.Scanner;

public class UserInterface {
    private TodoList list_;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list_ = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command:");
            String word = scanner.nextLine();
            
            if (word.equals("stop")) {
                break;
            }
            
            if (word.equals("add")) {
                System.out.print("To add:");
                String word_2 = scanner.nextLine();
                this.list_.add(word_2);
            }
            
            if (word.equals("list")) {
                this.list_.print();
            }
            
            if (word.equals("remove")) {
                System.out.print("Which one is removed?");
                int word_2 = Integer.valueOf(scanner.nextLine());
                this.list_.remove(word_2);
            }
        }
    }
}
