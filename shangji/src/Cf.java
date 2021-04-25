public class Cf implements FpsProduct {
    @Override
    public void start() {
        System.out.println("开启腾讯cf");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭腾讯cf");
    }

    @Override
    public void report() {
        System.out.println("举报腾讯cf彩笔");
    }
}
