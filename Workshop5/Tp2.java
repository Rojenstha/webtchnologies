class Tp2{   
       public static void main(String[] args){
        a obj= new a();
        b x= new b();
        obj.A=666;
        System.out.println("Name: "+x.one+" ID:"+obj.A);
        System.out.println("Name: "+x.two+" ID:"+obj.B);
     }
    }
class a{ 
  int A=101;
  int B=102;
}
class b{
  String one= "Jay";
  String two= "Veeru";
}
