package com.example.strfly.learnmode;

/**
 * Created by chenjinbo645 on 2017/2/27.
 * 被观察者
 */

public interface Subject {
    void register(Observer observer);

    void remove(Observer observer);

    void notification();
}
