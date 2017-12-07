/**   
* @Title: MyThirdRunG_A.java 
* @Package cn.songzx.forkjoin.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:22:32 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.test;

import java.util.concurrent.ForkJoinPool;

import cn.songzx.forkjoin.third.entity.MyThirdUserinfoA;
import cn.songzx.forkjoin.third.myrunnable.MyThirdRunnableA;

/**
 * @ClassName: MyThirdRunG_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:22:32
 * 
 */
public class MyThirdRunG_A {
	public static void main(String[] args) {
		try {
			MyThirdUserinfoA userinfo = new MyThirdUserinfoA();
			MyThirdRunnableA runnable = new MyThirdRunnableA(userinfo);
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(runnable, userinfo);
			System.out.println("userinfo username=" + userinfo.getUsername());// 取不到值
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
