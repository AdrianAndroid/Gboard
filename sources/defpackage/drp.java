package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: drp  reason: default package */
/* loaded from: classes.dex */
public final class drp {
    public static final lug a = hin.a;

    public static int a(boolean z) {
        return z ? 2 : 0;
    }

    public static int b(boolean z) {
        return z ? 2 : 0;
    }

    public static int c(boolean z) {
        return z ? 1 : 0;
    }

    public static void d(Context context, String str, int i, String str2, dro droVar) {
        bze a2 = bzd.a(context);
        mks mksVar = gxp.a().c;
        if (i < 0) {
            return;
        }
        bzt bztVar = new bzt(str2);
        bztVar.e = 500;
        bztVar.f = 500;
        a2.i(bztVar.a());
        kcu.U(a2.b(str2), new drm(a2, mksVar, str, i, str2, droVar), mksVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(bze bzeVar, Executor executor, String str, int i, String str2, boolean z, dro droVar) {
        jsu j = jsv.j();
        j.a = str;
        j.g(c(z));
        j.c(a(z));
        j.d(b(z));
        kcu.U(mio.h(mio.h(bzeVar.e(str2, i, j.a()), new jkh(bzeVar, str2, z, 1), executor), new dvb(bzeVar, str2, 1), executor), new buo(droVar, 17), executor);
    }
}
