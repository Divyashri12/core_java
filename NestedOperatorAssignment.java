class NestedOperatorAssignment{
public static void main(String[] args){

int x=2;
int y=9;
int z=-11;
int large=(x>=y)?((x>=z)?x:z):((y>=z)?y:z);
System.out.println("Largest number "+large);

}
}