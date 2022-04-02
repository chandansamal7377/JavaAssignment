
class Sum {
   public static void main (String args[]) {

   int count=0, sum=0;
   for(int i=0;i<args.length;i++){
  try
  {
   sum+=Integer.parseInt(args[i]);
  }
  catch (NumberFormatException e)
  {
    System.out.println("invalid integer:");
    count++;
 }
}
System.out.println("Sum of only valid integers is= "+sum) ;

System.out.println("Invalid integers are: "+count) ;
}
}