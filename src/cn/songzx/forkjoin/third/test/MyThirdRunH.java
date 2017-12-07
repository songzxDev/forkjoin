/**   
* @Title: MyThirdRunH.java 
* @Package cn.songzx.forkjoin.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:32:39 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import cn.songzx.forkjoin.third.mycallable.MyThirdCallableB;

/**
 * @ClassName: MyThirdRunH
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:32:39
 * 
 */
public class MyThirdRunH {
	public static void main(String[] args) {
		try {
			List<MyThirdCallableB> list = new ArrayList<MyThirdCallableB>();
			list.add(new MyThirdCallableB(5000));
			list.add(new MyThirdCallableB(4000));
			list.add(new MyThirdCallableB(3000));
			list.add(new MyThirdCallableB(2000));
			list.add(new MyThirdCallableB(1000));

			ForkJoinPool pool = new ForkJoinPool();
			List<Future<String>> listFuture = pool.invokeAll(list);// invokeAll(..)具有阻塞特性
			for (int i = 0; i < listFuture.size(); i++) {
				System.out.println(listFuture.get(i).get() + " nowTime：" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
