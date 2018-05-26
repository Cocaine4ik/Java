package MultithreadedProgramming;

public class MyThread3 implements Runnable {

	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	// build new thread
	MyThread3(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start(); // start thread
		
	}
	// start executing new thread
	public void run() {
		
		int sum;
		
		System.out.println(thrd.getName() + " starting.");
		answer = sa.sumArray(a);
		System.out.println("Sum " + thrd.getName() + " " + answer);
		
		System.out.println(thrd.getName() + " terminating");
	}

}
