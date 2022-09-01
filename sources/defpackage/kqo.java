package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqo  reason: default package */
/* loaded from: classes.dex */
public final class kqo extends kqt {
    public static final kqt a = new kqo();

    private kqo() {
    }

    @Override // defpackage.kqt
    public final /* bridge */ /* synthetic */ kqs a(kqh kqhVar, String str, Executor executor, kcq kcqVar, kqc kqcVar) {
        nfb a2;
        jdg.u(kqcVar);
        if (kqhVar.e) {
            a2 = nfb.b();
        } else {
            a2 = nfb.a();
        }
        return new kqp(str, kcu.K(kqhVar.a), new kqx(kqhVar.b, a2), executor, kcqVar, kqhVar.c, null, null, null);
    }
}
