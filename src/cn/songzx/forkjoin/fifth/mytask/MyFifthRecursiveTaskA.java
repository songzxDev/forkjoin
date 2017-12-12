/**   
* @Title: MyFifthRecursiveTaskA.java 
* @Package cn.songzx.forkjoin.fifth.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午9:19:26 
* @version V1.0   
*/
package cn.songzx.forkjoin.fifth.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MyFifthRecursiveTaskA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午9:19:26
 * 
 */
public class MyFifthRecursiveTaskA extends RecursiveTask<String> {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 8905959515079842872L;

	/**
	 * @Date: 2017年12月12日下午9:19:26
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected String compute() {
		// TODO Auto-generated method stub
		return "我是返回值！";
	}

}
