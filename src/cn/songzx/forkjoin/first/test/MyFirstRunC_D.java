/**   
* @Title: MyFirstRunC_C.java 
* @Package cn.songzx.forkjoin.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月4日 下午9:55:11 
* @version V1.0   
*/
package cn.songzx.forkjoin.first.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import cn.songzx.forkjoin.first.mytask.MyFirstRecursiveTaskB;

/**
 * @ClassName: MyFirstRunC_C
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月4日 下午9:55:11
 * 
 */
public class MyFirstRunC_D {
	public static void main(String[] args) {
		MyFirstRecursiveTaskB taskB = new MyFirstRecursiveTaskB();
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<Integer> taskC = pool.submit(taskB);
		// 方法join()遇到异常直接抛出
		System.out.println(taskC.join());
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String newString = new String();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println("Main End！");
	}
}
