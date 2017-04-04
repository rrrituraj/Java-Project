package com.tcs.GenericsAndCollections;

public class Empl{
    
    public String name;
    public int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
    public String toString(){
    	return (this.name+" "+this.salary);
    }
}

