/**   
* @Title: MySecondRecursiveTaskD.java 
* @Package cn.songzx.forkjoin.second.task 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午9:49:32 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.task;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MySecondRecursiveTaskD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午9:49:32
 * 
 */
public class MySecondRecursiveTaskE extends RecursiveTask<Integer> {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1404833004047090926L;

	private int beginPosition;

	private int endPosition;

	/**
	 * @Date: 2017年12月5日下午9:50:14
	 * @Title: MySecondRecursiveTaskD.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param beginPosition
	 * @param endPosition
	 */
	public MySecondRecursiveTaskE(int beginPosition, int endPosition) {
		super();
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
		System.out.println("# " + (beginPosition + " " + endPosition));
	}

	/**
	 * @Date: 2017年12月5日下午9:49:33
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName() + " --------------------");
		Integer sumValue = 0;
		System.out.println("compute=" + beginPosition + " " + endPosition);
		// 核心条件，可以使用else{}for循环以数字范围的方式进行累加求和
		if ((endPosition - beginPosition) > 2) {
			System.out.println("!= 0");
			int middleNum = (endPosition + beginPosition) / 2;
			System.out.println("left 传入的值：" + (beginPosition + " " + middleNum));
			MySecondRecursiveTaskE leftTask = new MySecondRecursiveTaskE(beginPosition, middleNum);
			System.out.println("right 传入的值：" + ((middleNum + 1) + " " + endPosition));
			MySecondRecursiveTaskE rightTask = new MySecondRecursiveTaskE(middleNum + 1, endPosition);
			invokeAll(leftTask, rightTask);
			Integer leftValue = leftTask.join();
			Integer rightValue = rightTask.join();
			return leftValue + rightValue;
		} else {
			int count = 0;
			for (int i = beginPosition; i <= endPosition; i++) {
				count = count + i;
			}
			return count;
		}
	}

}
