/**   
* @Title: MyThirdRunE.java 
* @Package cn.songzx.forkjoin.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:08:23 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @ClassName: MyThirdRunE
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:08:23
 * 
 */
public class MyThirdRunE {
	public static void main(String[] args) {
		try {
			ForkJoinPool pool = new ForkJoinPool();
			System.out.println("begin " + System.currentTimeMillis());
			ForkJoinTask task = pool.submit(new Runnable() {
				public void run() {
					try {
						Thread.sleep(5000L);
						System.out.println("ThreadName=" + Thread.currentThread().getName());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			System.out.println(task.get());
			System.out.println("  end " + System.currentTimeMillis());
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
