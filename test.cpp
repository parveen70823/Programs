Program 1
// function overloading program
#include <iostream>
using namespace std;
void function_1()
{
    cout << "\n1. Tony";
}

void function_1(string a)
{
    cout << "\n2. " << a;
}

void function_1(string a, string b)
{
    cout << "\n3. " << a << " " << b;
}

int main()
{
    function_1();
    function_1("tony");
    function_1("tony", "stark");

    return 0;
}
Output:
1. tony   2.stark   3.Tony stark



Program 2:
// class in c++
#include <iostream>
using namespace std;
class student
{
    int a = 4;

public:
    int b = 5;
    string name;
    void get_name()
    {
        cin >> name;
    }
    void print_name()
    {
        cout << name;
    }
};

student s[2];

int main()
{
    for (int i = 0; i < 2; i++)
    {
        s[i].get_name();
    }

    for (int i = 0; i < 2; i++)
    {
        s[i].print_name();
        cout << "\n";
    }

    return 0;
}

Output:
Tony
Stark
Tony
Stark










Program 3:
// static data member
#include<iostream>
using namespace std;
class item
{
    private:
        static int count;     // static data member
        int number;
    public:
        void get_data(int a)
        {
            number=a;
            count++;
        }
        void get_count()
        {
            cout<<"\nValue of count:"<<count;
        }
};
int item::count;
int main()
{
    item a,b,c;
    a.get_count();
    b.get_count();
    c.get_count();
    a.get_data(100);
    b.get_data(200);
    c.get_data(300);
    a.get_count();
    b.get_count();
    c.get_count();
    return 0;
}

Output:
Value of count:0
Value of count:0
Value of count:0
Value of count:3
Value of count:3
Value of count:3












Program 4:
// static member function
#include<iostream>
using namespace std;
class test
{
    private:
        int code;
        static int count;          // static data member
    public:
        void setcode()
        {
            code=++count;
        }
        void showcode()
        {
            cout<<"\nobject no."<<code;
        }
        static void showcount()    // static member function
        {
            cout<<"\ncount:"<<count; 
        }
};
int test:: count;
int main()
{
    test t1,t2;
    t1.setcode();
    t2.setcode();
    test::showcount();
    test t3;
    t3.setcode();
    test:: showcount();
    t1.showcode();
    t2.showcode();
    t3.showcode();
    return 0;
}

Output:
count:2
count:3
object no.1
object no.2
object no.3











Program 5:
// object as function argument 
#include<iostream>
using namespace std;
class time
{
    private:
        int hr;
        int min;
    public:
        void put_time(int h,int m)
        {
            hr=h;
            min=m;
        }
        void get_time()
        {
            cout<<"\nhour:"<<hr<<" min:"<<min;
        }
        void sum(time,time);
};
void time::sum(time t1,time t2)
{
    min=(t1.min+t2.min);
    hr=min/60;
    min=min%60;
    hr=t1.hr+t2.hr+hr;
}
int main()
{
    time T1,T2,T3;
    T1.put_time(2,45);
    T2.put_time(3,30);
    T3.sum(T1,T2);
    T1.get_time();
    T2.get_time();
    T3.get_time();
    return 0;
}

Output:
hour:2 min:45
hour:3 min:30
hour:6 min:15












Program 6:
// friend function
#include<iostream>
using namespace std;
class sample
{
    private:
        int a;
        int b;
    public:
        void setvalue()
        {
            a=25;
            b=40;
        }
        friend float mean(sample s)    
        {
            return float(s.a+s.b)/2;
        }
};
int main()
{
    sample x;                               
    x.setvalue();
    cout<<"\nMean:"<<mean(x);

    return 0;
}
Output:   Mean:32.5
Program 7:
// friend function with 2 class
#include<iostream>
using namespace std;
class abc;
class xyz
{
    private:
        int x;
    public:
        void setvalue(int i)
        {
            x=i;
        }
        friend void max(abc,xyz);       
};                                      
class abc
{
    private:
        int a;
    public:
        void setvalue(int i)
        {
            a=i;
P       }
        friend void max(abc,xyz);    
};
void max(abc m, xyz n)
{
    if (m.a>=n.x)
    {
        cout<<m.a;
    }
    else
    {
        cout<<n.x;
    }
}

