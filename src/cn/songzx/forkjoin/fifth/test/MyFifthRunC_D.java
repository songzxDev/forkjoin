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

import cn.songzx.forkjoin.fifth.myrunnable.MyFifthRunnableA;

/**
 * @ClassName: MyFifthRunC_C
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:09:04
 * 
 */
public class MyFifthRunC_D {
	public static void main(String[] args) {
		try {
			MyFifthRunnableA myRunnable = new MyFifthRunnableA();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(myRunnable);
			pool.shutdown();
			System.out.println(System.currentTimeMillis());
			System.out.println(pool.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS) + " " + System.currentTimeMillis() + " 全部任务执行完毕！");
			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
