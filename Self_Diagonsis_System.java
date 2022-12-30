package com.project;
import java.util.Scanner;
public class Self_Diagonsis_System
{
    public static void doctor_recommendation(String obj)
    {
        System.out.println("..........................................................................................");
        System.out.println("we are recommending you for a Doctor for your desease (Best Doctors in this field)");
        switch (obj) {
            case "Cancer" -> {
                System.out.println("Every Thing Will Be Okey .... !");
                System.out.println("There Is Some Doctor's Names in Differant Areas ...");
                System.out.println("In UK --> DR/John");
                System.out.println("In UAE --> DR/Mohammed");
                System.out.println("In Russia --> DR/Vandy");
            }
            case "Vitiligo" -> {
                System.out.println("Every Thing Will Be Okey .... !");
                System.out.println("There Is Some Doctor's Names in Differant Areas ...");
                System.out.println("In UK --> DR/John");
                System.out.println("In UAE --> DR/Mohammed");
                System.out.println("In Russia --> DR/Vandy");
            }
            case "cataracts" -> {
                System.out.println("Every Thing Will Be Okey .... !");
                System.out.println("There Is Some Doctor's Names in Differant Areas ...");
                System.out.println("In UK --> DR/John");
                System.out.println("In UAE --> DR/Mohammed");
                System.out.println("In Russia --> DR/Vandy");
            }
            case "glaucoma" -> {
                System.out.println("Every Thing Will Be Okey .... !");
                System.out.println("There Is Some Doctor's Names in Differant Areas ...");
                System.out.println("In UK --> DR/John");
                System.out.println("In UAE --> DR/Mohammed");
                System.out.println("In Russia --> DR/Vandy");
            }
            case "Fracture" -> {
                System.out.println("Every Thing Will Be Okey .... !");
                System.out.println("There Is Some Doctor's Names in Differant Areas ...");
                System.out.println("In UK --> DR/John");
                System.out.println("In UAE --> DR/Mohammed");
                System.out.println("In Russia --> DR/Vandy");
            }
            case "Bone Tumors" -> {
                System.out.println("Every Thing Will Be Okey .... !");
                System.out.println("There Is Some Doctor's Names in Differant Areas ...");
                System.out.println("In UK --> DR/John");
                System.out.println("In UAE --> DR/Mohammed");
                System.out.println("In Russia --> DR/Vandy");
            }
        }
    }

