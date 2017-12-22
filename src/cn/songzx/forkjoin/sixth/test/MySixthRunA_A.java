/**   
* @Title: MySixthRunA_A.java 
* @Package cn.songzx.forkjoin.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午8:33:47 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.sixth.mytask.MySixthRecursiveTaskA;

/**
 * @ClassName: MySixthRunA_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午8:33:47
 * 
 */
public class MySixthRunA_A {
	public static void main(String[] args) {
		MySixthRecursiveTaskA taskA = new MySixthRecursiveTaskA();
		MySixthRecursiveTaskA taskB = new MySixthRecursiveTaskA();
		MySixthRecursiveTaskA taskC = new MySixthRecursiveTaskA();
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(taskA);
		pool.submit(taskB);
		pool.submit(taskC);
		System.out.println("并行数getParallelism()=" + pool.getParallelism() + " 线程池大小getPoolSize()=" + pool.getPoolSize());
		pool.shutdown();
		do {

		} while (!pool.isTerminated());
		System.out.println("Main End！");
	}

}
