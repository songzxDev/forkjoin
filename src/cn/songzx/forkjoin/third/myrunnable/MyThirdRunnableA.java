/**   
* @Title: MyThirdRunnableA.java 
* @Package cn.songzx.forkjoin.third.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午10:20:39 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.myrunnable;

import cn.songzx.forkjoin.third.entity.MyThirdUserinfoA;

/**
 * @ClassName: MyThirdRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午10:20:39
 * 
 */
public class MyThirdRunnableA implements Runnable {
	private MyThirdUserinfoA userinfo;

	/**
	 * @Date: 2017年12月7日下午10:21:07
	 * @Title: MyThirdRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param userinfo
	 */
	public MyThirdRunnableA(MyThirdUserinfoA userinfo) {
		super();
		this.userinfo = userinfo;
	}

	/**
	 * @Date: 2017年12月7日下午10:20:39
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			userinfo.setUsername("设置的值！");
			System.out.println("已经设置完结！");
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
