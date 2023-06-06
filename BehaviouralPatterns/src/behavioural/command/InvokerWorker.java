package behavioural.command;

public class InvokerWorker implements Runnable{

	@Override
	public void run() {
		while (true) {
			System.out.println("Checking queue for new commands...");
			int size = InvokerQueue.size();
			if(size > 0) {
				for(int i = 0; i< size; i++) {
					InvokerQueue.pop().execute();
				}
			}else {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
