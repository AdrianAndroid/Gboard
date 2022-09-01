package j$.time.temporal;

import j$.time.ZoneOffset;

/* loaded from: classes3.dex */
final class o implements q {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.q
    public final Object a(m mVar) {
        switch (this.a) {
            case 0:
                return b(mVar);
            case 1:
                return (j$.time.chrono.g) mVar.i(p.b);
            case 2:
                return (TemporalUnit) mVar.i(p.c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (!mVar.f(aVar)) {
                    return null;
                }
                return ZoneOffset.l(mVar.b(aVar));
            case 4:
                return b(mVar);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (!mVar.f(aVar2)) {
                    return null;
                }
                return j$.time.g.u(mVar.h(aVar2));
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (!mVar.f(aVar3)) {
                    return null;
                }
                return j$.time.j.o(mVar.h(aVar3));
        }
    }

    public final j$.time.n b(m mVar) {
        q qVar = p.a;
        switch (this.a) {
            case 0:
                return (j$.time.n) mVar.i(qVar);
            default:
                j$.time.n nVar = (j$.time.n) mVar.i(qVar);
                if (nVar == null) {
                    return (j$.time.n) mVar.i(p.d);
                }
                return nVar;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
