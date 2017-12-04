/**   
* @Title: MyFirstRunC.java 
* @Package cn.songzx.forkjoin.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月4日 下午9:46:05 
* @version V1.0   
*/
package cn.songzx.forkjoin.first.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import cn.songzx.forkjoin.first.mytask.MyFirstRecursiveTaskA;

/**
 * @ClassName: MyFirstRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月4日 下午9:46:05
 * 
 */
public class MyFirstRunC_B {
	public static void main(String[] args) {
		try {
			MyFirstRecursiveTaskA taskA = new MyFirstRecursiveTaskA();
			System.out.println(taskA.hashCode());
			ForkJoinPool pool = new ForkJoinPool();
			ForkJoinTask<Integer> taskB = pool.submit(taskA);
			System.out.println(taskB.hashCode() + " " + taskB.join());// join()方法取得结果值
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
