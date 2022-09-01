package defpackage;

import android.content.Context;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: ccz  reason: default package */
/* loaded from: classes.dex */
public final class ccz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamPropertiesWrapper");
    public static volatile ccz b;
    public final ccu c;
    public final idk d;
    public final mkr e;
    public Map k;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicLong g = new AtomicLong();
    public final AtomicLong h = new AtomicLong();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public mko l = kcu.K(false);
    public mko m = kcu.K(false);
    public ghh n = null;

    public ccz(Context context) {
        ccu a2 = ccu.a(context);
        ieh j = ieh.j();
        mks c = gxo.c(11);
        HashMap hashMap = new HashMap();
        this.c = a2;
        this.d = j;
        this.k = hashMap;
        this.e = c;
    }

    public final void a(String str, jav javVar, ghi ghiVar) {
        ((Map) Map.EL.computeIfAbsent(this.k, str, byw.d)).put(javVar, ghiVar);
    }
}
