/**   
* @Title: MyForthRunB_D.java 
* @Package cn.songzx.forkjoin.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午8:20:38 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.forth.myrunnable.MyForthRunnableB_B;

/**
 * @ClassName: MyForthRunB_D
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午8:20:38
 * 
 */
public class MyForthRunB_D {
	public static void main(String[] args) {
		try {
			MyForthRunnableB_B myRunnable = new MyForthRunnableB_B();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(myRunnable);
			Thread.sleep(1000L);
			pool.shutdownNow();// 返回一个空的List
			pool.execute(myRunnable);
			System.out.println("Main End！");
			Thread.sleep(Integer.MAX_VALUE);

			// shutdown：每个任务正常运行直到结束，池关闭后不允许有新任务被执行并抛出RejectedExecutionException异常

			// shutdownNow结合isInterrupted()==true判断：立即停止当前正在执行的任务，池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常

			// shutdownNow未结合isInterrupted()==true判断：每个任务正常运行直到结束，池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