int main()
{
    abc ab;      
    xyz xy;
    ab.setvalue(3);
    xy.setvalue(4);
    max(ab,xy);

    return 0;
}

Output:
4





Program 8:
// friend class 
#include<iostream>
using namespace std;
class first
{
    private:
        int x;
    public:
        first()
        {
            x=44;
        }
        friend class second;
};
class second
{
    public:
        void show(first obj)
        {
            cout<<"\nx: "<<obj.x;
        }
};

int main()
{
    first obj_first;
    second obj_second;
    obj_second.show(obj_first);
    return 0;
}
Output:   x: 44

Program 9:
//default constructor
#include<iostream>
using namespace std;
class sample
{
    private:
        int m,n;
    public:
        sample()         //  default constructor
        {
            m=10, n=20;
        }
        void show()
        {
            cout<<"\nm: "<<m<<"\nn: "<<n;
        }
};
int main()
{
    sample s;
    s.show();
    return 0;
}
Output: m:10  n:20
Program 10:
// parametric constructor:
#include<iostream>
using namespace std;
class sample
{
    private:
        int m,n;
    public:
        sample(int i,int j)            
        {
            m=i;
            n=j;
        }
        void show()
        {
            cout<<"\nm: "<<m<<"\nn: "<<n;
        }
};
int main()
{
    sample s(1,3);
    s.show();
    return 0;
}

Output:
m: 1
n: 3
Program 11:
// copy constructor:
#include <iostream>
using namespace std;
class code
{
    private:
        int id;
    public:
        code()              // default constructor
        {
        }
        code(int a)         // parametric constructor
        {
            id=a;
        }
        code(code &x)       //  copy constructor
        {
            id=x.id;
            // x.id=200;
        }
        void display()
        {
            cout<<"\n"<<id;
        }


};
int main()
{
    code A(100);       // parametric constructor
    code B(A);          // copy constructor
    code C=A;
    code D;
    D=A;
    A.display();
    B.display();
    C.display();
    D.display();
    return 0;
}

Output:
100
100
100
100









Program 12:
// destructor
#include<iostream>
using namespace std;
int count=0;
class alpha
{
    public:
        alpha()      // default constructor
        {
            count++;
            cout<<"\nNo. of object created: "<<count;
        }
        ~alpha()
        {
            cout<<"\nNo. of object destroyed: "<<count;
            count--;
        }
};
int main()
{
    cout<<"\nEnter main";
    alpha A1,A2,A3,A4;        
    {
        cout<<"\nEnter block";
        alpha A5;                  
    }
    {
        cout<<"\nEnter block:";
        alpha A6;                   // same as A5
    }
    cout<<"\nRe-enter main";
    return 0;
}

Output:
Enter main
No. of object created: 1
No. of object created: 2
No. of object created: 3
No. of object created: 4
Enter block
No. of object created: 5
No. of object destroyed: 5
Enter block:
No. of object created: 5
No. of object destroyed: 5
Re-enter main
No. of object destroyed: 4
No. of object destroyed: 3
No. of object destroyed: 2
No. of object destroyed: 1





Program 13:
// array of objects
#include<iostream>
using namespace std;
class students
{
    private:
        string name;
        int roll_no;
    public:
        void get_data()
        {
            cin>>name>>roll_no;
        }
        void show_data()
        {
            cout<<"\nname: "<<name<<" roll_no: "<<roll_no;
        }

};
int main()
{
    students obj[3];
    obj[0].get_data();
    obj[1].get_data();
    obj[2].get_data();
    obj[0].show_data();
    obj[1].show_data();
    obj[2].show_data();
    return 0;
}

Output:
rahul 01
ram 02
ravi 03

name: rahul roll_no: 1
name: ram roll_no: 2
name: ravi roll_no: 3















