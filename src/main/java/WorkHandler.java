import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mangguo on 2016/4/18.
 */
public class WorkHandler implements InvocationHandler {

    private Object goWork;
    public WorkHandler(Object realGoWork){
        this.goWork = realGoWork;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("check in ............");
        method.invoke(goWork,args);
        System.out.println("check out ................");
        return null;
    }
}
