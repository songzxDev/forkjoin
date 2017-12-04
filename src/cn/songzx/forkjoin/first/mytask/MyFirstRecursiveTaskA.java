/**   
* @Title: MyFirstRecursiveTask.java 
* @Package cn.songzx.forkjoin.first.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月4日 下午9:45:11 
* @version V1.0   
*/
package cn.songzx.forkjoin.first.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MyFirstRecursiveTask
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月4日 下午9:45:11
 * 
 */
public class MyFirstRecursiveTaskA extends RecursiveTask<Integer> {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -6464727123722462776L;

	/**
	 * @Date: 2017年12月4日下午9:45:11
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected Integer compute() {
		System.out.println("compute time=" + System.currentTimeMillis());
		return 100;
	}

}
