package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: hdq  reason: default package */
/* loaded from: classes.dex */
public final class hdq implements lgb {
    public static final int b = 2130903064;
    private static volatile hdq d;
    public final mko c;
    private final Future f;
    private volatile lmz g;
    public static final lug a = hin.a;
    private static final hdq e = new hdq(kcu.K(lmz.g().g()));

    public hdq(Context context) {
        mks c = gxo.c(9);
        mko O = kcu.O(new evl(context, 14), c);
        this.c = O;
        this.f = mio.g(O, new hdp(context, 0), c);
    }

    public static hdq b() {
        if (d == null) {
            ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiSetSupplier", "getInstance", 91, "EmojiSetSupplier.java")).t("EmojiSetSupplier#initialize() must be called before use.");
            return e;
        }
        return d;
    }

    public static List d(Context context, int i) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        ArrayList arrayList = new ArrayList(obtainTypedArray.length());
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            int resourceId = obtainTypedArray.getResourceId(i2, 0);
            if (resourceId != 0) {
                arrayList.add(Integer.valueOf(resourceId));
            } else {
                ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiSetSupplier", "getResourceIds", 239, "EmojiSetSupplier.java")).E("Invalid resource ID was specified in %s (index=%d)", jbi.i(i), i2);
            }
        }
        obtainTypedArray.recycle();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(llk llkVar, String str) {
        String replace;
        llkVar.h(str);
        if (Build.VERSION.SDK_INT >= 24 || str == (replace = str.replace("️", ""))) {
            return;
        }
        llkVar.h(replace);
    }

    public static void f(Context context) {
        if (d == null) {
            synchronized (hdq.class) {
                if (d == null) {
                    d = new hdq(context);
                }
            }
        }
    }

    @Override // defpackage.lgb
    /* renamed from: c */
    public final lmz a() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    try {
                        this.g = (lmz) this.f.get(10L, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                        ((luc) ((luc) ((luc) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiSetSupplier", "get", (char) 133, "EmojiSetSupplier.java")).t("Reading emoji list failed.");
                        this.g = lrr.a;
                    }
                }
            }
        }
        return this.g;
    }

    public hdq(Future future) {
        this.f = future;
        this.c = kcu.K(lrq.b);
    }
}
