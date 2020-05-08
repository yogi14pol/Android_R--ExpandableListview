package com.clicks.yogi.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListData {

    public static HashMap<String, List<String>> getData() {

        HashMap<String, List<String>> expandableListDetail = new
                HashMap<String, List<String>>();

        List<String> basic = new ArrayList<String>();
        basic.add("Activity Lifecycle");
        basic.add("Marquee Text");
        basic.add("Splash screen");
        basic.add("Moving from one activity to another activity");
        basic.add("Simple Toast with positioning");
        basic.add("ImageSwitcher");

        List<String> Tips = new ArrayList<String>();
        Tips.add("How to build Bundle(s) and APK(s)");
        Tips.add("How to build generated signed Bundle(s) and APK(s)");
        Tips.add("How to change the Icon of the app");
        Tips.add("How to disable landscape and portrait mode");
        Tips.add("How to change application name after creating an app");
        Tips.add("What is the use of intent-filter in AndroidManifest.xml");

        List<String> advanced = new ArrayList<String>();
        advanced.add("Login and register page using SQLiteDatabase");
        advanced.add("Broadcast Receiver");
        advanced.add("Navigation Drawer");
        advanced.add("RecyclerView");
        advanced.add("Canvas");
        advanced.add("Custom GridView");

        expandableListDetail.put("Basic Programming", basic);
        expandableListDetail.put("Android Tips", Tips);
        expandableListDetail.put("Advanced Programming", advanced);
        return expandableListDetail;
    }
}