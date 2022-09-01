package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: kg  reason: default package */
/* loaded from: classes.dex */
final class kg {
    public static boolean a;
    private static Method b;
    private static Method c;
    private static Method d;

    static {
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", Integer.TYPE, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE);
            b = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
            c = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
            d = declaredMethod3;
            declaredMethod3.setAccessible(true);
            a = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(kk kkVar, int i, View view) {
        try {
            Method method = b;
            Integer valueOf = Integer.valueOf(i);
            method.invoke(kkVar, valueOf, view, false, -1, -1);
            c.invoke(kkVar, valueOf);
            d.invoke(kkVar, valueOf);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }
}
