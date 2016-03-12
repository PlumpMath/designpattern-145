package com.mi.practice.design.pattern.behavior.nullobject;

import java.io.PrintStream;

/**
 * Created by michelle on 16-3-12.
 * <p>
 * The intent of a Null Object is to encapsulate the absence of an object by providing a substitutable alternative that offers suitable default do nothing behavior. In short, a design where "nothing will come of nothing"
 * <p>
 * Use the Null Object pattern when
 * <p>
 * an object requires a collaborator. The Null Object pattern does not introduce this collaboration--it makes use of a collaboration that already exists
 * some collaborator instances should do nothing
 * you want to abstract the handling of null away from the client
 * <p>
 * A Null Object does not transform to become a Real Object. If the object may decide to stop providing do nothing behavior and start providing real behavior, it is not a null object. It may be a real object with a do nothing mode, such as a controller which can switch in and out of read-only mode. If it is a single object which must mutate from a do nothing object to a real one, it should be implemented with the State pattern or perhaps the Proxy pattern. In this case a Null State may be used or the proxy may hold a Null Object.
 */
public class NullApplication {
    private PrintStream debugout;
    public NullApplication(PrintStream debugout) {
        this.debugout = debugout;
    }

    public void go() {
        int sum = 0;
        for (int i=0; i<10; i++) {
            sum += 1;
            debugout.println("i = " + i);
        }

        System.out.println("sum = " + sum);
    }
}
