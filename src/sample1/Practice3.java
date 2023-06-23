package sample1;

public class Practice3 

{
public static void main(String[] args) 
{
String name = "badshah,shubham,gopal,tushar";
int rollnum = 1010;
float per = 78.54f;
char grade = 'a';
 
String sname="rahul";
int classno=212;
float point =9.5f;
char section= 'c';



System.out.println("studnet name="+name);
System.out.println("studnet rollnum="+rollnum);
System.out.println("studnet per="+per+"%");
System.out.println("studnet grade="+grade);
System.out.println("------------------------");
System.out.println(sname+"\n"+classno+"\n"+point+"\n"+section);
System.out.println("------------------------");
System.out.println(sname+System.lineSeparator()+classno+System.lineSeparator()+point+System.lineSeparator()+section);
}
}