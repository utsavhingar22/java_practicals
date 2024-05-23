class student
{
String name;
int eno;
int marks1,marks2,marks3;
// null constructor
student()
{
name="Utsav";
eno=19134;
marks1=90;
marks2=89;
marks3=78;
}
// parameterized constructor
student(String n,int r,int m1,int m2,int m3)
{
name=n;
eno=r;
marks1=m1;
marks2=m2;
marks3=m3;
}
// copy constructor
student(student s)
{
name=s.name;
eno=s.eno;
marks1=s.marks1;
marks2=s.marks2;
marks3=s.marks3;
}
void display()
{
System.out.println(name + "\t" +eno+ "\t" +marks1+ "\t" +marks2+ "\t" + marks3);

}
}
class studentdemo
{
public static void main(String arg[])
{
student s1=new student();
student s2=new student("Shubh", 34266, 58, 96, 84);
student s3=new student(s1);
s1.display();
s2.display();
s3.display();
}
}    

