//Write a program to add 2+4+6+......+20
abstract class DemoAbstract{
    abstract void printSum();
    void printPrime(){
        int num=15,flag=1;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
class AbstImplementation extends DemoAbstract{
    int sum;
    @Override
    void printSum(){
        for (int i = 2; i <= 20; i=i+2) {
            sum +=i;
        }
        System.out.println(sum);
    }
}

public class JavaApplication3{
    public static void main(String[] args){
        AbstImplementation obj = new AbstImplementation();
        obj.printSum();
        obj.printPrime();
    }
}
//Abstract Class starts with abstract keyword.

