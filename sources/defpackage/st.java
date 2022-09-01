package defpackage;

/* compiled from: PG */
/* renamed from: st  reason: default package */
/* loaded from: classes2.dex */
public abstract class st implements sj {
    public int c;
    public rz d;
    protected int j;
    adx l;
    public final sm e = new sm(this);
    public int f = 0;
    public boolean g = false;
    public final sl h = new sl(this);
    public final sl i = new sl(this);
    protected int k = 1;

    public st(rz rzVar) {
        this.d = rzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void j(sl slVar, sl slVar2, int i) {
        slVar.k.add(slVar2);
        slVar.e = i;
        slVar2.j.add(slVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final sl k(ry ryVar) {
        ry ryVar2 = ryVar.e;
        if (ryVar2 == null) {
            return null;
        }
        rz rzVar = ryVar2.d;
        int i = ryVar2.i - 1;
        if (i == 1) {
            return rzVar.h.h;
        }
        if (i == 2) {
            return rzVar.i.h;
        }
        if (i == 3) {
            return rzVar.h.i;
        }
        if (i == 4) {
            return rzVar.i.i;
        }
        if (i == 5) {
            return rzVar.i.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final sl l(ry ryVar, int i) {
        ry ryVar2 = ryVar.e;
        if (ryVar2 == null) {
            return null;
        }
        rz rzVar = ryVar2.d;
        st stVar = i == 0 ? rzVar.h : rzVar.i;
        int i2 = ryVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return stVar.h;
        }
        if (i2 != 3 && i2 != 4) {
            return null;
        }
        return stVar.i;
    }

    public long a() {
        sm smVar = this.e;
        if (smVar.i) {
            return smVar.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.sj
    public void f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i, int i2) {
        if (i2 == 0) {
            rz rzVar = this.d;
            int i3 = rzVar.w;
            int max = Math.max(rzVar.v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            return max == i ? i : max;
        }
        rz rzVar2 = this.d;
        int i4 = rzVar2.z;
        int max2 = Math.max(rzVar2.y, i);
        if (i4 > 0) {
            max2 = Math.min(i4, i);
        }
        return max2 == i ? i : max2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(sl slVar, sl slVar2, int i, sm smVar) {
        slVar.k.add(slVar2);
        slVar.k.add(this.e);
        slVar.g = i;
        slVar.h = smVar;
        slVar2.j.add(slVar);
        smVar.j.add(slVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r9.c == 3) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [sq] */
    /* JADX WARN: Type inference failed for: r8v2, types: [st] */
    /* JADX WARN: Type inference failed for: r8v4, types: [sr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.ry r12, defpackage.ry r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st.m(ry, ry, int):void");
    }
}
