package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: mzp  reason: default package */
/* loaded from: classes2.dex */
public final class mzp extends mzv {
    private final mzv a;
    private final Integer c;

    public mzp(mzv mzvVar, Integer num) {
        this.a = mzvVar;
        this.c = num;
        if (num == null || num.intValue() >= 0) {
            return;
        }
        throw new IllegalArgumentException("Limit cannot be negative");
    }

    public static final ndb c(mzp mzpVar, List list, String str, olq olqVar, mzz mzzVar) {
        if (mzpVar.c == null || list.size() < mzpVar.c.intValue()) {
            return mzw.q(mzpVar.a.b(str, mzzVar), new mzo(list, olqVar, mzpVar, str));
        }
        return ndb.v(mzpVar, "Limit reached", str, mzzVar);
    }

    @Override // defpackage.mzv
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        ArrayList arrayList = new ArrayList();
        olq olqVar = new olq();
        olqVar.a = mzzVar;
        c(this, arrayList, str, olqVar, mzzVar);
        return new mzu(arrayList, mzzVar, (mzz) olqVar.a);
    }
}
