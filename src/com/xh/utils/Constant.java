package com.xh.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Constant {
    public static final HashMap<String, String> paths = new HashMap();
    public static final ArrayList<String> adapters = new ArrayList();

    static
    {
        paths.put("WebView", "android.webkit.WebView");
        paths.put("View", "android.view.View");
        paths.put("ViewStub", "android.view.ViewStub");
        paths.put("SurfaceView", "android.view.SurfaceView");
        paths.put("TextureView", "android.view.TextureView");

        adapters.add("android.widget.ListAdapter");
        adapters.add("android.widget.ArrayAdapter");
        adapters.add("android.widget.BaseAdapter");
        adapters.add("android.widget.HeaderViewListAdapter");
        adapters.add("android.widget.SimpleAdapter");
        adapters.add("android.support.v4.widget.CursorAdapter");
        adapters.add("android.support.v4.widget.SimpleCursorAdapter");
        adapters.add("android.support.v4.widget.ResourceCursorAdapter");
    }
}