Program 14:
// object as function argument with return 
#include<iostream>
using namespace std;
class abc
{
    private:
        int x;
    public:
        void get_value()
        {
            cout<<"\nEnter the value of x:";
            cin>>x;
        }
        void show_data()
        {
            cout<<"\nx: "<<x;
        }
        abc copy_data(abc obj)
        {
            abc example_obj;
            example_obj.x=obj.x;
            return example_obj;
        }
};
int main()
{
    abc obj_1,obj_2;
    obj_1.get_value();
    obj_1.show_data();
    obj_2=obj_1.copy_data(obj_1);
    obj_2.show_data();
    return 0;
}

Output:
Enter the value of x:5

x: 5
x: 5

















Program: 15
// dynamic constructor:
#include<iostream>
#include<cstring>
using namespace std;
class String
{
    private:
        char * name;
        int length;
    public:
        String()        // default constructor
        {  
            length=0;
            name=new char[length];
        }
        String(char*s)       // parametric constructor
        {
            length=strlen(s);
            name=new char[length+1];      // name is pointer
            strcpy(name,s);
        }
        void display()
        {
            cout<<"\nname: "<<name<<" length: "<<length;
        }
        void join(String &a,String &b)
        {
            length=a.length + b.length;
            delete(name);
            name=new char[length+1];
            strcpy(name,a.name);         // strcpy replace the content of destination string with source string
            strcat(name,b.name);         // strcat will append instead of replacing. NOTE: first argument is destination string and second is source string
        }
};

int main()
{
    char *first="Joseph";
    // string s;
    String name1("first"),name2("loyis"),name3("John"),s1,s2;
    s1.join(name1,name2);
    s2.join(s1,name3);
    name1.display();
    name2.display();
    name3.display();
    s1.display();
    s2.display();

    return 0;
}
Output:
name: first length: 5
name: loyis length: 5
name: John length: 4
name: firstloyis length: 10        
name: firstloyisJohn length: 14
Program 16:
// Operator overloading (unary):
#include<iostream>
using namespace std;
class space
{
    private:
        int x,y,z;
    public:
        void getdata(int,int,int);
        void display();
        void operator -();                     // operator overloading
};
void space :: getdata(int a, int b, int c)
{
    x=a;
    y=b;
    z=c;
}
void space :: display()
{
    cout<<"\nx: "<<x<<" y: "<<y<<" z: "<<z;
}
void space :: operator -()
{
    x=-x;
    y=-y;
    z=-z;
}
int main()
{
    space s;
    s.getdata(10,-20,30);
    s.display();
    -s;
    s.display();
    return 0;
}
Output:
x: 10 y: -20 z: 30
x: -10 y: 20 z: -30














Program 17:
// binary operator overloading
#include<iostream>
using namespace std;
class complex
{
    private:
        float x,y;
    public:
        complex()
        {
        }
        complex(float r, float i)
        {
            x=r;
            y=i;
        }
        complex operator +(complex);        
        void display();
};
complex complex :: operator +(complex c)
{
    complex temp;
    temp.x = x + c.x;
    temp.y = y + c.y;
    // cout<<"\n          "<<x<<" "<<y;        
    return temp;
}
void complex:: display()
{
    cout<<"\n"<<x<<" + "<<y<<" i";
}


int main()
{
    complex c1,c2,c3;
    c1=complex(2.5,3.5);
    c2=complex(1.6,2.7);
    c3= c1+c2;
    c1.display();
    c2.display();
    c3.display();
    return 0;
}

Output:
2.5 + 3.5 i
1.6 + 2.7 i
4.1 + 6.2 i






Program 18:
// class template:
#include<iostream>
using namespace std;
template<class T1, class T2>        // template
class test
{
    private:
        T1 a;
        T2 b;
    public:
        test(T1 x, T2 y)        // parametric constructor
        {
            a=x;
            b=y;
        }
        void show()
        {
            cout<<"\na: "<<a<<" b: "<<b;
        }
};
int main()
{
    test <float, int> test_1(1.23,12);
    test <int , char> test_2(100,'w');
    test_1.show();
    test_2.show();
    return 0;
}

