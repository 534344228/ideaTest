package com.shd.observer;

import com.shd.subject.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
