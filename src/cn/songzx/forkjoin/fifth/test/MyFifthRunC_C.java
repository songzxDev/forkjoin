/**   
* @Title: MyFifthRunC_C.java 
* @Package cn.songzx.forkjoin.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午9:09:04 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import cn.songzx.forkjoin.fifth.myrunnable.MyFifthRunnableB;

/**
 * @ClassName: MyFifthRunC_C
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:09:04
 * 
 */
public class MyFifthRunC_C {
	public static void main(String[] args) {
		try {
			MyFifthRunnableB myRunnable = new MyFifthRunnableB();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(myRunnable);
			pool.shutdown();
			System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());
			System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
