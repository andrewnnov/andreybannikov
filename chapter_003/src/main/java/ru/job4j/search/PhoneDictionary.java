package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {

    private List<Person> person = new ArrayList<Person>();

    public void add(Person person){
        this.person.add(person);
    }

    /**
     * Вернуть список всех пользователей который содержит key в любых полях
     * @param key Ключ поиска
     * @return Список подошедших пользователей
     */
    public List<Person> find(String key){
        List<Person> result = new ArrayList<>();
        for (Person user: person) {
            if(user.getName().contains(key)|| user.getSurname().contains(key)||user.getAddress().contains(key)|| user.getPhone().contains(key))
                result.add(user);
        }
        return result;
    }



}
