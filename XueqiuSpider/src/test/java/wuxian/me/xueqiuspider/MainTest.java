package wuxian.me.xueqiuspider;

import org.junit.Test;
import wuxian.me.spidercommon.log.LogManager;
import wuxian.me.spidermaster.framework.common.GsonProvider;
import wuxian.me.xueqiuspider.biz.today.TodayTopSpider;
import wuxian.me.xueqiuspider.biz.today.model.TodayResponse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Created by wuxian on 24/7/2017.
 */
public class MainTest {

    @Test
    public void testRemove() {
        String s = "\"{\\\"id\\\":89329867,\\\"title\\\":";

        s = "{\"next_max_id\":20192654,\"list\":[{\"id\":20192658,\"category\":0,\"data\":\"{\"id\":89342472,\"title\":\"股友：股灾两周年记——谨以此文献给我的苦难深重的股友们！\",\"description\":\"股灾过去两年了，一直想写一篇自己在股灾中倍受煎熬的文字，来记录这段终生难忘的经历。但是一直不愿意再去揭开这段痛苦煎熬的回忆，然而这段历程我始终会留下些痕迹的。最近恰逢创业板再次面临危机，勾起了我往日的忧愁，于是提笔写下下面的回忆。并谨以此奉献给我股灾中历经磨难的股票朋友。@今...\",\"target\":\"/1884580167/89342472\",\"user\":{\"id\":1884580167,\"profile\":\"/jiaQQ3073350371\",\"description\":\"薇❤公众号：主力追踪 QQ：3073350371  不定期分享牛股\",\"screen_name\":\"绝对值6\",\"profile_image_url\":\"community/20176/1499667561304-1499667561436.jpg,community/20176/1499667561304-1499667561436.jpg!180x180.png,community/20176/1499667561304-1499667561436.jpg!50x50.png,community/20176/1499667561304-1499667561436.jpg!30x30.png\",\"photo_domain\":\"http://xavatar.imedao.com/\"},\"promotion\":false,\"answers\":null,\"tag\":null,\"score\":null,\"reply_count\":0,\"retweet_count\":0,\"topic_title\":\"股友：股灾两周年记——谨以此文献给我的苦难深重的股友们！\",\"topic_desc\":\" 股灾过去两年了，一直想写一篇自己在股灾中倍受煎熬的文字...\",\"topic_symbol\":null,\"topic_pic\":null,\"topic_pic_hd\":null,\"pic_type\":0,\"first_pic\":\"http://xqimg.imedao.com/15d7501f36f39e3fcf74a539.jpg!186x186.jpg\",\"pic_size\":{\"width\":2,\"height\":1,\"qrcode\":false},\"pic\":\"http://xqimg.imedao.com/15d7501f36f39e3fcf74a539.jpg!345x210.webp\",\"view_count\":497,\"created_at\":1500906745000,\"link_stock_desc\":null,\"link_stock_symbol\":null,\"strategy_id\":0,\"feedback\":null}\",\"column\":\"沪深\"},{\"id\":20192657,\"category\":0,\"data\":\"{\"id\":89342260,\"title\":\"乐活e生，保障你的前半生\",\"description\":\"前篇文章介绍了百年人寿康惠保重疾险，各方面来说都挺不错，它是一款长期重疾险，今天介绍一款1年期重疾险，满足你各方面需求。 就是这款：众安乐活e生重疾险。 众安保险1年期重疾险我在前面也介绍过一款，是这款：众安守护e生。 01 乐活e生跟守护e生有什么区别呢？下面比较来看。 乐活e生有特定...\",\"target\":\"/3578456234/89342260\",\"user\":{\"id\":3578456234,\"profile\":\"/junbaou\",\"description\":\"关注Jun保屋，教你买保险！\\\\n微信公众号：junbaou\",\"screen_name\":\"Jun保屋\",\"profile_image_url\":\"community/20174/1496052712452-1496052721164.jpg,community/20174/1496052712452-1496052721164.jpg!180x180.png,community/20174/1496052712452-1496052721164.jpg!50x50.png,community/20174/1496052712452-1496052721164.jpg!30x30.png\",\"photo_domain\":\"http://xavatar.imedao.com/\"},\"promotion\":false,\"answers\":null,\"tag\":null,\"score\":null,\"reply_count\":0,\"retweet_count\":0,\"topic_title\":\"乐活e生，保障你的前半生\",\"topic_desc\":\" 前篇文章介绍了百年人寿康惠保重疾险，各方面来说都挺不错...\",\"topic_symbol\":null,\"topic_pic\":null,\"topic_pic_hd\":null,\"pic_type\":0,\"first_pic\":\"http://xqimg.imedao.com/15d74fcd4d13633fe80ac974.jpg!186x186.jpg\",\"pic_size\":{\"width\":2,\"height\":1,\"qrcode\":false},\"pic\":\"http://xqimg.imedao.com/15d74fcd4d13633fe80ac974.jpg!345x210.webp,http://xqimg.imedao.com/15d74fcd39637f3fe70b2c4d.jpg!345x210.webp,http://xqimg.imedao.com/15d74fcd3ca3623fe5919254.jpg!345x210.webp\",\"view_count\":2,\"created_at\":1500906479000,\"link_stock_desc\":null,\"link_stock_symbol\":null,\"strategy_id\":0,\"feedback\":null}\",\"column\":\"保险\"},{\"id\":20192656,\"category\":0,\"data\":\"{\"id\":89341385,\"title\":\"2017年7月24日A股主要指数指数估值表\",\"description\":\"为了方便更多投资者了解每日指数估值变化，而苦于很多投资者自己没有计算工具和专业的信息数据库，老罗计划每天从万得（万得是国内专业机构实用最多的数据库软件）给大家整理数据，希望对大家投资有帮助。 2017年7月24日A股主要指数指数估值表 注：数据来源于Wind资讯，PE所处分位数为当前最新PE...\",\"target\":\"/1738642461/89341385\",\"user\":{\"id\":1738642461,\"profile\":\"/1738642461\",\"description\":\"老罗，专注指数基金投资和量化投资,公众号：index_fund\",\"screen_name\":\"老罗话指数投资\",\"profile_image_url\":\"community/20151/1425139130170.jpg,community/20151/1425139130170.jpg!180x180.png,community/20151/1425139130170.jpg!50x50.png,community/20151/1425139130170.jpg!30x30.png\",\"photo_domain\":\"http://xavatar.imedao.com/\"},\"promotion\":false,\"answers\":null,\"tag\":null,\"score\":null,\"reply_count\":1,\"retweet_count\":1,\"topic_title\":\"2017年7月24日A股主要指数指数估值表\",\"topic_desc\":\" 为了方便更多投资者了解每日指数估值变化，而苦于很多投资...\",\"topic_symbol\":null,\"topic_pic\":null,\"topic_pic_hd\":null,\"pic_type\":0,\"first_pic\":\"http://xqimg.imedao.com/15d74ef038f3343fec406898.jpg!186x186.jpg\",\"pic_size\":{\"width\":2,\"height\":1,\"qrcode\":false},\"pic\":\"http://xqimg.imedao.com/15d74ef038f3343fec406898.jpg!345x210.webp,http://xqimg.imedao.com/15d74ef03403333fb6e0d1b8.jpg!345x210.webp\",\"view_count\":1617,\"created_at\":1500905418000,\"link_stock_desc\":null,\"link_stock_symbol\":null,\"strategy_id\":0,\"feedback\":null}\",\"column\":\"沪深\"},{\"id\":20192655,\"category\":0,\"data\":\"{\"id\":89341142,\"title\":\"513起并购重组实证：协议收购对业绩有提振 高溢价引致重组失败\",\"description\":\"更多资讯，请关注证券时报网（ID：wwwstcncom）微信，或下载证券时报APP 作者：匡继雄 并购重组是资本市场永恒不变的主题，在牛市中尤为火爆。据统计，2015年牛市中A股上市公司完成的并购规模达到历史峰值（按首次披露日进行统计），约1.11万亿元，比2014年增长95.04%。<a href=\\\\\\\"http://xueqiu.com/n/今日话题\\\\\\\" target=\\\\\\\"_blank\\\\\\\">@今日话题</a> 部分上市公司因...\",\"target\":\"/5599676754/89341142\",\"user\":{\"id\":5599676754,\"profile\":\"/5599676754\",\"description\":\"\",\"screen_name\":\"证券时报网\",\"profile_image_url\":\"community/20134/1368090078980.png,community/20134/1368090078980.png!180x180.png,community/20134/1368090078980.png!50x50.png,community/20134/1368090078980.png!30x30.png\",\"photo_domain\":\"http://xavatar.imedao.com/\"},\"promotion\":false,\"answers\":null,\"tag\":null,\"score\":null,\"reply_count\":0,\"retweet_count\":1,\"topic_title\":\"513起并购重组实证：协议收购对业绩有提振 高溢价引致重组失败\",\"topic_desc\":\" 更多资讯，请关注证券时报网（ID：wwwstcncom）微信，或下...\",\"topic_symbol\":null,\"topic_pic\":null,\"topic_pic_hd\":null,\"pic_type\":0,\"first_pic\":\"http://xqimg.imedao.com/15d74eb06ac3163fbd34a3ae.png!186x186.jpg\",\"pic_size\":{\"width\":2,\"height\":1,\"qrcode\":false},\"pic\":\"http://xqimg.imedao.com/15d74eb06ac3163fbd34a3ae.png!345x210.webp,http://xqimg.imedao.com/15d74eb06e23173fe4fd3ea4.png!345x210.webp,http://xqimg.imedao.com/15d74eb07343173fe8c87420.png!345x210.webp,http://xqimg.imedao.com/15d74eb06d73163fd7b15e9a.png!345x210.webp,http://xqimg.imedao.com/15d74eb06ef3183fe471e7a1.png!345x210.webp,http://xqimg.imedao.com/15d74eb076d3193fe25a5973.png!345x210.webp,http://xqimg.imedao.com/15d74eb07e23183fe2db626f.png!345x210.webp,http://xqimg.imedao.com/15d74eb081f3193fbe34d0c5.png!345x210.webp,http://xqimg.imedao.com/15d74eb088131b3fede63239.png!345x210.webp,http://xqimg.imedao.com/15d74eb086b31a3fda1216cf.png!345x210.webp\",\"view_count\":1274,\"created_at\":1500905153000,\"link_stock_desc\":null,\"link_stock_symbol\":null,\"strategy_id\":0,\"feedback\":null}\",\"column\":\"沪深\"},{\"id\":20192654,\"category\":0,\"data\":\"{\"id\":89340925,\"title\":\"人工智能市场规模超万亿元 17家A股制造业公司正在布局\",\"description\":\"更多资讯，请关注证券时报网（ID：wwwstcncom）微信，或下载证券时报APP 作者：孙树冠 7月20日国务院印发《新一代人工智能发展规划》，高达万亿元的市场规模激活了A股相关题材股。<a href=\\\\\\\"http://xueqiu.com/n/今日话题\\\\\\\" target=\\\\\\\"_blank\\\\\\\">@今日话题</a> Wind统计数据显示，从3月11日科技部长万钢表示人工智能规划将出炉，到7月19日人工智能规划正式发布前夕，...\",\"target\":\"/5599676754/89340925\",\"user\":{\"id\":5599676754,\"profile\":\"/5599676754\",\"description\":\"\",\"screen_name\":\"证券时报网\",\"profile_image_url\":\"community/20134/1368090078980.png,community/20134/1368090078980.png!180x180.png,community/20134/1368090078980.png!50x50.png,community/20134/1368090078980.png!30x30.png\",\"photo_domain\":\"http://xavatar.imedao.com/\"},\"promotion\":false,\"answers\":null,\"tag\":null,\"score\":null,\"reply_count\":2,\"retweet_count\":1,\"topic_title\":\"人工智能市场规模超万亿元 17家A股制造业公司正在布局\",\"topic_desc\":\" 更多资讯，请关注证券时报网（ID：wwwstcncom）微信，或下...\",\"topic_symbol\":null,\"topic_pic\":null,\"topic_pic_hd\":null,\"pic_type\":0,\"first_pic\":\"http://xqimg.imedao.com/15d74e6ee9b2fa3fe970b06b.png!186x186.jpg\",\"pic_size\":{\"width\":2,\"height\":1,\"qrcode\":false},\"pic\":\"http://xqimg.imedao.com/15d74e6ee9b2fa3fe970b06b.png!345x210.webp,http://xqimg.imedao.com/15d74e6ee0030a3fe5c9a8a1.png!345x210.webp\",\"view_count\":3203,\"created_at\":1500904882000,\"link_stock_desc\":null,\"link_stock_symbol\":null,\"strategy_id\":0,\"feedback\":null}\",\"column\":\"沪深\"}],\"addition\":[],\"next_id\":20192653}";
        s = s.replaceAll(TodayTopSpider.REG_REMOVE_7, "}");
        s = s.replaceAll(TodayTopSpider.REG_REMOVE_8, "{");
        LogManager.info(s);
        TodayResponse res = GsonProvider.gson().fromJson(s, TodayResponse.class);
        res.next_id = -1L;

    }

}