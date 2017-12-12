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

import cn.songzx.forkjoin.fifth.myaction.MyFifthRecursiveActionA;

/**
 * @ClassName: MyFifthRunD_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:20:29
 * 
 */
public class MyFifthRunD_A {
	public static void main(String[] args) {
		MyFifthRecursiveActionA action = new MyFifthRecursiveActionA();
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(action);
	}
}
