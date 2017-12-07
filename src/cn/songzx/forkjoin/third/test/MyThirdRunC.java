/**   
* @Title: MyThirdRunC.java 
* @Package cn.songzx.forkjoin.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午9:58:09 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.third.mytask.MyThirdRecursiveTaskA;

/**
 * @ClassName: MyThirdRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午9:58:09
 * 
 */
public class MyThirdRunC {

	/**
	 * @Date: 2017年12月7日下午9:58:09
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyThirdRecursiveTaskA taskA = new MyThirdRecursiveTaskA();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(taskA);// execute方法无返回值，想获取返回值得通过RecursiveTask对象
			System.out.println(System.currentTimeMillis());
			System.out.println(taskA.get());
			System.out.println(System.currentTimeMillis());
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
