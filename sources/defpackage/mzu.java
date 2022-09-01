package defpackage;

/* compiled from: PG */
/* renamed from: mzu  reason: default package */
/* loaded from: classes2.dex */
public final class mzu extends ndb {
    public final Object a;
    public final mzz b;
    public final mzz c;

    public mzu(Object obj, mzz mzzVar, mzz mzzVar2) {
        oll.e(mzzVar, "start");
        oll.e(mzzVar2, "end");
        this.a = obj;
        this.b = mzzVar;
        this.c = mzzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzu)) {
            return false;
        }
        mzu mzuVar = (mzu) obj;
        return oll.g(this.a, mzuVar.a) && oll.g(this.b, mzuVar.b) && oll.g(this.c, mzuVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        mzz mzzVar = this.b;
        mzz mzzVar2 = this.c;
        return "Success(value=" + obj + ", start=" + mzzVar + ", end=" + mzzVar2 + ")";
    }
}
