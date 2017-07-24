package wuxian.me.doubanspider;

import wuxian.me.doubanspider.biz.group.GroupListSpider;
import wuxian.me.doubanspider.util.Helper;
import wuxian.me.spidercommon.log.LogManager;
import wuxian.me.spidersdk.JobManagerConfig;
import wuxian.me.spidersdk.manager.JobManagerFactory;

/**
 * Created by wuxian on 12/7/2017.
 */
public class Main {

    public static void main(String[] args) {
        LogManager.info("start Jobmanager");
        JobManagerConfig.init();
        JobManagerFactory.getJobManager().start();  //Must be called before any biz!!

        try {
            Thread.sleep(1000);  //现在有个bug 若SpiderSdk没有start完成 putJob会失败... 后面需要Fixme:
        } catch (InterruptedException e) {
            ;
        }

        Helper.dispatchSpider(new GroupListSpider(145219L, 1));
    }
}