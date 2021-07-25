package com.dlb.test;

import com.dlb.anno.Info;

public class AnnotationTest {
    public static void main(String[] args) {
        try {
            Book book = new Book();
            Class classBook = book.getClass();
            if(classBook.isAnnotationPresent(Info.class)){
                Info infoAnno = (Info) classBook.getAnnotation(Info.class);
                System.out.println(infoAnno.value());
            }else{

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
}






