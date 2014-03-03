package com.perf.thread;

/**
 * Created by lachesis on 14. 2. 14.
 */
public class Contributor {
    private Contribution myContribution;
    private String myName;
    public Contributor(Contribution contribution, String name) {
        myContribution = contribution;
        myName = name;
    }
}
