/**   
* @Title: MySecondRecursiveTaskA.java 
* @Package cn.songzx.forkjoin.second.task 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月5日 下午9:12:10 
* @version V1.0   
*/
package cn.songzx.forkjoin.second.task;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MySecondRecursiveTaskA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月5日 下午9:12:10
 * 
 */
public class MySecondRecursiveTaskA extends RecursiveTask<Integer> {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 4766602997837952698L;

	/**
	 * @Date: 2017年12月5日下午9:12:10
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected Integer compute() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin A " + System.currentTimeMillis());
			Thread.sleep(3000L);
			System.out.println(Thread.currentThread().getName() + "   end A " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 100;
	}

}
