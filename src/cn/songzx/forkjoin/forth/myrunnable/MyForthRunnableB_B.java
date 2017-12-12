/**   
* @Title: MyForthRunnableB.java 
* @Package cn.songzx.forkjoin.forth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午8:02:11 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.myrunnable;

/**
 * @ClassName: MyForthRunnableB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午8:02:11
 * 
 */
public class MyForthRunnableB_B implements Runnable {

	/**
	 * @Date: 2017年12月12日下午8:02:11
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
			String newStr = new String();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println("任务成功完成！");
	}

}
