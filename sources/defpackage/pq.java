package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: pq  reason: default package */
/* loaded from: classes2.dex */
public final class pq extends fy {
    public final Object a = new Object();
    public volatile Handler b;

    public pq() {
        Executors.newFixedThreadPool(4, new goo(1, null));
    }

    public static Handler b(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
