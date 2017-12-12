/**   
* @Title: MyFifithRunC_A.java 
* @Package cn.songzx.forkjoin.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午9:00:34 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import cn.songzx.forkjoin.fifth.myrunnable.MyFifthRunnableA;

/**
 * @ClassName: MyFifithRunC_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:00:34
 * 
 */
public class MyFifthRunC_A {
	public static void main(String[] args) {
		try {
			MyFifthRunnableA myRunnable = new MyFifthRunnableA();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(myRunnable);
			System.out.println("Main Begin！" + System.currentTimeMillis());
			// 此实验说明awaitTermination(..)方法具有阻塞特性
			System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
			System.out.println("Main End！      " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
