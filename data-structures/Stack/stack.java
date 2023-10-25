class Stack
{
    private int arr[];
    private int size;
    private int top;
    Stack()
    {
        this.size =3;
        this.arr = new int[size];
        this.top=-1;
    }

    Stack(int s)
    {
        this.size = s;
        this.arr = new int[size];
        this.top=-1;
    }

    public void push(int item)
    {
        if(this.top == this.size-1)
        {
            System.err.println("STACK OVERFLOW EXCEPTION");
        }
        else
        {
            this.top++;
            arr[this.top]=item;
        }
    }

    public void pop()
    {
        if(this.top == -1)
        {
            System.err.println("STACK-UNDERFLOW ERROR");
        }
        else
        {
            System.out.println(this.arr[this.top]+" popped !!");
            this.top--;
        }
    }

    public void peek()
    {
        if(this.top == -1)
        {
            System.out.println("Stack Is Empty!! Go And Push Elements!!");
            return;
        }
        System.out.println(this.arr[this.top]);
    }

    public void display()
    {
        System.out.println("CONTENTS OF THE STACK");
        System.out.println("--------");

        if(top == -1)
        {
            System.out.println("STACK IS EMPTY");
            return;
        }
        for(int i = this.top ; i >= 0 ; i--)
        {
            System.out.println("|"+this.arr[i]+"|");
            System.out.println("----------");
        }
        System.out.println("--------");
    }
}