// Creating thread By Extending To Thread class

class MyThread extends Thread {

	// Method 1
	// Run() method for our thread
	public void run()
	{

		// Print statement
		System.out.println("Thread is running created by extending to parent Thread class");
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of our thread class inside main()
		// method
		MyThread myThread = new MyThread();
		// Starting the thread
		myThread.start(); 
	}
}
