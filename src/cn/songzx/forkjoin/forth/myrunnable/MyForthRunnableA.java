/**   
* @Title: MyForthRunnableA.java 
* @Package cn.songzx.forkjoin.forth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午7:39:37 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.myrunnable;

/**
 * @ClassName: MyForthRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午7:39:37
 * 
 */
public class MyForthRunnableA implements Runnable {

	/**
	 * @Date: 2017年12月12日下午7:39:37
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
			Thread.sleep(4000L);
			System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
