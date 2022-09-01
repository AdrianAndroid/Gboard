package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mzm  reason: default package */
/* loaded from: classes2.dex */
public final class mzm extends mzv {
    private final mzv a;

    public mzm(mzv mzvVar) {
        this.a = mzvVar;
    }

    @Override // defpackage.mzv
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return mzw.q(this.a.b(str, mzzVar), mzl.a);
    }
}
