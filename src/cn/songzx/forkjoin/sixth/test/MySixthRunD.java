/**   
* @Title: MySixthRunD.java 
* @Package cn.songzx.forkjoin.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午9:58:53 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import cn.songzx.forkjoin.sixth.mytask.MySixthRecursiveTaskD;

/**
 * @ClassName: MySixthRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午9:58:53
 * 
 */
public class MySixthRunD {
	public static void main(String[] args) throws InterruptedException {
		MySixthRecursiveTaskD actionA = new MySixthRecursiveTaskD();
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask task = pool.submit(actionA);
		// isCompletedAbnormally()：判断任务是否出现异常
		// isCompletedNormally()：判断任务是否正常执行完毕
		System.out.println(task.isCompletedAbnormally() + " " + task.isCompletedNormally());
		Thread.sleep(2000L);
		System.out.println(task.isCompletedAbnormally() + " " + task.isCompletedNormally());
		// getException()：返回报错异常
		System.out.println(task.getException());
	}
}
