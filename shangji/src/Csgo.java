public class Csgo implements FpsProduct {
    @Override
    public void start() {
        System.out.println("开启完美csgo");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭完美csgo");
    }

    @Override
    public void report() {
        System.out.println("举报完美csgo彩笔");
    }
}
