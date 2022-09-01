package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mzq  reason: default package */
/* loaded from: classes2.dex */
public final class mzq extends mzv {
    private final mzv a;

    public mzq(mzv mzvVar) {
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
        return mzw.r(this.a.b(str, mzzVar), new klr(mzzVar, 11));
    }
}
