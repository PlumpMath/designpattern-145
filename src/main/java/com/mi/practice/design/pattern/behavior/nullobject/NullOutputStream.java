package com.mi.practice.design.pattern.behavior.nullobject;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by michelle on 16-3-12.
 */
public class NullOutputStream extends OutputStream{
    @Override
    public void write(int b) throws IOException {
        // do nothing
    }
}
