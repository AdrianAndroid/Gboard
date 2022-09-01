package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: xg  reason: default package */
/* loaded from: classes2.dex */
public final class xg {
    public static final ExecutorService b;
    public static final qu a = new qu(16);
    public static final Object c = new Object();
    public static final qv d = new qv();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new kjh(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    public static String a(xd xdVar, int i) {
        return xdVar.f + "-" + i;
    }

    public static krm b(String str, Context context, xd xdVar, int i) {
        int i2;
        gjk[] gjkVarArr;
        int length;
        Typeface typeface = (Typeface) a.b(str);
        if (typeface == null) {
            try {
                krm a2 = xc.a(context, xdVar);
                if (a2.a != 0) {
                    i2 = -2;
                } else {
                    Object obj = a2.b;
                    if (obj == null || (length = (gjkVarArr = (gjk[]) obj).length) == 0) {
                        i2 = 1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = gjkVarArr[i3].d;
                            if (i4 != 0) {
                                i2 = i4 < 0 ? -3 : i4;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (i2 != 0) {
                    return new krm(i2);
                }
                Typeface e = vu.e(context, (gjk[]) a2.b, i);
                if (e == null) {
                    return new krm(-3);
                }
                a.c(str, e);
                return new krm(e);
            } catch (PackageManager.NameNotFoundException unused) {
                return new krm(-1);
            }
        }
        return new krm(typeface);
    }
}
