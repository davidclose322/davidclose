public class TencentProductFactory implements GProductFactory {

        @Override
        public MobaProduct produceMoba() {
            System.out.println(">>>>>>生产英雄联盟");
            return new Lol();
        }

        @Override
        public FpsProduct produceFps() {
            System.out.println(">>>>>>生产穿越火线");
            return new Cf();

    }
}
