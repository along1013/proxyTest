import java.lang.reflect.Proxy;

/**
 * Created by mangguo on 2016/4/18.
 */
public class ProxyClient {
    public static void main(String[] args) {
        GoWork work = new GoWorkImpl();
        GoWork workProxy = (GoWork) Proxy.newProxyInstance(GoWorkImpl.class.getClassLoader(),GoWorkImpl.class.getInterfaces(),new WorkHandler(work));
        workProxy.goWork();
    }
}
