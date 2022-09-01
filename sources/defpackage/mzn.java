package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mzn  reason: default package */
/* loaded from: classes2.dex */
public final class mzn extends mzv {
    private final okf a;

    public mzn(okf okfVar) {
        this.a = okfVar;
    }

    @Override // defpackage.mzv
    public final List a() {
        return ((mzv) this.a.a()).a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return ((mzv) this.a.a()).b(str, mzzVar);
    }
}
