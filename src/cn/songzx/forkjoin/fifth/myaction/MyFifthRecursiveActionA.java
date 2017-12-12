/**   
* @Title: MyFifthRecursiveActionA.java 
* @Package cn.songzx.forkjoin.fifth.myaction 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午9:18:00 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.myaction;

import java.util.concurrent.RecursiveAction;

/**
 * @ClassName: MyFifthRecursiveActionA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:18:00
 * 
 */
public class MyFifthRecursiveActionA extends RecursiveAction {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -571706384185184603L;

	/**
	 * @Date: 2017年12月12日下午9:18:00
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		System.out.println("ThreadName=" + Thread.currentThread().getName());
	}

}
