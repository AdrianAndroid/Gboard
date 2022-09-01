package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mzs  reason: default package */
/* loaded from: classes2.dex */
public final class mzs extends mzv {
    public final mzv a;
    private final mzv c;

    public mzs(mzv mzvVar, mzv mzvVar2) {
        oll.e(mzvVar, "left");
        oll.e(mzvVar2, "right");
        this.c = mzvVar;
        this.a = mzvVar2;
    }

    @Override // defpackage.mzv
    public final List a() {
        return this.c.a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return mzw.r(mzw.q(this.c.b(str, mzzVar), new mzr(this, str, 0)), new klr(this, 12));
    }
}
