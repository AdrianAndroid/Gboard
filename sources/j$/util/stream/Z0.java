package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z0 extends R0 {
    final /* synthetic */ long s = 0;
    final /* synthetic */ long t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(AbstractC0015c abstractC0015c, int i, long j) {
        super(abstractC0015c, i);
        this.t = j;
    }

    static j$.util.r e0(j$.util.r rVar, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j5 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j4 = 0;
        } else {
            j4 = j;
            j5 = j2;
        }
        return new F1(rVar, j4, j5);
    }

    @Override // j$.util.stream.AbstractC0015c
    final N W(j$.util.r rVar, IntFunction intFunction, AbstractC0015c abstractC0015c) {
        long C = abstractC0015c.C(rVar);
        return (C <= 0 || !rVar.hasCharacteristics(16384)) ? !EnumC0053o1.ORDERED.d(abstractC0015c.F()) ? E.x(this, e0(abstractC0015c.d0(rVar), this.s, this.t, C), true, intFunction) : (N) new C0014b1(this, abstractC0015c, rVar, intFunction, this.s, this.t).invoke() : E.x(abstractC0015c, E.v(abstractC0015c.S(), rVar, this.s, this.t), true, intFunction);
    }

    @Override // j$.util.stream.AbstractC0015c
    final j$.util.r X(AbstractC0015c abstractC0015c, j$.util.r rVar) {
        long C = abstractC0015c.C(rVar);
        if (C > 0 && rVar.hasCharacteristics(16384)) {
            j$.util.r d0 = abstractC0015c.d0(rVar);
            long j = this.s;
            return new D1(d0, j, E.u(j, this.t));
        } else if (!EnumC0053o1.ORDERED.d(abstractC0015c.F())) {
            return e0(abstractC0015c.d0(rVar), this.s, this.t, C);
        } else {
            return ((N) new C0014b1(this, abstractC0015c, rVar, new C0012b(8), this.s, this.t).invoke()).mo59spliterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final X0 Z(int i, X0 x0) {
        return new Y0(this, x0);
    }
}
