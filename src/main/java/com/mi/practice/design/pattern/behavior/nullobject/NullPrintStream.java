package com.mi.practice.design.pattern.behavior.nullobject;

import java.io.PrintStream;

/**
 * Created by michelle on 16-3-12.
 */
public class NullPrintStream extends PrintStream {
    public NullPrintStream() {
        super(new NullPrintStream());
    }
}