Output:
a: 1.23 b: 12
a: 100 b: w

Program 19:
// function template
#include<iostream>
using namespace std;
template<class T1, class T2>
void display(T1 x, T2 y)
{
    cout<<"\nx: "<<x<<" y: "<<y;
}
int main()
{
    display(19,"ABC");
    display(12.3,123);
    return 0;
}
Output:
x: 19 y: ABC
x: 12.3 y: 123




Program 20:
// Exception handling:
#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"Enter the value of a and b: ";
    cin>>a>>b;
    int x=a-b;
    try
    {
        if(x!=0)
        {
            cout<<"\na/x: "<<a/x;
        }
        else
        {
            throw(x);
        }

    }
    catch(int i)
    {
        cout<<"Exception caught x: "<<i;
    }
    return 0;
}

Output:
Enter the value of a and b: 3 3
Exception caught x: 0

Program 21:
// exception handing for a function
#include<iostream>
using namespace std;
void divide(int x,int y,int z)
{
    cout<<"\nWe are inside function";
    if ((x-y)!=0)
    {
        int r=z/(x-y);
        cout<<"\nr: "<<r;
    }
    else
    {
        throw(x-y);
    }
}
int main()
{
    try
    {
        cout<<"\nTry block";
        divide(10,20,30);
        divide(10,10,20);
    }
    catch(int i)
    {
        cout<<"\nDivision by 0 exception";
    }
    return 0;

}

Output:
Try block
We are inside function
r: -3
We are inside function
Division by 0 exception











Program 22:
// Exception handling: different catch types
#include<iostream>
using namespace std;
void test(int x)
{
    try
    {
        if(x==1)
            throw x;
        else if(x==0)
            throw 'x';
        else if (x==-1)
            throw 1.0;
        cout<<"\nEnd of try block";
    }
    catch(char c)
    {
        cout<<"\ncaught a character";
    }
    catch(int m)
    {
        cout<<"\ncaught an integer";
    }
    catch(double d)
    {
        cout<<"\ncaught a double";
    }
    cout<<"\nEnd of try catch system";
}
int main()
{
    cout<<"\nTesting multiple catched";
    cout<<"\nx==1";
    test(1);
    cout<<"\nx==0";
    test(0);
    cout<<"\nx==-1";
    test(-1);
    cout<<"\nx==2";
    test(2);
    return 0;
}

Output:
Testing multiple catched
x==1
caught an integer
End of try catch system
x==0
caught a character
End of try catch system
x==-1
caught a double
End of try catch system
x==2
End of try block
End of try catch system
Program 23:
// Exception handling: same catch block for all datatypes
#include<iostream>
using namespace std;
void test(int x)
{
    try
    {
        cout<<"\nEnter try block";
        if(x==0)
            throw(x);               // int
        if(x==-1)
            throw('x');             // char
        if(x==1)
            throw(1.1);             // float
        cout<<"\nExit try block";
    }
    catch(...)
    {
        cout<<"\ncaught all exceptions";
    }
}
int main()
{
    cout<<"\nTesting generic catch";
    test(-1);
    test(0);
    test(1);
    return 0;
}

Output:
Testing generic catch
Enter try block
caught all exceptions
Enter try block
caught all exceptions
Enter try block
caught all exceptions















Program 24:
// Exception handling: catch more than 1 times 
#include<iostream>
using namespace std;
void divide(double x,double y)
{
    cout<<"\nInside function";
    try
    {
        if(y==0.0)
            throw(y);           // throwing double
        else
            cout<<"\nDivision "<<x/y;
    }
    catch(double d)
    {
        cout<<"\nCaught double inside function";
        throw;
    }
    cout<<"\nEnd of function";
}

int main()
{
    cout<<"\nInside main";
    try
    {
        divide(10.5,2.0);
        divide(20.0,0.0);
    }
    catch(double)
    {
        cout<<"\nCaught double inside main";
    }
    cout<<"\nEnd of main";
    return 0;
}

















