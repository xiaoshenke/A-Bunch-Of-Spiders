package wuxian.me.xueqiuspider.dataprocess.statistic;

import wuxian.me.spidercommon.log.LogManager;

import java.util.*;

/**
 * Created by wuxian on 28/7/2017.
 */
public class StatisticImpl implements IStatistic<String> {

    private HashMap<String, StatisModel> modelMap = new HashMap<String, StatisModel>();


    @Override
    public Iterator<IModel<String>> sortAndCount(List<String> dataList) {

        for (int i = 0; i < dataList.size(); i++) {

            String s = dataList.get(i);
            if (modelMap.containsKey(s)) {
                modelMap.get(s).positions.add(i);
            } else {
                StatisModel model = new StatisModel();
                model.key = s;
                model.positions.add(i);
                modelMap.put(s, model);
            }
        }

        List<IModel<String>> list = new ArrayList<IModel<String>>(modelMap.values());
        Collections.sort(list, new StatisModel.Comparator());

        //list = list.size() > 10 ? list.subList(0, 10) : list;
        //LogManager.info(list.toString());

        return list.iterator();
    }
}
