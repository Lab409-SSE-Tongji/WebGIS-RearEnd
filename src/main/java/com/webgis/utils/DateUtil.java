package com.webgis.utils;

import com.webgis.web.BaseResult;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Created by CCMEOW on 2017/6/5.
 */
public class DateUtil {
    public static String toTimestamp(Long date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date(date * 1000);
        String ts = sdf.format(date);
        return ts;
    }
}
