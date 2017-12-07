/**   
* @Title: MyThirdRunB.java 
* @Package cn.songzx.forkjoin.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午9:47:55 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.test;

import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName: MyThirdRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午9:47:55
 * 
 */
public class MyThirdRunB {
	public static void main(String[] args) {
		try {
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(new Runnable() {
				public void run() {
					System.out.println("ThreadName=" + Thread.currentThread().getName());
				}
			});
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
