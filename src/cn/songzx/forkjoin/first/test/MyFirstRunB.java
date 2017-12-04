/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.forkjoin.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月4日 下午9:27:50 
* @version V1.0   
*/
package cn.songzx.forkjoin.first.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.first.action.MyFirstRecursiveActionB;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月4日 下午9:27:50
 * 
 */
public class MyFirstRunB {

	/**
	 * @Date: 2017年12月4日下午9:27:50
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(new MyFirstRecursiveActionB(1, 10));
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
