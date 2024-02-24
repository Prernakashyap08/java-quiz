package TNP;
import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) 
    {     
        
        Scanner sc=new Scanner(System.in);
        System.out.println("DO YOU WANT TO START THE QUIZ? (YES/NO)");
        System.out.print("->");
        String choice=sc.next();
        
        
        
        if(choice.equalsIgnoreCase("Yes"))
        {  
            ArrayList <String> myanswer=new ArrayList<>();
            ArrayList <String> answer=new ArrayList<>();
            
        answer.add("A");
        answer.add("B");
        answer.add("B");
        answer.add("D");
        answer.add("D");
        answer.add("B");
        answer.add("A");
        answer.add("C");
        answer.add("B");
        answer.add("A");
        
        do{
        
        System.out.println("\t\t\t\tMCQ QUIZ\n\n");
        
        System.out.println("1. Which method Retrieve the element at a specified index in ArrayList\nA: <Array_name>.get(index_Number)\nB: <Array_name>.getindex()\nC: <Array_name>.getindex(index_Number)\nD: <Array_name>.retrive(index_Number)");
        System.out.print("\nEnter Your Choice: ");
        String a1=sc.next();
        myanswer.add(a1);
        
        System.out.println("======================================================================================");
        System.out.println("2. Which method in ArrayList Finds size of the ArrayList\nA: <Array_name>.sizeOf()\nB: <Array_name>.size()\nC: <Array_name>.length()\nD: <Array_name>.findSize()");
        System.out.print("\nEnter Your Choice: ");
        String a2=sc.next();
        myanswer.add(a2);
        
        System.out.println("======================================================================================");
        System.out.println("3. Find the output of the following code.\n\n\tint ++a = 100;\n\tSystem.out.println(++a);\nA: 100\nB: compiler Error\nC: 100\nD: None");
        System.out.print("\nEnter Your Choice: ");
        String a3=sc.next();
        myanswer.add(a3);
        
        System.out.println("======================================================================================");
        System.out.println("4. Where does the system stores parameters and local variables whenever a method is invoked?\nA: Heap\nB: Tree\nC: Array\nD: Stack");
        System.out.print("\nEnter Your Choice: ");
        String a4=sc.next();
        myanswer.add(a4);
        
        System.out.println("======================================================================================");
        System.out.println("5. Identify the infinite loop.\nA: for(;;)\nB: for(int i=0;i<1;i--)\nC: for(int i=0;;i++)\nD: ALL OF THE ABOVE");
        System.out.print("\nEnter Your Choice: ");
        String a5=sc.next();
        myanswer.add(a5);
        
        System.out.println("=====================================================================================");
        System.out.println("6. Which Method is used to delete all the names from the 'names' list.\nA: names.delete()\nB: names.clear()\nC: names.clear(i)\nD: names.deleteAll()");
        System.out.print("\nEnter Your Choice: ");
        String a6=sc.next();
        myanswer.add(a6);
        
        System.out.println("=======================================================================================");
        System.out.println("7. Which Method Checks whether any element is present or not.\nA: <array_name>.isEmpty()\nB: <array_name>.Empty()\nC: <array_name>.get()\nD: <array_name>.getEmpty()");
        System.out.print("\nEnter Your Choice: ");
        String a7=sc.next();
        myanswer.add(a7);
        
        System.out.println("======================================================================================");
        System.out.println("8. Which Method Adds elements of newNames list into names.\nA: names.add(newNames)\nB: newNames.add(names)\nC: names.addAll(newNames)\nD: newNames.addAll(names)");
        System.out.print("\nEnter Your Choice: ");
        String a8=sc.next();
        myanswer.add(a8);
        
        System.out.println("======================================================================================");
        System.out.println("9. Which method is Used for Checking whether the element 'Pasta' is present or not in food list.\nA: food.have(Pasta)\nB: food.contains(Pasta); \nC: food.contained(Pasta); \nD: contains.food(Pasta) ");
        System.out.print("\nEnter Your Choice: ");
        String a9=sc.next();
        myanswer.add(a9);
        
        System.out.println("======================================================================================");
        System.out.println("10. Which Method is used for Removing the element from the second index position of food List.\nA: food.remove(2)\nB: food.remove2()\nC: food(remove(2))\nD: food(2).remove");
        System.out.print("\nEnter Your Choice: ");
        String a10=sc.next();
        myanswer.add(a10);
        System.out.println("================================================================================================");
        
        
        
        int count=0;
        int x=answer.size();
        int i=0;
        while(x>0)
        {   
            if((answer.get(i)).equalsIgnoreCase(myanswer.get(i)))
                count++; 
            x--;
            i++;
        }
        System.out.println("Marks Obtained is: "+count+" out of "+answer.size());
        System.out.println("Percentage Scored: "+String.format("%.2f",((double)count*100/answer.size()))+"%");
        
        
        System.out.println("\nDO YOU WANT TO ATTEMPT THE TEST AGAIN? (YES/NO)");
        choice=sc.next();
        if(choice.equalsIgnoreCase("Yes"))
        {
            myanswer.clear();
        }
        
        
        }while(choice.equalsIgnoreCase("Yes"));
       
        System.out.print("\nYour Answer:\t");
        for(int i=0;i< answer.size();i++)
        {
            System.out.print(myanswer.get(i)+"\t");
        }
        
        
        System.out.print("\nCorrect option:\t");
        for(int i=0;i< answer.size();i++)
        {
            System.out.print(answer.get(i)+"\t");
        }
        System.out.println("\n");
        
        
        }
        else
        {
            System.out.println("GO AND STUDY THEN COME AGAIN");
        }
        
    }
    
}
