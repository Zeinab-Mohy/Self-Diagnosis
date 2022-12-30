package com.project;

public class BonesDiseases extends  Disease {
    protected String Rayes;
    protected String [] Quiestion_Form_B=new String[]{"Sudden pain","Swelling","Unable","Warmth,bruising, or redness","Unable to bear weight",
            "a noticeable lump over a bone","a weak bone that breaks (fractures) more easily than normal","swelling and redness (inflammation) over a bone," +
            " which can make movement difficult if the affected bone is near a joint","fainting","problems moving around – for example, walking with a limp"};
    public BonesDiseases(){
    }

    public BonesDiseases(String Name ,String Id,String Discription ,String [] Syptomes,String Rayes)
    {
        super( Name , Id,Discription , Syptomes);
        this.Rayes=Rayes;
    }
    @Override
    public  int complete_form(String []answers)
    {
        int counter=0;
        for (int i=0;i<9;i++)
        {
            System.out.println("Do you suffer from " + Quiestion_Form_B[i] + " ?");
            System.out.println("enter your answer,please");
            String ans = in.nextLine();
            if (ans.equals("YES") || ans.equals("yes"))
            {
                answers[counter]=Quiestion_Form_B[i];
                counter++;
            }
            else
            {
                continue;
            }

        }
        return counter;
    }
}
