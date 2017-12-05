/**   
* @Title: MySecondRunB.java 
* @Package cn.songzx.forkjoin.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午9:34:37 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import cn.songzx.forkjoin.second.task.MySecondRecursiveTaskC;

/**
 * @ClassName: MySecondRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午9:34:37
 * 
 */
public class MySecondRunB {

	/**
	 * @Date: 2017年12月5日下午9:34:37
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			ForkJoinPool pool = new ForkJoinPool();
			MySecondRecursiveTaskC task = new MySecondRecursiveTaskC(1, 20);
			ForkJoinTask<String> runTaskA = pool.submit(task);
			System.out.println(runTaskA.join());
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
