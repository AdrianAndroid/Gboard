package defpackage;

import android.content.Context;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gon  reason: default package */
/* loaded from: classes.dex */
public final class gon {
    public static lgb a;
    private static final ltg e = ltg.j("com/google/android/libraries/gsa/s3/lib/S3LibRecognizer");
    public final gnx b;
    public final lgb c;
    public gnw d;

    public gon(Context context, gnx gnxVar, lgb lgbVar, Executor executor, blc blcVar, ble bleVar) {
        boolean z = false;
        this.b = (gnx) Proxy.newProxyInstance(gnx.class.getClassLoader(), new Class[]{gnx.class}, new bnd(executor, gnxVar, gnx.class));
        jdg.v(context == context.getApplicationContext() ? true : z);
        synchronized (gon.class) {
            if (a == null) {
                a = jdg.n(new ixf(context, blcVar, bleVar, 1));
            } else {
                ((ltd) ((ltd) e.c()).k("com/google/android/libraries/gsa/s3/lib/S3LibRecognizer", "<init>", 129, "S3LibRecognizer.java")).t("Please only ever create one S3LibRecognizer!");
            }
        }
        this.c = lgbVar;
    }
}
