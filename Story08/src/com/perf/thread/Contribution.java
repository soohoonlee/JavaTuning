package com.perf.thread;

/**
 * Created by lachesis on 14. 2. 14.
 */
public class Contribution {
    private int amount= 0;
    public void donate() {
        amount++;
    }
    public int getTotal() {
        return amount;
    }
}
