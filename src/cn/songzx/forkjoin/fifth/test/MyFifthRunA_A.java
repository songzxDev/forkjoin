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
public class MyFifthRunA_A {
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
		pool.shutdown();// shutdown()方法关闭pool池之前，isTerminating()方法的返回值一直是false
		System.out.println("B=" + pool.isTerminating());
		System.out.println(task.get());
		Thread.sleep(1000L);
		System.out.println("C=" + pool.isTerminated());
	}
}