Program 25:
// single inheritance
#include<iostream>
using namespace std;
class B                        // parent class
{
    int a;
    public:
        int b;
        void get_ab();
        int get_a();
        void show_a();
};
                                // child class
class D:public B      // class parent_class_name : inheritance_mode child_class_name
{
    int c;
    public:
        void mul();
        void display();
};

void B:: get_ab()
{
    a=5;
    b=10;
}
int B:: get_a()
{
    return a;
}
void B::show_a()
{
    cout<<"a= "<<a<<"\n";
}
void D::mul()
{
    c=b*get_a();
}
void D:: display()
{
    cout<<"a= "<<get_a()<<"\n";
    cout<<"b= "<<b<<"\n";
    cout<<"c= "<<c<<"\n";
}
int main()
{
    D d;
    d.get_ab();
    d.mul();
    d.show_a();
    d.display();
    d.b=20;
    d.mul();
    d.display();
    return 0;
}

Output:
a= 5
a= 5
b= 10
c= 50
a= 5
b= 20
c= 100


Program 26:
// multiple heritance
#include<iostream>
using namespace std;
class A
{
    public:
        void show_A()
        {
            cout<<"\nclass A";
        }
};

class B
{
    public:
        void show_B()
        {
            cout<<"\nclass B";
        }
};

class C: public A,public B
{
    public:
        void show_C()
        {
            cout<<"\nclass C";
        }
};

int main()
{
    C obj_c;
    obj_c.show_C();
    obj_c.show_B();
    obj_c.show_A();
}







Program 27:
// hierarchical inheritance
#include<iostream>
using namespace std;
class A
{
    public:
        void show_A()
        {
            cout<<"\nclass A";
        }
};

class B: public A
{
    public:
        void show_B()
        {
            cout<<"\nclass B";
        }
};

class C: public A
{
    public:
        void show_C()
        {
            cout<<"\nclass C";
        }
};

class D: public A
{
    public:
        void show_D()
        {
            cout<<"\nclass D";
        }
};
int main()
{
    B obj_b;
    C obj_c;
    D obj_d;
    obj_b.show_A();
    obj_c.show_A();
    obj_d.show_A();
    return 0;
}

Output:
class A
class A
class A



Program 28:
// multilevel inheritance
#include<iostream>
using namespace std;
class A
{
    public:
        void show_A()
        {
            cout<<"\nclass A";
        }
};

class B: public A
{
    public:
        void show_B()
        {
            cout<<"\nclass B";
        }
};

class C: public B
{
    public:
        void show_C()
        {
            cout<<"\nclass C";
        }
};

int main()
{
    C obj_c;
    obj_c.show_C();
    obj_c.show_B();
    obj_c.show_A();
}

Output:
class C
class B
class A












Program 29:
// hybrid inheritance
#include<iostream>
using namespace std;
class A
{
    public:
        void show_A()
        {
            cout<<"\nclass A";
        }
};

class B: virtual public A
{
    public:
        void show_B()
        {
            cout<<"\nclass B";
        }
};

class C: virtual public A
{
    public:
        void show_C()
        {
            cout<<"\nclass C";
        }
};

class D: public B, public C
{
    public:
        void show_D()
        {
            cout<<"\nclass D";
        }
};

int main()
{
    B obj_b;
    C obj_c;
    D obj_d;
    obj_b.show_A();
    obj_c.show_A();
    obj_d.show_A();

}

Output:
class A
class A
class A


Program 30:
// Ambiguity in inheritance:
// 1. Using scope resolution operator
#include<iostream>
using namespace std;
class A
{
    public:
        void display()
        {
            cout<<"\nClass A";
        }
};
class B: public A
{
    public:
        void display()
        {
            cout<<"\nClass B";
        }
};
int main()
{
    B b;
    b.display();       // class B display function will run
    b.A::display();    // class A -----------------
    b.B::display();     // class B------------
    return 0;
}

