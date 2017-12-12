/**   
* @Title: MyForthRunA_C.java 
* @Package cn.songzx.forkjoin.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午7:49:08 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.forth.myrunnable.MyForthRunnableA;

/**
 * @ClassName: MyForthRunA_C
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午7:49:08
 * 
 */
public class MyForthRunA_D {
	public static void main(String[] args) {
		try {
			MyForthRunnableA myRunnable = new MyForthRunnableA();
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(myRunnable);
			Thread.sleep(1000L);
			pool.shutdown();
			// ForkJoinPool对像调用shutdown()方法后再执行任务时出现异常，进程销毁正在运行的线程任务也被销毁
			// 为防止在关闭pool后再执行任务，需要添加判断逻辑来解决进程意外销毁的问题
			if (pool.isShutdown() == false) {// shutdown()方法不具备中断效果
				pool.submit(myRunnable);
			}

			System.out.println("Main End！");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
