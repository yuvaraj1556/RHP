import java.util.*;
class Student extends Thread{
    int id,N;
    public Student(int id,int N){
        this.id = id;
        this.N = N;
    }
    public void run(){
        for(int i=1;i<=N;i++){
            System.out.println("Student = "+id+" Counter = "+i);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for(int i=1;i<=K;i++){
		    Student s = new Student(i,N);
		    s.start();
		}
	}
}
