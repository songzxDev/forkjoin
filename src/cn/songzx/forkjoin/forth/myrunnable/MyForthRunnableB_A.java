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
public class MyForthRunnableB_A implements Runnable {

	/**
	 * @Date: 2017年12月12日下午8:02:11
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newStr = new String();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();

				if (Thread.currentThread().isInterrupted() == true) {
					System.out.println("任务没有完成，就中断了！");
					throw new InterruptedException();
				}
			}
			System.out.println("任务成功完成！");
		} catch (InterruptedException e) {
			System.out.println("进入 catch 中断了任务！");
			e.printStackTrace();
		}
	}

}
