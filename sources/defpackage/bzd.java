package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bzd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bzd {
    static {
        byy byyVar = bze.a;
    }

    public static bze a(Context context) {
        bze bzeVar = bzr.d;
        if (bzeVar == null) {
            synchronized (bze.class) {
                bzeVar = bzr.d;
                if (bzeVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    bzeVar = new bzr(applicationContext, ieh.j(), bzr.n(), new byt(applicationContext));
                    bzr.d = bzeVar;
                }
            }
        }
        return bzeVar;
    }
}
