import java.util.Scanner;
class Stack1
{
      
    
    //data member
    int st[],size,top;
    //const
    public Stack1(int cap)
    {
        size=cap;
        top =-1;
        st=new int [size];
    }
    //delete
    public int pop()
    {
         
        int v =-9999;
        if(top >=0)
        {
            v=st[top];
            --top;
        }
        else
        {
            System.out.println("Stack Underflow");
                }
        return v;
    
    }   
    void push(int v)
    {
        if(top <(size-1))
        {
            
            st[++top]=v;
        }
        else 
            System.out.println("OVERFLOW");
        
    }
    void display()
    {
       
          for(int i=top;i>=0;i--)
              System.out.println(st[i]);
        
    }

    public static void main()
    {        
        Scanner in =new Scanner(System.in);
        System.out.println("Enter limit ");
        int n=in.nextInt();//5
        Stack1 ob=new Stack1(n);  
        int i;
        System.out.println("ENTER 1 TO INSERT "+ " \n ENTER 2 TO Delete \n ENTER 3 TO Display \n ENTER 4 TO EXIT ");
        for(i=0;;i++) //while()
        {
            System.out.println("ENTER YOUR CHOICE ");
            int ch = in.nextInt();
            switch(ch)
            {
                case 1 : System.out.println(" ENTER VALUE TO BE INSERTED ");
                         int v=in.nextInt();
                         ob.push(v);
                         break;  
                case 2 : int y=ob.pop();//push -9999 it will not work
                         if (y != -9999)
                         System.out.println(" Element deleted is =" +y);
                         break;
                case 3 : int m = ob.pop();
                         if(m== -9999)
                         {
                             System.out.println("Stack underflow ");
                         }
                         else
                         {
                             ob.display();
                         }
                         break;
                case 4 : System.exit(0);
                         break;
                default : System.out.println(" Wrong Choice ");
            
            }//switch case
            
        }//loop
        
    }
}
