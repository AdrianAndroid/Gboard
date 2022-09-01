package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ayd  reason: default package */
/* loaded from: classes.dex */
public final class ayd implements axy {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config[] b;
    public static final Bitmap.Config[] c;
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public final ayc f = new ayc();
    public final axs g = new axs();
    private final Map h = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        a = configArr;
        b = configArr;
        c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i, Bitmap.Config config) {
        String valueOf = String.valueOf(config);
        return "[" + i + "](" + valueOf + ")";
    }

    public final NavigableMap b(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.h.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.h.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final void c(Integer num, Bitmap bitmap) {
        NavigableMap b2 = b(bitmap.getConfig());
        Integer num2 = (Integer) b2.get(num);
        if (num2 == null) {
            String a2 = a(bgj.a(bitmap), bitmap.getConfig());
            String obj = toString();
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a2 + ", this: " + obj);
        } else if (num2.intValue() == 1) {
            b2.remove(num);
        } else {
            b2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
