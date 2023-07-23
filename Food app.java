import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Food Mohalla");
        System.out.println("Sign up to Order food");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String Name=sc.next();
        System.out.println("Please create a password: ");
        int pass=sc.nextInt();

        System.out.println("Please login with name and password");
        System.out.println("Enter your name:");
        String Name1=sc.next();
        System.out.println("Enter your password: ");
        int pass1=sc.nextInt();
        while(pass1!=pass&&Name1!=Name){
            System.out.println("Invalid Credential try again");
            System.out.println("Enter your name:");
            Name1=sc.next();
            System.out.println("Enter your password:");
            pass1=sc.nextInt();

        }
        System.out.println("Login Successfully");
        System.out.println("Are you hungry Yes or No");
        String ans1=sc.next();
        if(ans1.equals("Yes")){
            System.out.println("Here Is Our Menue-");
            System.out.println("Ser No  Food     Price");
            System.out.println("  1      Pizza -  120");
            System.out.println("  2     Burger -  90");
            System.out.println("  3     Sandwich -  80");
            System.out.println("  4    French fries - 50");
            System.out.println("  5      Momos  -   70 ");
            System.out.println("Select an Option- ");
            int op=sc.nextInt();
            while(op!=1&&op!=2&&op!=3&&op!=4&&op!=5){
                System.out.println("Invalid please choose from above option");
                System.out.println("Select an option- ");
                op=sc.nextInt();
            }
            int sum=0;
            if(op==1 || op==2||op==3||op==4||op==5){
                System.out.println("Do you want something to drink? Yes or No: ");
                String ans3=sc.next();
                while(!ans3.equals("Yes")&& !ans3.equals("No")){
                    System.out.println("Wrong comment please try again: ");
                    ans3=sc.next();
                }

                if(ans3.equals("Yes")){
                    System.out.println("Here are some option of drink-");
                    System.out.println("Ser No   Drink   Price");
                    System.out.println("   1      Coke   50");
                    System.out.println("   2      Juice  60");
                    System.out.println("   3       Beer   90");
                    System.out.println("Select an option-");
                    int dr=sc.nextInt();
                    while(dr!=1&&dr!=2&&dr!=3){
                        System.out.println("Invalid option try again");
                        System.out.println("Select an option-");
                        dr=sc.nextInt();
                    }
                    if(op==1&&dr==1){
                        sum=120+50;
                        System.out.println("Total price of your order is "+ sum);
                    }else if(op==1&&dr==2){
                         sum=120+60;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==1&&dr==3){
                         sum=120+90;
                        System.out.println("Total price of your order is "+sum);
                   // }else if(op==1&&dr==3){
                     //   int sum=120+90;
                       // System.out.println("Total price of your order is "+sum);
                    }else if(op==2&&dr==1){
                         sum=90+50;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==2&&dr==2){
                         sum=90+60;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==2&&dr==3){
                         sum=90+90;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==3&&dr==1){
                         sum=80+50;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==3&&dr==2){
                         sum=80+60;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==3&&dr==3){
                         sum=80+90;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==4&&dr==1){
                         sum=50+50;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==4&&dr==2){
                         sum=50+60;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==4&&dr==3){
                         sum=50+90;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==5&&dr==1){
                         sum=70+50;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==5&&dr==2){
                         sum=70+60;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==5&&dr==3){
                         sum=70+90;
                        System.out.println("Total price of your order is "+sum);
                    }
                    if(sum>1){
                        System.out.println("Please select the mode of payment");
                        System.out.println("Option 1 for debit card");
                        System.out.println("Option 2 for credit card");
                        System.out.println("Option 3 for COD");
                        int sr=sc.nextInt();
                        if(sr==1||sr==2){
                            System.out.println("Please enter your card no");
                            int card= sc.nextInt();
                            System.out.println("Please enter cvv no");
                            int card2 = sc.nextInt();
                            System.out.println("Great you have ordered");
                            System.out.println("Your order will receive soon");
                        }else if(sr==3){
                            System.out.println("Great you have ordered");
                            System.out.println("Please keep ready with cash your order will receive soon");
                        }else
                            while(sr!=1&&sr!=2&&sr!=3){
                            System.out.println("Invalid option try again");
                            System.out.println("Please select the mode of payment");
                            sr=sc.nextInt();
                        }
                    }

                }else{
                    if(op==1){
                        sum=120;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==2){
                        sum=90;
                        System.out.println("Total price of your order is "+sum);
                    }else if(op==3){
                        sum=80;
                        System.out.println("Total price of your order is  "+sum);
                    }else if(op==4){
                        sum=50;
                        System.out.println("Total price of your order is  "+sum);

                    }else if(op==5){
                        sum=70;
                        System.out.println("Total price of your order is  "+sum);
                    }
                    if(sum>1){
                        System.out.println("Please select the mode of payment");
                        System.out.println("Option 1 for debit card");
                        System.out.println("Option 2 for credit card");
                        System.out.println("Option 3 for COD");
                        int sr=sc.nextInt();
                        if(sr==1||sr==2){
                            System.out.println("Please enter your card no");
                            int card=sc.nextInt();
                            System.out.println("Please enter cvv no");
                            int cvv=sc.nextInt();
                            System.out.println("Great you have ordered");
                            System.out.println("Your order will receive soon");
                        }else if(sr==3){
                            System.out.println("Great you have ordered");
                            System.out.println("Please keep ready with cash your order will receive soon");
                        }else
                            while(sr!=1&&sr!=2&&sr!=3){
                                System.out.println("Invalid option try again");
                                System.out.println("Please select the mode of payment");
                                sr=sc.nextInt();
                            }
                    }

                }
            }

        }else{
            System.out.println("Alright have a good day");
        }

    }
}