/**   
* @Title: MyForthRunB_A.java 
* @Package cn.songzx.forkjoin.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午8:06:48 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.forth.myrunnable.MyForthRunnableB_A;

/**
 * @ClassName: MyForthRunB_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午8:06:48
 * 
 */
public class MyForthRunB_A {
	public static void main(String[] args) {
		try {
			MyForthRunnableB_A myRunnable = new MyForthRunnableB_A();
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(myRunnable);
			Thread.sleep(2000L);
			pool.shutdownNow();
			System.out.println("Main End！");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
