/**   
* @Title: MyForthRunA_B.java 
* @Package cn.songzx.forkjoin.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午7:43:40 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.forth.myrunnable.MyForthRunnableA;

/**
 * @ClassName: MyForthRunA_B
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午7:43:40
 * 
 */
public class MyForthRunA_B {
	public static void main(String[] args) {
		try {
			MyForthRunnableA myRunnable = new MyForthRunnableA();
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(myRunnable);
			Thread.sleep(1000L);
			pool.shutdown();
			System.out.println("Main End！");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
