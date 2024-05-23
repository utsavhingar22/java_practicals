class std
{
String name;
int id;
String address;
void getdata(String name,int id,String address)
{
this.name=name;
this.id=id;
this.address=address;
}
void putdata()
{
System.out.println("Student details are :");
System.out.println("Name :" +name);
System.out.println("ID :" +id);
System.out.println("Address :" +address);
}
}
class stddemo
{
public static void main(String arg[])
{
std s=new std();
s.getdata("Utsav",768,"Rajasthan");
s.putdata();
}
}
