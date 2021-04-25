public interface GProductFactory {

    /**
     * 生产手机
     * @return
     */
    MobaProduct produceMoba();

    /**
     * 生产路由器
     * @return
     */
    FpsProduct produceFps();

}

