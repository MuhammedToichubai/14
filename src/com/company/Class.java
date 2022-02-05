package com.company;

public class Class {
    private int numberNomer;
    private String wordsSlova;
    private int []arrayMassiv;

    public Class(){

    }

    public Class(int numberNomer, String wordsSlova, int[] arrayMassiv) {
        this.numberNomer = numberNomer;
        this.wordsSlova = wordsSlova;
        this.arrayMassiv = arrayMassiv;
    }

    public int getNumberNomer() {
        return numberNomer;
    }

    public void setNumberNomer(int numberNomer) {
        this.numberNomer = numberNomer;
    }

    public String getWordsSlova() {
        return wordsSlova;
    }

    public void setWordsSlova(String wordsSlova) {
        this.wordsSlova = wordsSlova;
    }

    public int[] getArrayMassiv() {
        for (int arrayIt:arrayMassiv) {
            System.out.print(arrayIt+" ");
        }
        return arrayMassiv;
    }

    public void setArrayMassiv(int[] arrayMassiv) {
        this.arrayMassiv = arrayMassiv;
    }
}

