package ru.job4j.search;

import java.util.LinkedList;
import java.util.List;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /*
     *Метод должен вставлятьв нужную позицию элемент
     * Позиция определяется по полю приоритет
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = this.tasks.size();
        for (int i = 0; i < tasks.size(); i++) {
            if (task.getPriority() < tasks.get(i).getPriority()) {
                index = i;
                break;
            }
        }
        tasks.add(index, task);
    }
//    public void put(Task task) {
//        if (tasks.isEmpty()) {
//            tasks.add(task);
//        } else {
//            for (int i = 0; i < tasks.size(); ) {
//                if(task.getPriority() > tasks.get(tasks.size()-1).getPriority()){
//                    tasks.add(task);
//                    break;
//                }else
//                if (task.getPriority() > tasks.get(i).getPriority()) {
//                    i++;
//                } else {
//                    tasks.add(i, task);
//                    break;
//                }
//            }
//        }
//    }

    public Task take() {
        return this.tasks.poll();
    }
}
//
//        if (!tasks.isEmpty()){
//            int low = 0;
//            int high = tasks.size();
//            int mid = (low + high)/2;
//
//            while (low < high){
//
//                if(task.getPriority() == tasks.get(mid).getPriority()){
//                    tasks.add(mid, task);
//                    break;
//                }else {
//                    if (task.getPriority() < tasks.get(mid).getPriority()){
//                        high = mid;
//                    }else {
//                        low = mid +1;
//                    }
//                }
//            }
//        } else {
//            tasks.add(task);
//        }
