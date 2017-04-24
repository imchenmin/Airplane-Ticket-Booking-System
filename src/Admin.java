/**
 * 这是一份结构文本。
 * 缺点：未应用访问修饰符。只用了public。可能造成访问的问题。
 * @author zbcmb	作者名可以更改。
 *
 */
public class Admin {
	//定义属性
	String UserName;
	String passWord;
	//初始化构造方法。
	public Admin(){
		//admin 对象被创建出来时要做什么？
	}
	//方法
	public static void creatFlight(String FID/*输入关于航班的所有属性*/){
		Flight nflight =new Flight();//是否有必要加一个全局计数器，定义新对象？不然Flight 对象没有唯一识别码。
		nflight.FlightID=FID;
		//nflight.startTime=...
	}
	//接着把其他方法输入。
}