    public static void Print_(Disease obj)
    {
        System.out.println("Disease ID : "+obj.Id);
        System.out.println("Disease Name : "+obj.Name);
        System.out.println("Disease Description : "+obj.Discription);
        if(obj instanceof Dermatology obj_Derma) {
            System.out.println("Disease Related Diseases : " + obj_Derma.RealtedDiseases);
            System.out.println("Disease SkinColor : " + obj_Derma.SkinColor);
        }
        else if(obj instanceof BonesDiseases obj_Bon)
        {
            System.out.println("Type of rays "+obj_Bon.Rayes);
        }
        else if(obj instanceof EyeDiseases obj_Eye)
        {
            if(obj_Eye.Glasses)
                System.out.println("Require Glasses ");
            else
                System.out.println("Doesn't Require Glasses ");
        }
        System.out.println("Disease Symptoms : ");
        obj.Print(obj.Syptomes);
    }
    public static void compare(String[] answers, Disease[] Disease_objects, int counter, int[] match)
    {

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<counter;j++)
            {
                for(int k=0;k<5;k++)
                {
                    if (answers[j].equals(Disease_objects[i].Syptomes[k]))
                    {
                        match[i]++;
                    }
                }
            }

        }
    }
    public static int find(int [] matche,int size)
    {
        int max=matche[0];
        int index=0;
        for(int i=1;i<size;i++)
        {
            if(matche[i]>max)
            {
                max=matche[i];
                index=i;
            }
            else if
            (matche[i]==max)
            {
                System.out.println("The answers aren't clear enough ,Please try again .");
                return -1;
            }
        }
        return index ;
    }
    public static void list(Disease []obj,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("Disease ID : "+obj[i].Id);
            System.out.println("Disease Name : "+obj[i].Name);
        }
    }
    public static void search(Disease []obj,int size,String name)
    {
        for(int i=0;i<size;i++)
        {
            if(obj[i].Name.equals(name))
            {
                Print_(obj[i]);
                return;
            }
        }
        System.out.println("The input Disease doesn't exicet in my data , Sorry :(");
    }
        public static void main(String[] args) {
            String programm;
            int matches;
            int counter, no_sec, option;
            Scanner in = new Scanner(System.in);
            String[] answers = new String[9];
            int[] match = new int[2];
            //Dermatology Data
            Dermatology[] Dermatology_Objects = new Dermatology[2];
            String[] DC = new String[]{"A Large brownish spot with darker speckles.", "A Mole that changes in color",
                    "A small lesion with an irregular border and portions that apper red, pink,white", "Itch", "Fainting"};
            Dermatology_Objects[0] = new Dermatology("Cancer", "DC", "This is a Danger ", DC, "Locemia", "Dark");
            String[] DV = new String[]{"Hair turning prematurely gray or white", "Eyelashes or eyebrows losing color and turning white",
                    "Color loss in the nose and mouth", "Itch", "Inflammation of the ears or eyes", "Change of color in the retina of the eye"};
            Dermatology_Objects[1] = new Dermatology("Vitiligo", "DV", "This is a Danger ", DV, "Lack of Melanin", "White spots");
           //EyeDiseases Data
            EyeDiseases[] EyeDiseases_objects = new EyeDiseases[2];
            String [] EC =new String[]{"Your vision is cloudy or blurry","Colors look faded","You can’t see well at night", "Lamps, sunlight," +
                    " or headlights seem too bright",
                    "You see a halo around lights"};
            EyeDiseases_objects[0]=new EyeDiseases("cataracts","EC","A cataract is a cloudy area in the lens of your eye." +
                    " Cataracts are very common as you get older." +
                    " In fact, more than half of all Americans age 80 or older either have cataracts or have had surgery to get rid of cataracts. ",EC,true);
            String [] EG =new String[]{"Intense eye pain","Upset stomach (nausea)","Red eye","Your vision is cloudy or blurry","high eye pressure"};
            EyeDiseases_objects[1]=new EyeDiseases("glaucoma","EG","Glaucoma is a group of eye diseases that can cause vision loss and " +
                    "blindness by damaging a nerve in the back of your eye called the optic nerve.  ",EG,false);
            //BonesDiseases Data
            BonesDiseases [] BonesDiseases_objects =new BonesDiseases[2];
            String [] BF=new String[]{"Sudden pain","Swelling","Unable","Warmth,bruising, or redness","Unable to bear weight"};
            BonesDiseases_objects[0]=new BonesDiseases("Fracture","BF","When you break a bone, healthcare providers call it a bone fracture." +
                    " This break changes the shape of the bone." +
                    " These breaks may happen straight across a bone or along its length. A fracture can split a bone in two or leave it in several pieces.",BF,"X rays");
            String [] BT=new String[]{"Sudden pain","a noticeable lump over a bone","a weak bone that breaks (fractures) more easily than normal"
                    ,"swelling and redness (inflammation) over a bone," +
                    " which can make movement difficult if the affected bone is near a joint","fainting","problems moving around – for example, walking with a limp"};
            BonesDiseases_objects[1]=new BonesDiseases("Bone Tumors","BT","When cells divide abnormally and uncontrollably," +
                    " they can form a mass or lump of tissue. This lump is called a tumor. Bone tumors form in your bones. " +
                    "As the tumor grows, abnormal tissue can displace healthy tissue. Tumors can either be benign or malignant.",BT,"X ray");
            do
            {
                String nameOfDisease;
                //begeining of the programm
                System.out.println("Welcome To Self_Diagnosis System :)");
                System.out.println("Please Chose an option to start .");
                System.out.println("1 - List the Diseases of a specific Branch .");
                System.out.println("2 - List Details about specific Disease .");
                System.out.println("3 - Self_Diagnosis .");
                try {
                    option=in.nextInt();
                    option_Check(option);
                }
                catch (nonValiedChoise e)
                {
                    System.out.println("your choice is invalid , try again");
                    throw new RuntimeException(e);
                }
                System.out.println("Enter Your Section ID : ");
                System.out.println("1 - Dermatology");
                System.out.println("2 - EyeDiseases");
                System.out.println("3 - BonesDiseases");
                no_sec = in.nextInt();
                System.out.println("--------------------------------------------------------------");
                switch (option)
                {

                    case 1:
                    {
                        if (no_sec == 1)
                        {
                            System.out.println("The Diseases Of Dermatology are :");
                            list(Dermatology_Objects,2);
                        }
                        else if (no_sec == 2)
                        {
                            System.out.println("The Diseases Of EyeDiseases  are :");
                            list(EyeDiseases_objects,2);
                        }
                        else if (no_sec == 3)
                        {
                            System.out.println("The Diseases Of BonesDiseases are :");
                            list(BonesDiseases_objects,2);
                        }
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Enter the name of the disease you are looking for");
                        nameOfDisease=in.next();
                        if (no_sec == 1)
                        {
                            search(Dermatology_Objects,2,nameOfDisease);
                        }
                        else if (no_sec == 2)
                        {
                            search(EyeDiseases_objects,2,nameOfDisease);
                        }
                        else if (no_sec == 3)
                        {
                            search(BonesDiseases_objects,2,nameOfDisease);
                        }
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Complete this form please");
                        if (no_sec == 1)
                        {
                            Dermatology exD = new Dermatology();

                            counter = exD.complete_form(answers);
                            compare(answers, Dermatology_Objects, counter, match);
                            matches = find(match, 2);
                            if(matches!=-1) {
                                System.out.println("You are diagnosed with : ");
                                Print_(Dermatology_Objects[matches]);
                            }
                            String re=Dermatology_Objects[matches].Name;
                            doctor_recommendation(re);
                        }
                        else if (no_sec == 2)
                        {
                            EyeDiseases exE = new EyeDiseases();
                            counter = exE.complete_form(answers);
                            compare(answers, EyeDiseases_objects, counter, match);
                            matches = find(match, 2);
                            if(matches!=-1) {
                                System.out.println("You are diagnosed with : ");
                                Print_(EyeDiseases_objects[matches]);
                            }
                            String re=Dermatology_Objects[matches].Name;
                            doctor_recommendation(re);
                        }
                        else if (no_sec == 3)
                        {
                            BonesDiseases exB = new BonesDiseases();
                            counter = exB.complete_form(answers);
                            compare(answers, BonesDiseases_objects, counter, match);
                            matches = find(match, 2);
                            if(matches!=-1) {
                                System.out.println("You are diagnosed with : ");
                                Print_(BonesDiseases_objects[matches]);
                            }
                            String re=Dermatology_Objects[matches].Name;
                            doctor_recommendation(re);
                        }
                    }
                    break;
                }

                System.out.println("--------------------------------------------------------------");
                System.out.println("Do you want to enter the programme again ?");
                programm=in.nextLine();
            }while(programm.equals("YES")||programm.equals("yes"));
            System.out.println("Thank You for trying our programme :)");
        }
        static void option_Check(int c)throws nonValiedChoise
        {
            if(c<1||c>3)
            {
                throw new nonValiedChoise(c);
            }

        }
    }
