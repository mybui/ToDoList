/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list_;
    
    public TodoList() {
        this.list_ = new ArrayList();
    }
    
    public void add(String task) {
        this.list_.add(task);
    }
    
    public void print() {
        for (String i: this.list_) {
            System.out.println((this.list_.indexOf(i) + 1) + ": " + i);
        }
    }
    
    public void remove(int number) {
        if (number > 0) {
            this.list_.remove(this.list_.get(number - 1));
        }
    }
}
