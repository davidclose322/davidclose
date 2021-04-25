public class Dota2 implements MobaProduct {
    @Override
    public void start() {
        System.out.println("开启完美dota2");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭完美dota2");
    }

    @Override
    public void report() {
        System.out.println("举报完美dota2彩笔");
    }
}
