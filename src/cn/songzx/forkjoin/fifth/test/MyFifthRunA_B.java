/**   
* @Title: MyFifthRunA_A.java 
* @Package cn.songzx.forkjoin.fifth 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午8:33:15 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @ClassName: MyFifthRunA_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午8:33:15
 * 
 */
public class MyFifthRunA_B {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
					String newStr = new String();
					Math.random();
					Math.random();
					Math.random();
					Math.random();
					Math.random();
					Math.random();
				}
			}
		};

		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask task = pool.submit(runnable);
		Thread.sleep(500L);
		System.out.println("A=" + pool.isTerminating());
		/*
		 * 在控制台打印了java.util.concurrent.CancellationException异常信息，说明先调用shutdown()
		 * ， 再调用get()方法不出现异常，而先调用shutdownNow()，再调用get()方法出现异常，说明方法shutdown()
		 * 和shutdownNow()在对get()方法上的处理行为上是不一样的
		 * 
		 */
		pool.shutdownNow();
		System.out.println("B=" + pool.isTerminating());
		System.out.println(task.get());
		Thread.sleep(1000L);
		System.out.println("C=" + pool.isTerminated());
	}
}
