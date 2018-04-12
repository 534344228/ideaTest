package com.shd;

import com.shd.observer.BinaryObserver;
import com.shd.observer.HexaObserver;
import com.shd.observer.OctalObserver;
import com.shd.subject.Subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
