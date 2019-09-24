package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String args[])
    {
        PoemBeautifier poemBeautifier=new PoemBeautifier();

        String l=poemBeautifier.beautify("Beutify",(s->s.toUpperCase()));
    }

}
