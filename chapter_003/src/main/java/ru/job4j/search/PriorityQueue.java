package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /*
    *Метод должен вставлятьв нужную позицию элемент
    * Позиция определяется по полю приоритет
    * Для вставки использовать add(int index, E value)
    * @param task задача
     */
    public void put(Task task){



//        if(tasks.isEmpty()){
//            tasks.add(0, task);
//        } else {
//            for (Task el: tasks) {
//                if(el.getPriority() > task.getPriority()){
//                    int numberOfElement = tasks.indexOf(el);
//                    tasks.add(numberOfElement, task);
//                    break;
//                }
//            }
//        }
    }

    public Task take(){
        return this.tasks.poll();
    }
  }
