public class client {

    public static void main(String[] args) {
        System.out.println("===================腾讯系列产品=================");
        GProductFactory TencentProductFactory = new TencentProductFactory();
        MobaProduct Lol = TencentProductFactory.produceMoba();
        Lol.start();
        Lol.report();
        Lol.shutdown();
        FpsProduct Cf = TencentProductFactory.produceFps();
        Cf.start();
        Cf.report();
        Cf.shutdown();

        System.out.println("===================完美世界系列产品=================");
        GProductFactory PerfectworldProduceFactory = new PerfectworldProduceFactory();
        MobaProduct Dota2 = PerfectworldProduceFactory.produceMoba();
        Dota2.start();
        Dota2.report();
        Dota2.shutdown();
        FpsProduct Csgo = PerfectworldProduceFactory.produceFps();
        Csgo.start();
        Csgo.report();
        Csgo.shutdown();
    }
}
