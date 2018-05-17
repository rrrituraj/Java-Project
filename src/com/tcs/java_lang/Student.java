package com.tcs.java_lang;

public class Student {
    private String name;
    private int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public Student() {
    }

    //overriding equals method
    public boolean equals(Object o){

        try{
            String name1=this.name;
            int rollno1=this.rollno;

            Student s=(Student)o;
            String name2=s.name;
            int rollno2=s.rollno;
            if(name1.equals(name2) && rollno1==rollno2){
                return  true;
            }
            else{
                return false;
            }
        }catch(ClassCastException e){
            return false;
        }catch (NullPointerException e){
            return false;
        }

    }

    //overriding hashcode for contract between .equals() and hashcode()
    public int hashCode(){

        return rollno;
    }
}
