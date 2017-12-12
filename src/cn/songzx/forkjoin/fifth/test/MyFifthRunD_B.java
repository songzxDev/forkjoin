/**   
* @Title: MyFifthRunD_A.java 
* @Package cn.songzx.forkjoin.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午9:20:29 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.fifth.mytask.MyFifthRecursiveTaskA;

/**
 * @ClassName: MyFifthRunD_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:20:29
 * 
 */
public class MyFifthRunD_B {
	public static void main(String[] args) {
		MyFifthRecursiveTaskA action = new MyFifthRecursiveTaskA();
		ForkJoinPool pool = new ForkJoinPool();
		/*
		 * execute(task)、submit(task)、invoke(task)都可以在异步队列中执行任务，需要注意的是
		 * ，方法invoke(task)是阻塞的，而它们在使用上的区别其实很简单，execute(task)值执行任务，
		 * 没有返回值，而submit(task)方法有返回值，返回值类型是ForkJoinTask，想取得返回值，需要使用
		 * ForkJoinTask对象的get()方法，而invoke(task)和submit(task)方法一样都均有返回值的功能，
		 * 区别就是invoke(task)方法直接将返回值进行返回，而不是通过ForkJoinTask对象的get()方法。
		 */
		System.out.println(pool.invoke(action));
	}
}
