package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: lhk  reason: default package */
/* loaded from: classes.dex */
final class lhk extends lkz implements Serializable {
    private static final long serialVersionUID = 1;
    final lho a;
    final lho b;
    final lep c;
    final lep d;
    final long e;
    final long f;
    final long g;
    final lil h;
    final int i;
    final lij j;
    final lgh k;
    transient lgk l;

    public lhk(lho lhoVar, lho lhoVar2, lep lepVar, lep lepVar2, long j, long j2, long j3, lil lilVar, int i, lij lijVar, lgh lghVar) {
        this.a = lhoVar;
        this.b = lhoVar2;
        this.c = lepVar;
        this.d = lepVar2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = lilVar;
        this.i = i;
        this.j = lijVar;
        this.k = (lghVar == lgh.a || lghVar == lgo.b) ? null : lghVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        lgo b = lgo.b();
        lho lhoVar = this.a;
        lho lhoVar2 = b.h;
        boolean z = false;
        jdg.J(lhoVar2 == null, "Key strength was already set to %s", lhoVar2);
        jdg.u(lhoVar);
        b.h = lhoVar;
        lho lhoVar3 = this.b;
        lho lhoVar4 = b.i;
        jdg.J(lhoVar4 == null, "Value strength was already set to %s", lhoVar4);
        jdg.u(lhoVar3);
        b.i = lhoVar3;
        lep lepVar = this.c;
        lep lepVar2 = b.l;
        jdg.J(lepVar2 == null, "key equivalence was already set to %s", lepVar2);
        jdg.u(lepVar);
        b.l = lepVar;
        lep lepVar3 = this.d;
        lep lepVar4 = b.m;
        jdg.J(lepVar4 == null, "value equivalence was already set to %s", lepVar4);
        jdg.u(lepVar3);
        b.m = lepVar3;
        b.e(this.i);
        b.h(this.j);
        b.c = false;
        long j = this.e;
        if (j > 0) {
            b.f(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.f;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = b.k;
            jdg.I(j3 == -1, "expireAfterAccess was already set to %s ns", j3);
            jdg.M(true, j2, timeUnit);
            b.k = timeUnit.toNanos(j2);
        }
        if (this.h != lgn.a) {
            lil lilVar = this.h;
            jdg.F(b.g == null);
            if (b.c) {
                long j4 = b.e;
                jdg.I(j4 == -1, "weigher can not be combined with maximum size", j4);
            }
            jdg.u(lilVar);
            b.g = lilVar;
            long j5 = this.g;
            if (j5 != -1) {
                long j6 = b.f;
                jdg.I(j6 == -1, "maximum weight was already set to %s", j6);
                long j7 = b.e;
                jdg.I(j7 == -1, "maximum size was already set to %s", j7);
                jdg.w(true, "maximum weight must not be negative");
                b.f = j5;
            }
        } else {
            long j8 = this.g;
            if (j8 != -1) {
                b.g(j8);
            }
        }
        lgh lghVar = this.k;
        if (lghVar != null) {
            if (b.o == null) {
                z = true;
            }
            jdg.F(z);
            b.o = lghVar;
        }
        this.l = b.a();
    }

    private Object readResolve() {
        return this.l;
    }

    @Override // defpackage.lkz
    protected final /* synthetic */ Object f() {
        return this.l;
    }
}
