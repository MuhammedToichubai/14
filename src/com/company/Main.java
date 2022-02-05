package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Class деген класс тузунуз
//        ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар
//        конструктор жазыныз
//        мейн методтон Classтын объектисин тузунуз
//        объекттин полелерине конструктор аркылуу маани бериниз
//        ошол объекттин полелерин консольго чыгарыныз.

        Class peaksoft = new Class(119,"Facebook",new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
        System.out.println("Class number - "+peaksoft.getNumberNomer()+"\n"
                             +"Class words - "+peaksoft.getWordsSlova());
        System.out.print("Class array - ");
        peaksoft.getArrayMassiv();



    }
}
