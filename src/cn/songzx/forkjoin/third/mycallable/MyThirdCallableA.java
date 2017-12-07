/**   
* @Title: MyThirdCallableA.java 
* @Package cn.songzx.forkjoin.third.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:12:00 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.mycallable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyThirdCallableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:12:00
 * 
 */
public class MyThirdCallableA implements Callable<String> {

	/**
	 * @Date: 2017年12月7日下午10:12:00
	 * @Title: call
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws Exception
	 * @return 返回值类型
	 */
	@Override
	public String call() throws Exception {
		Thread.sleep(3000L);
		return "我是返回值callableVersion";
	}

}
