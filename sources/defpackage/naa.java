package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: naa  reason: default package */
/* loaded from: classes2.dex */
public final class naa extends mzv {
    private final String a;

    public naa(String str) {
        oll.e(str, "token");
        this.a = str;
    }

    @Override // defpackage.mzv
    public final List a() {
        return nxp.n(this.a);
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        if (ols.m(str, this.a, mzzVar.b)) {
            String str2 = this.a;
            return new mzu(str2, mzzVar, mzzVar.a(str2));
        }
        String str3 = this.a;
        return ndb.v(this, "Expecting '" + str3 + "'", str, mzzVar);
    }
}
