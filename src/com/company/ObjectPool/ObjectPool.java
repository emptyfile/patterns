package com.company.ObjectPool;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {
    private Set<T> free = new HashSet<>();
    private Set<T> busy = new HashSet<>();

    protected abstract T create();

    public synchronized T checkOut() {
        if (free.isEmpty()) {
            free.add(create());
        }
        T instance = free.iterator().next();
        free.remove(instance);
        busy.add(instance);
        return instance;
    }

    public synchronized  void checkIn(T instance) {
        busy.remove(instance);
        free.add(instance);
    }

    @Override
    public String toString() {
        return String.format("Pool free=%d busy=%d", free.size(), busy.size());
    }
}
