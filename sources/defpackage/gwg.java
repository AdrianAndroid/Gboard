package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.inputmethod.libs.gestureui.GestureOverlayView;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gwg  reason: default package */
/* loaded from: classes.dex */
public final class gwg {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final Object e;

    public gwg() {
        this.b = new SparseArray();
        this.d = new ArrayList();
        this.e = new xy(200);
        this.a = false;
        this.c = new SparseIntArray();
    }

    private static String h(String str, char c) {
        String concat = "%".concat(String.valueOf(jdg.Y(Integer.toHexString(c))));
        lek f = lek.f(c);
        int length = concat.length();
        if (length == 0) {
            return f.h(str);
        }
        int i = 0;
        if (length == 1) {
            return str.toString().replace(((lee) f).a, concat.charAt(0));
        }
        String obj = str.toString();
        int c2 = f.c(obj);
        if (c2 == -1) {
            return obj;
        }
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) obj, i, c2);
            sb.append((CharSequence) concat);
            i = c2 + 1;
            c2 = f.d(obj, i);
        } while (c2 != -1);
        sb.append((CharSequence) obj, i, length2);
        return sb.toString();
    }

    private static String i(String str) {
        return h(h(h(str, '%'), '|'), '>');
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final gwj a() {
        File cacheDir;
        String str = (String) this.e;
        if (str.length() == 0 || str.length() > 32) {
            ((ltd) gwj.a.a(hip.a).k("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory$Builder", "checkLength", 441, "AutoCleanableDirectory.java")).E("The length of key (%s) must be >0 and <=%d", this.e, 32);
        }
        if (this.a) {
            cacheDir = ((Context) this.b).getFilesDir();
        } else {
            cacheDir = ((Context) this.b).getCacheDir();
        }
        llw m = lre.m(this.d);
        Object obj = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(i((String) obj));
        lsz it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append('|');
            sb.append(jdg.X(((gwi) entry.getKey()).toString()));
            sb.append('>');
            sb.append(i((String) entry.getValue()));
        }
        String h = h(h(sb.toString(), '%'), '/');
        ltg ltgVar = jan.a;
        int i = 0;
        String[] strArr = {"auto_clean", h};
        while (i < 2) {
            i++;
            cacheDir = new File(cacheDir, strArr[i]);
        }
        return new gwj(cacheDir, (String) this.e, m);
    }

    public final void b() {
        ((EnumMap) this.d).put((EnumMap) gwi.APP, (gwi) Long.toString(((gwh) this.c).b));
    }

    public final void c() {
        ((EnumMap) this.d).put((EnumMap) gwi.OS, (gwi) ((gwh) this.c).a);
    }

    public final void d() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xx, java.lang.Object] */
    public final void e(List list) {
        for (int i = 0; i < list.size(); i++) {
            this.e.b((dfs) list.get(i));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [xx, java.lang.Object] */
    public final void f(int i, float f, float f2, long j) {
        List list = (List) ((SparseArray) this.b).get(i);
        if (list == null) {
            list = new ArrayList(2);
            ((SparseArray) this.b).put(i, list);
        }
        dfs dfsVar = (dfs) this.e.a();
        if (dfsVar == null) {
            dfsVar = new dfs(f, f2, j);
        } else {
            dfsVar.a(f, f2, j);
        }
        list.add(dfsVar);
    }

    public final boolean g(List list, cvj cvjVar, long j) {
        int i;
        GestureOverlayView gestureOverlayView;
        cvj cvjVar2 = cvjVar;
        dfs dfsVar = (dfs) list.get(0);
        int size = list.size();
        int i2 = -1;
        int i3 = 0;
        while (i3 < size) {
            dfs dfsVar2 = (dfs) list.get(i3);
            GestureOverlayView gestureOverlayView2 = (GestureOverlayView) cvjVar2.a;
            int i4 = gestureOverlayView2.c;
            int i5 = gestureOverlayView2.b;
            if (i3 < size - gestureOverlayView2.d) {
                i4 = Math.round(i4 - (gestureOverlayView2.e * (i - i3)));
                i5 = Math.round(gestureOverlayView.b - (((GestureOverlayView) cvjVar2.a).f * ((size - gestureOverlayView.d) - i3)));
            }
            if (i4 > 0 && i5 > 0) {
                long j2 = j - dfsVar2.c;
                if (j2 <= 1000) {
                    long j3 = 1000 - j2;
                    int i6 = (int) ((i4 * j3) / 1000);
                    dfs dfsVar3 = dfsVar;
                    int i7 = (int) ((i5 * j3) / 1000);
                    if (i2 < 0) {
                        i2 = i3;
                    }
                    ((GestureOverlayView) cvjVar2.a).g.setAlpha(i6);
                    ((GestureOverlayView) cvjVar2.a).g.setStrokeWidth(i7);
                    GestureOverlayView gestureOverlayView3 = (GestureOverlayView) cvjVar2.a;
                    Canvas canvas = gestureOverlayView3.i;
                    float f = dfsVar3.a;
                    float f2 = dfsVar3.b;
                    float f3 = gestureOverlayView3.k;
                    canvas.drawLine(f, f2 + f3, dfsVar2.a, dfsVar2.b + f3, gestureOverlayView3.g);
                    float min = Math.min(dfsVar3.a, dfsVar2.a);
                    int i8 = ((GestureOverlayView) cvjVar2.a).b;
                    float max = Math.max(dfsVar3.a, dfsVar2.a);
                    int i9 = ((GestureOverlayView) cvjVar2.a).b;
                    float min2 = Math.min(dfsVar3.b, dfsVar2.b);
                    GestureOverlayView gestureOverlayView4 = (GestureOverlayView) cvjVar2.a;
                    int i10 = gestureOverlayView4.b;
                    int i11 = gestureOverlayView4.k;
                    float max2 = Math.max(dfsVar3.b, dfsVar2.b);
                    GestureOverlayView gestureOverlayView5 = (GestureOverlayView) cvjVar2.a;
                    gestureOverlayView5.h.union(((int) min) - i8, (((int) min2) - i10) + i11, ((int) max) + i9, ((int) max2) + gestureOverlayView5.b + gestureOverlayView5.k);
                }
            }
            i3++;
            cvjVar2 = cvjVar;
            dfsVar = dfsVar2;
        }
        if (i2 > 0) {
            List subList = list.subList(0, i2);
            e(subList);
            subList.clear();
            return false;
        } else if (i2 >= 0) {
            return false;
        } else {
            e(list);
            return true;
        }
    }

    public gwg(Context context, String str, gwh gwhVar) {
        this.d = new EnumMap(gwi.class);
        if (!TextUtils.isEmpty(str)) {
            this.b = context;
            this.e = str;
            this.c = gwhVar;
            return;
        }
        throw new IllegalArgumentException();
    }
}
