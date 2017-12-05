/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.forkjoin.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午9:15:21 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import cn.songzx.forkjoin.second.task.MySecondRecursiveTaskA;
import cn.songzx.forkjoin.second.task.MySecondRecursiveTaskB;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午9:15:21
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017年12月5日下午9:15:21
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			// 每个任务成功返回值为100，并且任务之间的方式是异步的，但join()方法却是同步的
			ForkJoinPool pool = new ForkJoinPool();
			ForkJoinTask<Integer> runTaskA = pool.submit(new MySecondRecursiveTaskA());
			ForkJoinTask<Integer> runTaskB = pool.submit(new MySecondRecursiveTaskB());
			System.out.println(" 准备打印：" + System.currentTimeMillis());
			System.out.println(runTaskA.join() + " A：" + System.currentTimeMillis());
			System.out.println(runTaskB.join() + " B：" + System.currentTimeMillis());
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
