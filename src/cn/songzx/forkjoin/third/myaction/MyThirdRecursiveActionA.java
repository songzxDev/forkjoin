/**   
* @Title: MyThirdRecursiveActionA.java 
* @Package cn.songzx.forkjoin.third.myaction 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午9:43:14 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.myaction;

import java.util.concurrent.RecursiveAction;

/**
 * @ClassName: MyThirdRecursiveActionA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午9:43:14
 * 
 */
public class MyThirdRecursiveActionA extends RecursiveAction {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 2595379685000375370L;

	/**
	 * @Date: 2017年12月7日下午9:43:14
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	protected void compute() {
		System.out.println("ThreadName=" + Thread.currentThread().getName());
	}

}
