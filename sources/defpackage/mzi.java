package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: mzi  reason: default package */
/* loaded from: classes2.dex */
public final class mzi extends mzv {
    public final List a;

    public mzi(List list) {
        oll.e(list, "parsers");
        this.a = list;
    }

    @Override // defpackage.mzv
    public final List a() {
        List<mzv> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (mzv mzvVar : list) {
            nxp.t(arrayList, mzvVar.a());
        }
        return arrayList;
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        List<mzv> list = this.a;
        mzt v = ndb.v(this, "Expecting one of ".concat(nxp.w(a(), null, null, null, kls.d, 31)), str, mzzVar);
        for (mzv mzvVar : list) {
            ndb b = mzvVar.b(str, mzzVar);
            if (b instanceof mzu) {
                return b;
            }
            if (b instanceof mzt) {
                mzt mztVar = (mzt) b;
                if (mztVar.a.b > v.a.b) {
                    v = mztVar.a(this);
                }
            } else {
                throw new ojb();
            }
        }
        return v;
    }
}
