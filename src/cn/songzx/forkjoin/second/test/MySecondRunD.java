/**   
* @Title: MySecondRunD.java 
* @Package cn.songzx.forkjoin.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午10:10:42 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.second.task.MySecondRecursiveTaskE;

/**
 * @ClassName: MySecondRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午10:10:42
 * 
 */
public class MySecondRunD {

	/**
	 * @Date: 2017年12月5日下午10:10:42
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MySecondRecursiveTaskE task = new MySecondRecursiveTaskE(1, 10);
			ForkJoinPool pool = new ForkJoinPool();
			System.out.println("结果值为：" + pool.submit(task).get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
