import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService =  Executors.newSingleThreadExecutor();
		
		ExecutorService executorService1 =  Executors.newFixedThreadPool(2);
		

		//Future result = executorService.submit(new calcFactorialCallable(2));
		//executorService.submit(new calcFactorialRunnable(3));		
		 executorService1.submit(new calcFactorialRunnable(3));
		 executorService1.submit(new calcFactorialCallable(5));
		
		
		
		//System.out.println(result.get());
		
	}
	
}



class calcFactorialRunnable implements Runnable {
	
	private int n;
	
	public calcFactorialRunnable(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName().toString());
	}
	
	
}

class calcFactorialCallable implements Callable<Long>{

	private int n;
	
	public calcFactorialCallable(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	
	public Long call() throws Exception {
		return calcFactorial(2);
	}

	
 private Long calcFactorial(int n) throws InterruptedException{
	 
	 
	 long result= 1;
	 
	 while(n!= 0) {
		 result = result * n;
		 n = n -1;
		 Thread.sleep(1000);
	 }
	 
	 return result; 
 }
}






