package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: mzt  reason: default package */
/* loaded from: classes2.dex */
public final class mzt extends ndb {
    public final mzz a;
    public final String b;
    public final mzt c;
    private final String f;

    public mzt(String str, mzz mzzVar, String str2, mzt mztVar) {
        this.f = str;
        this.a = mzzVar;
        this.b = str2;
        this.c = mztVar;
    }

    private final mzt av() {
        mzt mztVar = this.c;
        return mztVar != null ? mztVar.av() : this;
    }

    public final mzt a(mzv mzvVar) {
        String str = mzvVar.b;
        String str2 = this.f;
        mzz mzzVar = this.a;
        oll.e(mzzVar, "position");
        return new mzt(str2, mzzVar, str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzt)) {
            return false;
        }
        mzt mztVar = (mzt) obj;
        return oll.g(this.f, mztVar.f) && oll.g(this.a, mztVar.a) && oll.g(this.b, mztVar.b) && oll.g(this.c, mztVar.c);
    }

    public final int hashCode() {
        int hashCode = ((this.f.hashCode() * 31) + this.a.hashCode()) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        mzt mztVar = this.c;
        if (mztVar != null) {
            i = mztVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = av().f;
        List o = oll.o(new omh(oll.p(new omh(new omm(this), kls.e, 0), kls.f), nbp.t, 1));
        StringBuilder sb = new StringBuilder();
        if (!o.isEmpty()) {
            ListIterator listIterator = o.listIterator(o.size());
            while (listIterator.hasPrevious()) {
                sb.append("\n  at ".concat(String.valueOf((String) listIterator.previous())));
            }
        }
        return str.concat(sb.toString());
    }
}
