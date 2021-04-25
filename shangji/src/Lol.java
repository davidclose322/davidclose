public class Lol implements MobaProduct {
    @Override
    public void start() {
        System.out.println("开启腾讯lol");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭腾讯lol");
    }

    @Override
    public void report() {
        System.out.println("举报腾讯lol彩笔");
    }
}
