package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mzj  reason: default package */
/* loaded from: classes2.dex */
public final class mzj extends mzv {
    public static final mzj a;

    static {
        mzj mzjVar = new mzj();
        a = mzjVar;
        mzjVar.b = "<eof>";
    }

    private mzj() {
    }

    @Override // defpackage.mzv
    public final List a() {
        return nxp.n("<eof>");
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return mzzVar.b == str.length() ? new mzu(oji.a, mzzVar, mzzVar) : ndb.v(this, "Expecting <eof>", str, mzzVar);
    }
}
