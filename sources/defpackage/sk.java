package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: sk  reason: default package */
/* loaded from: classes2.dex */
public final class sk {
    public final sa a;
    public final sa d;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();
    public sz g = null;
    private final sh h = new sh();
    final ArrayList f = new ArrayList();

    public sk(sa saVar) {
        new ArrayList();
        this.a = saVar;
        this.d = saVar;
    }

    private final void e(st stVar, int i, ArrayList arrayList) {
        for (sj sjVar : stVar.h.j) {
            if (sjVar instanceof sl) {
                g((sl) sjVar, i, stVar.i, arrayList, null);
            } else if (sjVar instanceof st) {
                g(((st) sjVar).h, i, stVar.i, arrayList, null);
            }
        }
        for (sj sjVar2 : stVar.i.j) {
            if (sjVar2 instanceof sl) {
                g((sl) sjVar2, i, stVar.h, arrayList, null);
            } else if (sjVar2 instanceof st) {
                g(((st) sjVar2).i, i, stVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (sj sjVar3 : ((sr) stVar).a.j) {
                if (sjVar3 instanceof sl) {
                    g((sl) sjVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(rz rzVar, int i, int i2, int i3, int i4) {
        sh shVar = this.h;
        shVar.i = i;
        shVar.j = i3;
        shVar.a = i2;
        shVar.b = i4;
        this.g.a(rzVar, shVar);
        rzVar.C(this.h.c);
        rzVar.x(this.h.d);
        sh shVar2 = this.h;
        rzVar.F = shVar2.f;
        rzVar.u(shVar2.e);
    }

    private final void g(sl slVar, int i, sl slVar2, ArrayList arrayList, adx adxVar) {
        st stVar = slVar.d;
        if (stVar.l == null) {
            sa saVar = this.a;
            if (stVar == saVar.h || stVar == saVar.i) {
                return;
            }
            if (adxVar == null) {
                adxVar = new adx(stVar);
                arrayList.add(adxVar);
            }
            stVar.l = adxVar;
            ((ArrayList) adxVar.a).add(stVar);
            for (sj sjVar : stVar.h.j) {
                if (sjVar instanceof sl) {
                    g((sl) sjVar, i, slVar2, arrayList, adxVar);
                }
            }
            for (sj sjVar2 : stVar.i.j) {
                if (sjVar2 instanceof sl) {
                    g((sl) sjVar2, i, slVar2, arrayList, adxVar);
                }
            }
            if (i == 1 && (stVar instanceof sr)) {
                for (sj sjVar3 : ((sr) stVar).a.j) {
                    if (sjVar3 instanceof sl) {
                        g((sl) sjVar3, 1, slVar2, arrayList, adxVar);
                    }
                }
            }
            for (sl slVar3 : stVar.h.k) {
                g(slVar3, i, slVar2, arrayList, adxVar);
            }
            for (sl slVar4 : stVar.i.k) {
                g(slVar4, i, slVar2, arrayList, adxVar);
            }
            if (i != 1 || !(stVar instanceof sr)) {
                return;
            }
            for (sl slVar5 : ((sr) stVar).a.k) {
                g(slVar5, 1, slVar2, arrayList, adxVar);
            }
        }
    }

    public final int a(sa saVar, int i) {
        st stVar;
        long a;
        sl slVar;
        sl slVar2;
        float f;
        sk skVar = this;
        sa saVar2 = saVar;
        int size = skVar.f.size();
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (i2 < size) {
            adx adxVar = (adx) skVar.f.get(i2);
            Object obj = adxVar.b;
            if (!(obj instanceof si) ? i != 0 ? (obj instanceof sr) : (obj instanceof sq) : ((si) obj).f == i) {
                sl slVar3 = i == 0 ? saVar2.h.h : saVar2.i.h;
                sl slVar4 = i == 0 ? saVar2.h.i : saVar2.i.i;
                boolean contains = ((st) obj).h.k.contains(slVar3);
                boolean contains2 = ((st) adxVar.b).i.k.contains(slVar4);
                long a2 = ((st) adxVar.b).a();
                if (contains && contains2) {
                    long d = adxVar.d(((st) adxVar.b).h, j);
                    long c = adxVar.c(((st) adxVar.b).i, j);
                    long j3 = d - a2;
                    st stVar2 = (st) adxVar.b;
                    int i3 = stVar2.i.e;
                    if (j3 >= (-i3)) {
                        j3 += i3;
                    }
                    long j4 = stVar2.h.e;
                    long j5 = ((-c) - a2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    rz rzVar = stVar2.d;
                    float f2 = (float) ((i == 0 ? rzVar.ae : rzVar.af) > 0.0f ? (((float) j5) / f) + (((float) j3) / (1.0f - f)) : 0L);
                    a = (j4 + ((((f2 * f) + 0.5f) + a2) + ((f2 * (1.0f - f)) + 0.5f))) - i3;
                } else if (contains) {
                    a = Math.max(adxVar.d(((st) adxVar.b).h, slVar2.e), ((st) adxVar.b).h.e + a2);
                } else if (contains2) {
                    a = Math.max(-adxVar.c(((st) adxVar.b).i, slVar.e), (-((st) adxVar.b).i.e) + a2);
                } else {
                    a = (stVar.h.e + ((st) adxVar.b).a()) - ((st) adxVar.b).i.e;
                }
            } else {
                a = j;
            }
            j2 = Math.max(j2, a);
            i2++;
            skVar = this;
            saVar2 = saVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.h.d();
        this.d.i.d();
        arrayList.add(this.d.h);
        arrayList.add(this.d.i);
        ArrayList arrayList2 = this.d.aI;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            rz rzVar = (rz) arrayList2.get(i);
            if (rzVar instanceof sc) {
                arrayList.add(new so(rzVar));
            } else {
                if (rzVar.H()) {
                    if (rzVar.f == null) {
                        rzVar.f = new si(rzVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(rzVar.f);
                } else {
                    arrayList.add(rzVar.h);
                }
                if (rzVar.I()) {
                    if (rzVar.g == null) {
                        rzVar.g = new si(rzVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(rzVar.g);
                } else {
                    arrayList.add(rzVar.i);
                }
                if (rzVar instanceof sd) {
                    arrayList.add(new sp(rzVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((st) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            st stVar = (st) arrayList.get(i3);
            if (stVar.d != this.d) {
                stVar.b();
            }
        }
        this.f.clear();
        adx.c = 0;
        e(this.a.h, 0, this.f);
        e(this.a.i, 1, this.f);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        sm smVar;
        ArrayList arrayList = this.a.aI;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            rz rzVar = (rz) arrayList.get(i3);
            if (!rzVar.e) {
                int[] iArr = rzVar.aq;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = rzVar.s;
                int i7 = rzVar.t;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 == 3) {
                    z = i6 == 1;
                    i = 3;
                } else {
                    i = i4;
                    z = false;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 == 3) {
                    z2 = i7 == 1;
                    i2 = 3;
                } else {
                    i2 = i5;
                    z2 = false;
                }
                sm smVar2 = rzVar.h.e;
                boolean z3 = smVar2.i;
                sm smVar3 = rzVar.i.e;
                boolean z4 = smVar3.i;
                if (z3 && z4) {
                    f(rzVar, 1, smVar2.f, 1, smVar3.f);
                    rzVar.e = true;
                } else if (z3 && z2) {
                    f(rzVar, 1, smVar2.f, 2, smVar3.f);
                    if (i2 == 3) {
                        rzVar.i.e.m = rzVar.h();
                    } else {
                        rzVar.i.e.c(rzVar.h());
                        rzVar.e = true;
                    }
                } else if (z4 && z) {
                    f(rzVar, 2, smVar2.f, 1, smVar3.f);
                    if (i == 3) {
                        rzVar.h.e.m = rzVar.j();
                    } else {
                        rzVar.h.e.c(rzVar.j());
                        rzVar.e = true;
                    }
                }
                if (rzVar.e && (smVar = rzVar.i.b) != null) {
                    smVar.c(rzVar.ab);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.sa r18) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk.d(sa):void");
    }
}
