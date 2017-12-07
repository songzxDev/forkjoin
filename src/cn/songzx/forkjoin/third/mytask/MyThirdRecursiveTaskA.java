/**   
* @Title: MyThirdRecursiveTaskA.java 
* @Package cn.songzx.forkjoin.third.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月7日 下午9:56:54 
* @version V1.0   
*/
package cn.songzx.forkjoin.third.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName: MyThirdRecursiveTaskA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月7日 下午9:56:54
 * 
 */
public class MyThirdRecursiveTaskA extends RecursiveTask<String> {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 522699577074001253L;

	/**
	 * @Date: 2017年12月7日下午9:56:54
	 * @Title: compute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return 返回值类型
	 */
	@Override
	protected String compute() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "我是返回值！";
	}

}
