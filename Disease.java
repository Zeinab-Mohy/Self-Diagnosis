package com.project;
import java.util.Scanner;
public abstract class Disease {
    Scanner in = new Scanner(System.in);
    protected String Name;
    protected String Id;
    protected String Discription;
    protected String[] Syptomes = new String[5];
    //  protected String [] qForm=new String [10];
    protected  String [] Quiestion_Form=new String[9];

    public Disease(String Name, String Id, String Discription, String[] Syptomes) {
        this.Name = Name;
        this.Id = Id;
        this.Discription = Discription;
        this.Syptomes = Syptomes;
    }
    public Disease() {
    }
    public void Print(String[] Syptomes) {
        System.out.println(this.Syptomes[0]);
        System.out.println(this.Syptomes[1]);
        System.out.println(this.Syptomes[2]);
        System.out.println(this.Syptomes[3]);
        System.out.println(this.Syptomes[4]);
    }
    public  int complete_form(String []answers) {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println("Do you suffer from " + Quiestion_Form[i] + " ?");
            System.out.println("enter your answer,please");
            String ans = in.nextLine();
            if (ans.equals("YES") || ans.equals("yes")) {
                answers[counter] = Quiestion_Form[i];
                counter++;
            } else {
                continue;
            }
        }
        return counter;
    }
}
