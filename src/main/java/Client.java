/**
 * Created by mangguo on 2016/4/18.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        GoWork work = new GoWorkImpl();
        work.goWork();
    }
}
