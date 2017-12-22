/**   
* @Title: MySixthRecursiveTaskA.java 
* @Package cn.songzx.forkjoin.sixth.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月22日 下午8:29:50 
* @version V1.0   
*/
package cn.songzx.forkjoin.sixth.mytask;

import java.util.concurrent.RecursiveAction;

/**
 * @ClassName: MySixthRecursiveTaskA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月22日 下午8:29:50
 * 
 */
public class MySixthRecursiveTaskA extends RecursiveAction {

	/**
	 * @Date: 2017年12月22日下午8:29:51
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	protected void compute() {
		try {
			System.out.println("begin=" + Thread.currentThread().getName());
			Thread.sleep(1000L);
			System.out.println("  end=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
