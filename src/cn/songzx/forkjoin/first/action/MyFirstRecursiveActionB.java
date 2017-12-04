/**   
* @Title: MyFirstRecursiveActionB.java 
* @Package cn.songzx.forkjoin.first.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月4日 下午9:31:23 
* @version V1.0   
*/
package cn.songzx.forkjoin.first.action;

import java.util.concurrent.RecursiveAction;

/**
 * @ClassName: MyFirstRecursiveActionB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月4日 下午9:31:23
 * 
 */
public class MyFirstRecursiveActionB extends RecursiveAction {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 8660648461672931318L;

	private int beginValue;
	private int endValue;

	/**
	 * @Date: 2017年12月4日下午9:31:59
	 * @Title: MyFirstRecursiveActionB.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param beginValue
	 * @param endValue
	 */
	public MyFirstRecursiveActionB(int beginValue, int endValue) {
		super();
		this.beginValue = beginValue;
		this.endValue = endValue;
	}

	/**
	 * @Date: 2017年12月4日下午9:31:23
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	protected void compute() {
		System.out.println(Thread.currentThread().getName() + " -------------------");
		if (endValue - beginValue > 2) {
			int middleNum = (beginValue + endValue) / 2;
			MyFirstRecursiveActionB leftAction = new MyFirstRecursiveActionB(beginValue, middleNum);
			MyFirstRecursiveActionB rightAction = new MyFirstRecursiveActionB(middleNum + 1, endValue);
			invokeAll(leftAction, rightAction);
		} else {
			System.out.println("打印组合为：" + beginValue + "-" + endValue);
		}
	}

}
