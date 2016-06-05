package com.mi.practice.design.pattern.behavior.chainofresponsibility;

import java.util.Random;

/**
 * Created by michelle on 16-6-5.
 */
public class ChainBefore {
    interface Image{
        String process();
    }

    static class IR implements Image {
        public String process() {
            return "IR";
        }
    }

    static class LS implements Image {
        public String process() {
            return "LS";
        }
    }

    static class Processor{
        private static Random rn = new Random();
        private static int nextId=1;
        private int id=nextId++;
        public boolean handle(Image image){
            if (rn.nextInt(2) != 0) {
                System.out.println("    Processor " + id + " is busy");
                return false;
            }
            System.out.println("Processor " + id + " - " + image.process());
            return true;
        }
    }

    public static void main(String []args){
        Image[] input = { new IR(), new IR(), new LS(), new IR(), new LS(), new LS()};
        Processor[] procs = {new Processor(), new Processor(), new Processor()};
        for (int i=0, j; i<input.length; i++){
            j = 0;
            while(! procs[j].handle(input[i])){
                j = (j+1) % procs.length;
            }
        }
    }
}
