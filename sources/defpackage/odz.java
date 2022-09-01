package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: odz  reason: default package */
/* loaded from: classes2.dex */
public final class odz implements nyw {
    final oea a;
    public final /* synthetic */ oec b;

    public odz(oec oecVar, oea oeaVar) {
        this.b = oecVar;
        this.a = oeaVar;
    }

    private static final Integer b(num numVar) {
        String str = (String) numVar.b(oec.b);
        if (str != null) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return null;
    }

    @Override // defpackage.nyw
    public final void a(nvu nvuVar, nyv nyvVar, num numVar) {
        boolean z;
        odv odvVar;
        long nanos;
        synchronized (this.b.l) {
            oec oecVar = this.b;
            ody odyVar = oecVar.q;
            oea oeaVar = this.a;
            z = true;
            oeaVar.b = true;
            if (odyVar.c.contains(oeaVar)) {
                ArrayList arrayList = new ArrayList(odyVar.c);
                arrayList.remove(oeaVar);
                odyVar = new ody(odyVar.b, Collections.unmodifiableCollection(arrayList), odyVar.d, odyVar.f, odyVar.g, odyVar.a, odyVar.h, odyVar.e);
            }
            oecVar.q = odyVar;
            this.b.p.a(nvuVar.o);
        }
        oea oeaVar2 = this.a;
        if (oeaVar2.c) {
            this.b.r(oeaVar2);
            if (this.b.q.f != this.a) {
                return;
            }
            this.b.g.execute(new bvr(this, nvuVar, nyvVar, numVar, 5));
        } else if (nyvVar != nyv.MISCARRIED || this.b.s.incrementAndGet() <= 1000) {
            if (this.b.q.f == null) {
                boolean z2 = false;
                if (nyvVar == nyv.MISCARRIED || (nyvVar == nyv.REFUSED && this.b.r.compareAndSet(false, true))) {
                    oea p = this.b.p(this.a.d, true);
                    oec oecVar2 = this.b;
                    if (oecVar2.k) {
                        synchronized (oecVar2.l) {
                            oec oecVar3 = this.b;
                            ody odyVar2 = oecVar3.q;
                            oea oeaVar3 = this.a;
                            ArrayList arrayList2 = new ArrayList(odyVar2.d);
                            arrayList2.remove(oeaVar3);
                            arrayList2.add(p);
                            oecVar3.q = new ody(odyVar2.b, odyVar2.c, Collections.unmodifiableCollection(arrayList2), odyVar2.f, odyVar2.g, odyVar2.a, odyVar2.h, odyVar2.e);
                            oec oecVar4 = this.b;
                            if (oecVar4.v(oecVar4.q) || this.b.q.d.size() != 1) {
                                z = false;
                            }
                        }
                        if (z) {
                            this.b.r(p);
                        }
                    } else {
                        oed oedVar = oecVar2.i;
                        if (oedVar == null || oedVar.a == 1) {
                            oecVar2.r(p);
                        }
                    }
                    this.b.f.execute(new nzm(this, p, 17));
                    return;
                } else if (nyvVar == nyv.DROPPED) {
                    oec oecVar5 = this.b;
                    if (oecVar5.k) {
                        oecVar5.u();
                    }
                } else {
                    this.b.r.set(true);
                    oec oecVar6 = this.b;
                    if (oecVar6.k) {
                        Integer b = b(numVar);
                        boolean z3 = !this.b.j.c.contains(nvuVar.o);
                        boolean z4 = (this.b.o == null || (z3 && (b == null || b.intValue() >= 0))) ? false : !this.b.o.b();
                        if (z3 || z4) {
                            z = false;
                        }
                        if (z) {
                            oec oecVar7 = this.b;
                            if (b != null) {
                                if (b.intValue() < 0) {
                                    oecVar7.u();
                                } else {
                                    synchronized (oecVar7.l) {
                                        odv odvVar2 = oecVar7.w;
                                        if (odvVar2 != null) {
                                            Future a = odvVar2.a();
                                            odv odvVar3 = new odv(oecVar7.l);
                                            oecVar7.w = odvVar3;
                                            if (a != null) {
                                                a.cancel(false);
                                            }
                                            odvVar3.b(oecVar7.h.schedule(new odw(oecVar7, odvVar3, 0), b.intValue(), TimeUnit.MILLISECONDS));
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this.b.l) {
                            oec oecVar8 = this.b;
                            ody odyVar3 = oecVar8.q;
                            oea oeaVar4 = this.a;
                            ArrayList arrayList3 = new ArrayList(odyVar3.d);
                            arrayList3.remove(oeaVar4);
                            oecVar8.q = new ody(odyVar3.b, odyVar3.c, Collections.unmodifiableCollection(arrayList3), odyVar3.f, odyVar3.g, odyVar3.a, odyVar3.h, odyVar3.e);
                            if (z) {
                                oec oecVar9 = this.b;
                                if (oecVar9.v(oecVar9.q) || !this.b.q.d.isEmpty()) {
                                    return;
                                }
                            }
                        }
                    } else {
                        oed oedVar2 = oecVar6.i;
                        long j = 0;
                        if (oedVar2 != null) {
                            boolean contains = oedVar2.f.contains(nvuVar.o);
                            Integer b2 = b(numVar);
                            boolean z5 = (this.b.o == null || (!contains && (b2 == null || b2.intValue() >= 0))) ? false : !this.b.o.b();
                            oec oecVar10 = this.b;
                            if (oecVar10.i.a > this.a.d + 1 && !z5) {
                                if (b2 == null) {
                                    if (contains) {
                                        double d = oecVar10.x;
                                        double nextDouble = oec.d.nextDouble();
                                        Double.isNaN(d);
                                        nanos = (long) (d * nextDouble);
                                        oec oecVar11 = this.b;
                                        long j2 = oecVar11.x;
                                        oed oedVar3 = oecVar11.i;
                                        double d2 = j2;
                                        double d3 = oedVar3.d;
                                        Double.isNaN(d2);
                                        oecVar11.x = Math.min((long) (d2 * d3), oedVar3.c);
                                        j = nanos;
                                    }
                                } else if (b2.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(b2.intValue());
                                    oec oecVar12 = this.b;
                                    oecVar12.x = oecVar12.i.b;
                                    j = nanos;
                                }
                                z2 = z;
                            }
                            z = false;
                            z2 = z;
                        }
                        if (z2) {
                            synchronized (this.b.l) {
                                oec oecVar13 = this.b;
                                odvVar = new odv(oecVar13.l);
                                oecVar13.v = odvVar;
                            }
                            odvVar.b(this.b.h.schedule(new obv(this, 12), j, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            this.b.r(this.a);
            if (this.b.q.f != this.a) {
                return;
            }
            this.b.g.execute(new bvr(this, nvuVar, nyvVar, numVar, 7));
        } else {
            this.b.r(this.a);
            if (this.b.q.f != this.a) {
                return;
            }
            this.b.g.execute(new bvr(this, nvu.k.f("Too many transparent retries. Might be a bug in gRPC").e(nvuVar.h()), nyvVar, numVar, 6));
        }
    }

    @Override // defpackage.nyw
    public final void c(num numVar) {
        int i;
        int i2;
        this.b.r(this.a);
        if (this.b.q.f == this.a) {
            oeb oebVar = this.b.o;
            if (oebVar != null) {
                do {
                    i = oebVar.d.get();
                    i2 = oebVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!oebVar.d.compareAndSet(i, Math.min(oebVar.c + i, i2)));
            }
            this.b.g.execute(new nzm(this, numVar, 16));
        }
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        ody odyVar = this.b.q;
        jdg.G(odyVar.f != null, "Headers should be received prior to messages.");
        if (odyVar.f != this.a) {
            return;
        }
        this.b.g.execute(new nzm(this, ofiVar, 18));
    }

    @Override // defpackage.ofj
    public final void e() {
        if (!this.b.o()) {
            return;
        }
        this.b.g.execute(new obv(this, 13));
    }
}
