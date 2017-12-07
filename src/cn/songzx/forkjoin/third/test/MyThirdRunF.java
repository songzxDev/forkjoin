/**   
* @Title: MyThirdRunF.java 
* @Package cn.songzx.forkjoin.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:13:05 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import cn.songzx.forkjoin.third.mycallable.MyThirdCallableA;

/**
 * @ClassName: MyThirdRunF
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:13:05
 * 
 */
public class MyThirdRunF {
	public static void main(String[] args) {
		try {
			MyThirdCallableA callable = new MyThirdCallableA();
			ForkJoinPool pool = new ForkJoinPool();
			System.out.println("begin " + System.currentTimeMillis());
			ForkJoinTask<String> returnTask = pool.submit(callable);
			System.out.println(returnTask.get());
			System.out.println("  end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
