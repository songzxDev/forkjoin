/**   
* @Title: MySixthRunA_B.java 
* @Package cn.songzx.forkjoin.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午8:51:29 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.sixth.mytask.MySixthRecursiveTaskA;

/**
 * @ClassName: MySixthRunA_B
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午8:51:29
 * 
 */
public class MySixthRunA_B {
	public static void main(String[] args) throws InterruptedException {
		MySixthRecursiveTaskA taskA = null;
		ForkJoinPool pool = new ForkJoinPool();
		for (int i = 0; i < 50; i++) {
			taskA = new MySixthRecursiveTaskA();
			pool.submit(taskA);
		}
		Thread.sleep(50L);
		// getParallelism()：获得并行的数量，与CPU的内核数有关
		// getPoolSize()：获得任务池的大小
		// getQueuedSubmissionCount()：取得已经提交但尚未被执行的任务数量
		// hasQueuedSubmissions()：判断队列中是否有未执行的任务
		System.out.println("getParallelism()=" + pool.getParallelism() + " getPoolSize()=" + pool.getPoolSize() + " getQueuedSubmissionCount()=" + pool.getQueuedSubmissionCount() + " hasQueuedSubmissions()=" + pool.hasQueuedSubmissions());
		do {

		} while (!taskA.isDone());
	}
}
