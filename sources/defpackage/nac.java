package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nac  reason: default package */
/* loaded from: classes2.dex */
public final class nac extends mzv {
    public final mzv a;
    private final mzs c;

    public nac(mzs mzsVar, mzv mzvVar) {
        this.c = mzsVar;
        this.a = mzvVar;
    }

    @Override // defpackage.mzv
    public final List a() {
        return this.c.a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return mzw.r(mzw.q(this.c.b(str, mzzVar), new mzr(this, str, 4)), new klr(this, 15));
    }
}
