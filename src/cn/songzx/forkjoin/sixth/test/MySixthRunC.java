/**   
* @Title: MySixthRunB.java 
* @Package cn.songzx.forkjoin.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午9:35:36 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.sixth.mytask.MySixthRecursiveTaskC;

/**
 * @ClassName: MySixthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午9:35:36
 * 
 */
public class MySixthRunC {
	public static void main(String[] args) {
		MySixthRecursiveTaskC task = new MySixthRecursiveTaskC(1, 900000);
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(task);
		do {
			// getParallelism()：获得并行的数量，与CPU的内核数有关
			// getPoolSize()：获得任务池的大小
			// getQueuedSubmissionCount()：取得已经提交但尚未被执行的任务数量
			// hasQueuedSubmissions()：判断队列中是否有未执行的任务
			// getActiveTheadCount()：获得活动线程的个数
			// getQueuedTaskCount()：获得任务的总个数
			// getStealCount()：获得偷窃的任务个数
			// getRunningThreadCount()：获得正在运行并且不在阻塞状态下的线程个数
			// isQuiescent()：判断任务池是否是静止未执行的状态
			System.out.println("getParallelism()=" + pool.getParallelism() + " getPoolSize()=" + pool.getPoolSize() + " getActiveThreadCount()=" + pool.getActiveThreadCount() + " getQueuedTaskCount()=" + pool.getQueuedTaskCount() + " getStealCount()=" + pool.getStealCount() + " getQueuedSubmissionCount()=" + pool.getQueuedSubmissionCount() + " getRunningThreadCount()=" + pool.getRunningThreadCount() + " isQuiescent()=" + pool.isQuiescent());
		} while (!task.isDone());
	}
}
