#include <iostream>
using namespace std;

template<class T>
class myqueue{
    private:
    struct Node{
        T data;
        Node *next;
        Node(T d){data=d;next=NULL;}
    };
    Node *head=NULL,*end=NULL; int lsize=0;
    public:
    int push(T d){
        if(head==NULL) {
            head=new Node(d);lsize++;
            end=head;
        }
        else{
            end->next=new Node(d);lsize++;
            end=end->next;
        }
        return 0;
    }
    T front(){
        if(lsize>0) return head->data;
        else return (T)0;
    }
    int pop(){
        if(lsize>1){
            Node *temp=head->next;
            delete head; head=temp;lsize--;
        }
        else if(lsize==1){
            delete head; head=end=NULL;lsize--;
        }
        return 0;
    }
    int size(){return lsize;}
    bool empty(){return lsize?false:true;}
};

//self test
int main(){
    myqueue<int> qu;
    for(int i=1;i<=4;i++) {
        int n; cin>>n;qu.push(n);
    }
    while(!qu.empty()){cout<<qu.front()<<" ";qu.pop();}
}


//Code contributed by @muntaxir4