Output:
Class B
Class A
Class B

Program 31:
// 2. Using pointer 
#include<iostream>
using namespace std;
class B
{
    public:
        int b;
        void show()
        {
            cout<<"\nb= "<<b;
        }
};

class D: public B
{
    public:
        int d;
        void show()
        {
            cout<<"\n b= "<<b;
            cout<<"\n d= "<<d;
        }
};
int main()
{
    // 1.
    B *bptr;
    B base;
    bptr= &base;
    bptr->b=100;
    bptr->show();

    // 2.
    D derived;
    bptr= &derived;           // it can access only inherited data members and member function
    bptr->b=200;                    // because it is a pointer of parent class
    // bptr->d=300;              // It will give error 
    bptr->show();

    // 3.
    D *dptr;
    dptr= &derived;
    dptr->d=300;
    dptr->show();           // show function of class D will run

    // 4.
    (D*)bptr->d=400;
    (D*)bptr->show();
    return 0;
}

Output:
b= 100
b= 200
 b= 200
 d= 300
b= 200
 d= 400


Program 32:
// 3. Using virtual function
#include<iostream>
using namespace std;
class Base
{
    public:
        void display()
        {
            cout<<"\nDisplay base";
        }
        virtual void show()
        {
            cout<<"\nShow base";
        }

};

class Derived: public Base
{
    public:
        void display()
        {
            cout<<"\nDisplay derived";
        }
        void show()
        {
            cout<<"\nShow derived";
        }
};

int main()
{
    Base b;
    Derived d;
    Base* bptr;
    bptr= &b;
    bptr->display();       // class Base
    bptr->show();           // class Base
    bptr =&d;
    bptr->display();        // class Derived
    bptr->show();           // derived class's show function will be called because it is made virtual in base class
    return 0;
}

Output:
Display base
Show base
Display base
Show derived

Program 33:
// constructor in inheritance
#include<iostream>
using namespace std;
class alpha
{
    int x;
    public:
        alpha(int a)
        {
            x=a;
        }
        void show_x()
        {
            cout<<"\nx: "<<x;
        }
};
class beta
{
    float y;
    public:
        beta(float j)
        {
            y=j;
        }
        void show_y()
        {
            cout<<"\ny: "<<y;
        }
};
class gamma: public beta, public alpha          // order of calling constructor: beta-alpha-gamma
{
    int m,n;
    public:
        gamma(int a,float b,int c,int d):alpha(a),beta(b)
        {
            m=c;
            n=d;
        }
        void show_mn()
        {
            cout<<"\nm: "<<m<<"  n: "<<n;
        }
};
int main()
{
    gamma g(5,10.5,3,7);
    g.show_x();
    g.show_y();
    g.show_mn();
    return 0;
}

Output:
x: 5
y: 10.5
m: 3  n: 7

Program 34:
// virtual class :
#include<iostream>
using namespace std;
class A
{
    public:
        void show_A()
        {
            cout<<"\nclass A";
        }
};

class B: virtual public A
{
    public:
        void show_B()
        {
            cout<<"\nclass B";
        }
};

class C: virtual public A
{
    public:
        void show_C()
        {
            cout<<"\nclass C";
        }
};

class D: public B, public C
{
    public:
        void show_D()
        {
            cout<<"\nclass D";
        }
};

int main()
{
    B obj_b;
    C obj_c;
    D obj_d;
    obj_b.show_A();
    obj_c.show_A();
    obj_d.show_A();
    return 0;

}
Output:
class A
class A
class A



Program 35: // Abstract class
#include<iostream>
using namespace std;
class base                                      // abstract class
{
    int x;
    public:
        virtual void fun()=0;                   // pure virtual function
        int show()
        {
            return x;
        }
};
class derived: public base
{
    int y;
    public:
        void fun()    {                         // overriding of pure virtual function
    cout<<"\nfun is called";
        }
};
int main()
{
    derived d;
    d.fun();
    return 0;
}
Output:
fun is called.
