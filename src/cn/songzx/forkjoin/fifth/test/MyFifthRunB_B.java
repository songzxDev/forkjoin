/**   
* @Title: MyFifthRunB_A.java 
* @Package cn.songzx.forkjoin.fifth 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午8:45:10 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.test;

import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName: MyFifthRunB_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午8:45:10
 * 
 */
public class MyFifthRunB_B {
	public static void main(String[] args) {
		try {
			Runnable runnable = new Runnable() {
				public void run() {
					try {
						System.out.println("打印了！begin " + Thread.currentThread().getName());
						Thread.sleep(1000L);
						System.out.println("打印了！      end " + Thread.currentThread().getName());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			ForkJoinPool pool = new ForkJoinPool();

			pool.execute(runnable);
			System.out.println("A=" + pool.isShutdown());
			/*
			 * 任务被成功运行，由于shutdownNow()方法在源代码内部是用来interrupt()方法，所以interrupt()
			 * 方法遇到sleep() 抛出java.lang.InterruptedException: sleep interrupted异常，
			 * 如果使用 Callable接口，则需要使用Future对象的get()方法获得异常
			 */
			pool.shutdownNow();
			Thread.sleep(5000L);
			System.out.println("B=" + pool.isShutdown());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
