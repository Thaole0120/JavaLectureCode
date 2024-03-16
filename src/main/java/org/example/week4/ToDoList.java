package org.example.week4;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Please type a task you need to do or press Enter to quit");
            if (data.isEmpty()) { // If the user just presses Enter, the length of text is 0.
                break;
            }

            if (containsIgnoreCase(todoList, data)) {
                System.out.println(" You already added that");
            } else {
                todoList.add(data);

            }
        }

            System.out.println("Thank you, here are all your tasks you entered:");

            for (String input : todoList) {
                System.out.println(input);
            }

            System.out.println(" You have " + todoList.size() + " task to do." );
        }

        public static boolean containsIgnoreCase(List<String> list, String data){
            for (String item: list){
                if (item.equalsIgnoreCase(data)){
                    return true;
                }
            }

            return false;
        }
    }


