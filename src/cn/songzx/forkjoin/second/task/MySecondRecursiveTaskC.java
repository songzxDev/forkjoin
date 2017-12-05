/**   
* @Title: MySecondRecursiveTaskC.java 
* @Package cn.songzx.forkjoin.second.task 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午9:25:38 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.task;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MySecondRecursiveTaskC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午9:25:38
 * 
 */
public class MySecondRecursiveTaskC extends RecursiveTask<String> {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -902423518993959016L;

	private int beginValue;
	private int endValue;

	/**
	 * @Date: 2017年12月5日下午9:26:55
	 * @Title: MySecondRecursiveTaskC.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param beginValue
	 * @param endValue
	 */
	public MySecondRecursiveTaskC(int beginValue, int endValue) {
		super();
		this.beginValue = beginValue;
		this.endValue = endValue;
	}

	/**
	 * @Date: 2017年12月5日下午9:25:38
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected String compute() {
		// 本示例完全可以比喻成蜂王命令小蜜蜂去采蜜
		System.out.println(Thread.currentThread().getName() + " ---------------");
		if (endValue - beginValue > 2) {
			int middleValue = (endValue + beginValue) / 2;
			MySecondRecursiveTaskC leftTask = new MySecondRecursiveTaskC(beginValue, middleValue);
			MySecondRecursiveTaskC rightTask = new MySecondRecursiveTaskC(middleValue + 1, endValue);
			invokeAll(leftTask, rightTask);
			// 将每个小蜜蜂采的蜜进行汇总
			return leftTask.join() + rightTask.join();
		} else {
			String returnString = "";
			for (int i = beginValue; i <= endValue; i++) {
				returnString = returnString + (i);
			}
			System.out.println("else返回：" + returnString + "     " + beginValue + "  " + endValue);
			// 取得每个小蜜蜂采的蜜
			return returnString;
		}
	}

}
