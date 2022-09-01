package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: si  reason: default package */
/* loaded from: classes2.dex */
public final class si extends st {
    ArrayList a = new ArrayList();
    private int b;

    public si(rz rzVar, int i) {
        super(rzVar);
        rz rzVar2;
        this.f = i;
        rz rzVar3 = this.d;
        rz n = rzVar3.n(i);
        while (true) {
            rz rzVar4 = n;
            rzVar2 = rzVar3;
            rzVar3 = rzVar4;
            if (rzVar3 == null) {
                break;
            }
            n = rzVar3.n(this.f);
        }
        this.d = rzVar2;
        this.a.add(rzVar2.o(this.f));
        rz m = rzVar2.m(this.f);
        while (m != null) {
            this.a.add(m.o(this.f));
            m = m.m(this.f);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            st stVar = (st) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                stVar.d.f = this;
            } else if (i3 == 1) {
                stVar.d.g = this;
            }
        }
        if (this.f == 0 && ((sa) this.d.U).c && this.a.size() > 1) {
            ArrayList arrayList2 = this.a;
            this.d = ((st) arrayList2.get(arrayList2.size() - 1)).d;
        }
        this.b = this.f == 0 ? this.d.aj : this.d.ak;
    }

    private final rz g() {
        for (int i = 0; i < this.a.size(); i++) {
            rz rzVar = ((st) this.a.get(i)).d;
            if (rzVar.ah != 8) {
                return rzVar;
            }
        }
        return null;
    }

    private final rz n() {
        rz rzVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            rzVar = ((st) this.a.get(size)).d;
        } while (rzVar.ah == 8);
        return rzVar;
    }

    @Override // defpackage.st
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            st stVar = (st) this.a.get(i);
            j = j + stVar.h.e + stVar.a() + stVar.i.e;
        }
        return j;
    }

    @Override // defpackage.st
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((st) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        rz rzVar = ((st) this.a.get(0)).d;
        rz rzVar2 = ((st) this.a.get(size2 - 1)).d;
        if (this.f == 0) {
            ry ryVar = rzVar.J;
            ry ryVar2 = rzVar2.L;
            sl l = l(ryVar, 0);
            int b = ryVar.b();
            rz g = g();
            if (g != null) {
                b = g.J.b();
            }
            if (l != null) {
                j(this.h, l, b);
            }
            sl l2 = l(ryVar2, 0);
            int b2 = ryVar2.b();
            rz n = n();
            if (n != null) {
                b2 = n.L.b();
            }
            if (l2 != null) {
                j(this.i, l2, -b2);
            }
        } else {
            ry ryVar3 = rzVar.K;
            ry ryVar4 = rzVar2.M;
            sl l3 = l(ryVar3, 1);
            int b3 = ryVar3.b();
            rz g2 = g();
            if (g2 != null) {
                b3 = g2.K.b();
            }
            if (l3 != null) {
                j(this.h, l3, b3);
            }
            sl l4 = l(ryVar4, 1);
            int b4 = ryVar4.b();
            rz n2 = n();
            if (n2 != null) {
                b4 = n2.M.b();
            }
            if (l4 != null) {
                j(this.i, l4, -b4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.st
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((st) this.a.get(i)).c();
        }
    }

    @Override // defpackage.st
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((st) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.st
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((st) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x03ce, code lost:
        r10 = r10 - r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    @Override // defpackage.st, defpackage.sj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("<");
            sb.append((st) arrayList.get(i));
            sb.append("> ");
        }
        return sb.toString();
    }
}
