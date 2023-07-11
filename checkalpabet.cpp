#include<iostream>
using namespace std;

int main() 
{
    char A;int b;
    cout<<" enter a character ";
    cin>>A;
    b=A;
    if(b>=65 && b<=97)
    {
        cout<<1<<endl;
    }
    else if(b>=97&&b<=122)
    {
        cout<<0<<endl;
    }
    else
    {
        cout<<-1<<endl;
    }

}