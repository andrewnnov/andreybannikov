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
    public void put(Task task) {

        if (tasks.isEmpty()) {
            tasks.add(task);
        } else {
            for (int i = 0; i < tasks.size(); ) {
                if (task.getPriority() > tasks.get(i).getPriority()) {
                    i++;
                } else {
                    tasks.add(i, task);
                    break;
                }
                if (i == tasks.size() - 1) {
                    tasks.add(task);
                }
            }
        }
    }

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
