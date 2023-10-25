public class CircularQueue
{
    int queue[];
    int front, rear, size;
    CircularQueue()
    {
        size=5;
        queue=new int[size];
        front=rear=-1;
    }

    CircularQueue(int size)
    {
        this.size=size;
        queue=new int[size];
        front=rear=-1;
    }

    public void enqueue(int item)
    {
        if((front==0 && rear==size-1) || (front==rear+1))
        {
            System.out.println("Queue Overflow !!!");
            return;
        }
        if(front==-1 && rear==-1)
        {
            front=rear=0;
        }
        else if (rear==size-1)
        {
            rear=0;
        }
        else{
            rear++;
        }
        queue[rear]=item;
        System.out.println(item+" Inserted!!");
    }

    public void dequeue()
    {
        if(front==-1){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(queue[front]+" Deleted");
        if(front==rear)
        {
            front=rear=-1;
        }
        else if (front==size-1)
        {
            front=0;
        }
        else{
            front++; 
        }
    }

    public void display()
    {
        if(front==-1)
        {
            System.out.println("Queue Is Empty");
            return;
        }
        if(front>rear){
            for(int i=front; i<size; i++)
            {
                System.out.print(queue[i]+"\t");
            }
            for(int i=0; i<=rear; i++)
            {
                System.out.print(queue[i]+"\t");
            }
        }
        else
        {
            for(int i = front; i<=rear; i++)
            {
                System.out.print(queue[i]+"\t");
            }
        }
    }
} 