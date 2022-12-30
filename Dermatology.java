package com.project;
public class Dermatology extends Disease{
    protected String RealtedDiseases;
    protected String SkinColor;
     //size of the form is 9
    protected static String [] Quiestion_Form_D=new String[]{"A Large brownish spot with darker speckles.","A Mole that changes in color",
            "A small lesion with an irregular border and portions that apper red, pink,white","Itch","Fainting","Hair turning prematurely gray or white",
             "Eyelashes or eyebows losing color and turning white",
            "Color loss in the nose and mouth","Inflammation of the ears or eyes","Change of color in the retina of the eye"};
    public Dermatology(){
    }
    public Dermatology (String Name , String Id, String Discription , String [] Syptomes, String RealtedDiseases, String SkinColor)
    {
        super( Name , Id,Discription , Syptomes);
        this.RealtedDiseases=RealtedDiseases;
        this.SkinColor=SkinColor;
    }
    @Override
    public  int complete_form(String []answers)
    {
        int counter=0;
        for (int i=0;i<9;i++)
        {
            System.out.println("Do you suffer from " + Quiestion_Form_D[i] + " ?");
            System.out.println("enter your answer,please");
            String ans = in.nextLine();
            if (ans.equals("YES") || ans.equals("yes"))
            {
                answers[counter]=Quiestion_Form_D[i];
                counter++;
            }
            else {
                continue;
            }
        }
        return counter;
    }
}
