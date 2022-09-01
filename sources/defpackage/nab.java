package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nab  reason: default package */
/* loaded from: classes2.dex */
public final class nab extends mzv {
    public final okq a;
    private final mzv c;

    public nab(mzv mzvVar, okq okqVar) {
        this.c = mzvVar;
        this.a = okqVar;
    }

    @Override // defpackage.mzv
    public final List a() {
        return this.c.a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return mzw.r(mzw.q(this.c.b(str, mzzVar), new mzr(this, str, 2)), new klr(this, 14));
    }
}
