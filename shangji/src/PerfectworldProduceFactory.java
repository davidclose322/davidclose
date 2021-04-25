public class PerfectworldProduceFactory implements GProductFactory {


        @Override
        public MobaProduct produceMoba() {
            System.out.println(">>>>>>生产dota2");
            return new Dota2();
        }

        @Override
        public FpsProduct produceFps() {
            System.out.println(">>>>>>生产csgo");
            return new Csgo();

        }

}
