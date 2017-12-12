/**   
* @Title: MyForthRunA_A.java 
* @Package cn.songzx.forkjoin.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月12日 下午7:41:36 
* @version V1.0   
*/
package cn.songzx.forkjoin.forth.test;

import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName: MyForthRunA_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月12日 下午7:41:36
 * 
 */
public class MyForthRunA_A {

	/**
	 * @Date: 2017年12月12日下午7:41:36
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("Main End！");// 程序打印出目标后，进程立即销毁
	}

}
