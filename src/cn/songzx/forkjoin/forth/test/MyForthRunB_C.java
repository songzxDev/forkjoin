/**   
* @Title: MyForthRunB_C.java 
* @Package cn.songzx.forkjoin.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午8:11:30 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.forth.myrunnable.MyForthRunnableB_B;

/**
 * @ClassName: MyForthRunB_C
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午8:11:30
 * 
 */
public class MyForthRunB_C {
	public static void main(String[] args) {
		try {
			MyForthRunnableB_B myRunnable = new MyForthRunnableB_B();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(myRunnable);
			Thread.sleep(1000L);
			pool.shutdownNow();
			System.out.println("Main End！");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
