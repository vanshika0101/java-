class Prime{
public static void main(String[]args){
int a=5;
if(isPrime(a)){
System.out.println(a+"is prime");
}
else{
System.out.println(a+ "is not prime");

}
}
public static boolean  isPrime(int a){
if(a<=1){
return false;
}
for(int i=2;i<a/2;i++){
if(a%i==0){
return false;
}
}
return true;
}

}
