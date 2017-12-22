/**   
* @Title: MySixthRecursiveTaskD.java 
* @Package cn.songzx.forkjoin.sixth.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午9:57:31 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MySixthRecursiveTaskD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午9:57:31
 * 
 */
public class MySixthRecursiveTaskD extends RecursiveTask<Integer> {

	/**
	 * @Date: 2017年12月22日下午9:57:31
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected Integer compute() {
		try {
			Thread.sleep(1000L);
			Integer.parseInt("a");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 100;
	}

}
