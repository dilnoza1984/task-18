class Main {
  public static void main(String[] args) {
    
   System.out.println(extraEnd("Hello"));  // lololo
   System.out.println(extraEnd("Hi"));  // HiHiHi
System.out.println(extraEnd("ab"));
   System.out.println(extraEnd("World")); 
    System.out.println(extraEnd("saitama"));
    System.out.println(extraEnd("doge"));
    System.out.println(extraEnd("shiba"));
  }




  public static String extraEnd(String str){
     
  String newName = str.substring(str.length()-2);
    newName = newName + newName + newName;
    

     return newName;
  }
}