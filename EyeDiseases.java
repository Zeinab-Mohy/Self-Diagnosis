package com.project;

public class EyeDiseases extends  Disease{
    protected boolean Glasses;
    protected String [] Quiestion_Form_E=new String[]{"Your vision is cloudy or blurry","Colors look faded","You can’t see well at night", "Lamps, sunlight," +
            " or headlights seem too bright",
            "You see a halo around lights","Intense eye pain","Upset stomach (nausea)","Red eye","high eye pressure"};
    public EyeDiseases(){

    }
    public EyeDiseases( String Name ,String Id,String Discription ,String [] Syptomes,boolean Glasses)
    {
        super( Name ,Id, Discription ,Syptomes);
        this.Glasses=Glasses;
    }
    @Override
    public  int complete_form(String []answers)
    {
        int counter=0;
        for (int i=0;i<9;i++)
        {
            System.out.println("Do you suffer from " + Quiestion_Form_E[i] + " ?");
            System.out.println("enter your answer,please");
            String ans = in.nextLine();
            if (ans.equals("YES") || ans.equals("yes"))
            {
                answers[counter]=Quiestion_Form_E[i];
                counter++;
            }
            else {
                continue;
            }

        }
        return counter;
    }
}
