/**   
* @Title: MyThirdCallableB.java 
* @Package cn.songzx.forkjoin.third.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:30:35 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.mycallable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyThirdCallableB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:30:35
 * 
 */
public class MyThirdCallableB implements Callable<String> {
	private long sleepValue;

	/**
	 * @Date: 2017年12月7日下午10:30:59
	 * @Title: MyThirdCallableB.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param sleepValue
	 */
	public MyThirdCallableB(long sleepValue) {
		super();
		this.sleepValue = sleepValue;
	}

	/**
	 * @Date: 2017年12月7日下午10:30:35
	 * @Title: call
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws Exception
	 * @return 返回值类型
	 */
	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " sleep" + sleepValue + " nowTime：" + System.currentTimeMillis());
		Thread.sleep(sleepValue);
		return "我是返回值！";
	}

}
