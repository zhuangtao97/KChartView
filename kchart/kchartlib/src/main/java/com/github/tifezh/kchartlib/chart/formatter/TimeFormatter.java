package com.github.tifezh.kchartlib.chart.formatter;

import com.github.tifezh.kchartlib.chart.impl.IDateTimeFormatter;
import com.github.tifezh.kchartlib.utils.DateUtil;

import java.util.Date;

/**
 * 时间格式化器
 * Created by tifezh on 2016/6/21.
 */

public class TimeFormatter implements IDateTimeFormatter {
    @Override
    public String format(Date date) {
        return DateUtil.shortTimeFormat.format(date);
    }
}
