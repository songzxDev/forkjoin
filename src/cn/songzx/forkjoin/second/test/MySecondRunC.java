/**   
* @Title: MySecondRunC.java 
* @Package cn.songzx.forkjoin.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午9:59:41 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.second.task.MySecondRecursiveTaskD;

/**
 * @ClassName: MySecondRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午9:59:41
 * 
 */
public class MySecondRunC {
	public static void main(String[] args) {
		try {
			MySecondRecursiveTaskD task = new MySecondRecursiveTaskD(1, 10);
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(task);
			System.out.println(" 结果值为：" + task.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
