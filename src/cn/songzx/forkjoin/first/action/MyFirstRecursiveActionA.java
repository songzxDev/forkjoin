/**   
* @Title: MyFirstRecursiveAction.java 
* @Package cn.songzx.forkjoin.first.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月4日 下午9:26:42 
* @version V1.0   
*/
package cn.songzx.forkjoin.first.action;

import java.util.concurrent.RecursiveAction;

/**
 * @ClassName: MyFirstRecursiveAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月4日 下午9:26:42
 * 
 */
public class MyFirstRecursiveActionA extends RecursiveAction {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -395324149832814160L;

	/**
	 * @Date: 2017年12月4日下午9:26:43
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	protected void compute() {
		System.out.println("compute run！");
	}

}
