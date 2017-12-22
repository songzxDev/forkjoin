/**   
* @Title: MySixthRecursiveTaskB.java 
* @Package cn.songzx.forkjoin.sixth.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午9:19:32 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MySixthRecursiveTaskB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午9:19:32
 * 
 */
public class MySixthRecursiveTaskC extends RecursiveTask<Integer> {
	private int beginPosition;
	private int endPosition;

	/**
	 * @Date: 2017年12月22日下午9:20:17
	 * @Title: MySixthRecursiveTaskB.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param beginPosition
	 * @param endPosition
	 */
	public MySixthRecursiveTaskC(int beginPosition, int endPosition) {
		super();
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
	}

	/**
	 * @Date: 2017年12月22日下午9:19:32
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected Integer compute() {
		Integer sumValue = 0;
		if ((endPosition - beginPosition) > 2) {
			int middleNum = (endPosition + beginPosition) / 2;
			MySixthRecursiveTaskC leftTask = new MySixthRecursiveTaskC(beginPosition, middleNum);
			MySixthRecursiveTaskC rightTask = new MySixthRecursiveTaskC(middleNum + 1, endPosition);
			invokeAll(leftTask, rightTask);// invokeAll()以优化的方式分解及运行任务，效率得到了保障
			Integer leftValue = leftTask.join();
			Integer rightValue = rightTask.join();
			return leftValue + rightValue;
		} else {
			int count = 0;
			for (int i = beginPosition; i <= endPosition; i++) {
				count = count + 1;
			}
			return count;
		}

	}

}
