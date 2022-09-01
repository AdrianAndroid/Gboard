package defpackage;

/* compiled from: PG */
/* renamed from: khz  reason: default package */
/* loaded from: classes.dex */
public abstract class khz {
    private final oor a;

    public khz(oor oorVar) {
        this.a = oorVar;
    }

    public abstract long a(String str);

    public abstract oor b(Long l);

    public abstract boolean c();

    public final oor d() {
        oor e = e(null);
        nfh nfhVar = (nfh) e.N(5);
        nfhVar.cG(e);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        oor oorVar = (oor) nfhVar.b;
        oor oorVar2 = oor.d;
        oorVar.a |= 2;
        oorVar.b = -1L;
        return (oor) nfhVar.cz();
    }

    public final oor e(Long l) {
        oor oorVar = this.a;
        int f = ofb.f(oorVar.c);
        if (f != 0 && f == 5) {
            if (l == null || l.longValue() == this.a.b) {
                return this.a;
            }
            nfh t = oor.d.t();
            int f2 = ofb.f(this.a.c);
            if (f2 == 0) {
                f2 = 1;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oor oorVar2 = (oor) t.b;
            oorVar2.c = f2 - 1;
            oorVar2.a |= 4;
            long longValue = l.longValue();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oor oorVar3 = (oor) t.b;
            oorVar3.a |= 2;
            oorVar3.b = longValue;
            return (oor) t.cz();
        }
        return oorVar;
    }
}
