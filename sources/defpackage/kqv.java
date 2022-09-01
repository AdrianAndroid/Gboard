package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: kqv  reason: default package */
/* loaded from: classes.dex */
public final class kqv extends kqb {
    private final ngz a;

    public kqv(ngz ngzVar) {
        this.a = ngzVar;
    }

    @Override // defpackage.kqb
    public final mko a(IOException iOException, jlr jlrVar) {
        if (!(iOException.getCause() instanceof ngd)) {
            return kcu.J(iOException);
        }
        mko K = kcu.K(this.a);
        kqp kqpVar = (kqp) jlrVar.a;
        return mhu.h(mio.h(K, ldd.c(new jzh(kqpVar, 6)), kqpVar.c), IOException.class, new jzh(iOException, 13), mjl.a);
    }
}
