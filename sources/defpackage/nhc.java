package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nhc  reason: default package */
/* loaded from: classes2.dex */
public final class nhc implements nho {
    private final ngz a;
    private final boolean b;
    private final ndb c;

    private nhc(ndb ndbVar, ngz ngzVar, byte[] bArr) {
        this.c = ndbVar;
        this.b = ngzVar instanceof nfk;
        this.a = ngzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nhc c(ndb ndbVar, ndb ndbVar2, ngz ngzVar) {
        return new nhc(ndbVar, ngzVar, null);
    }

    @Override // defpackage.nho
    public final int a(Object obj) {
        nia z = ndb.z(obj);
        int i = z.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < z.b; i2++) {
                int i3 = z.c[i2];
                int ab = Cnew.ab(1);
                i += ab + ab + Cnew.ac(2, nim.a(i3)) + Cnew.H(3, (nem) z.d[i2]);
            }
            z.e = i;
        }
        if (this.b) {
            nfd N = ndb.N(obj);
            int i4 = 0;
            for (int i5 = 0; i5 < N.b.a(); i5++) {
                i4 += N.b(N.b.f(i5));
            }
            for (Map.Entry entry : N.b.c()) {
                i4 += N.b(entry);
            }
            return i + i4;
        }
        return i;
    }

    @Override // defpackage.nho
    public final int b(Object obj) {
        int hashCode = ndb.z(obj).hashCode();
        return this.b ? (hashCode * 53) + ndb.N(obj).hashCode() : hashCode;
    }

    @Override // defpackage.nho
    public final Object e() {
        return this.a.fj().cA();
    }

    @Override // defpackage.nho
    public final void f(Object obj) {
        ndb.C(obj);
        ndb.Q(obj);
    }

    @Override // defpackage.nho
    public final void g(Object obj, Object obj2) {
        nhp.D(obj, obj2);
        if (this.b) {
            nhp.B(obj, obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ngz, java.lang.Object] */
    @Override // defpackage.nho
    public final void h(Object obj, nhk nhkVar, nfb nfbVar) {
        boolean U;
        ndb ndbVar = this.c;
        Object B = ndb.B(obj);
        nfd O = ndb.O(obj);
        while (nhkVar.c() != Integer.MAX_VALUE) {
            try {
                int d = nhkVar.d();
                if (d != nim.a) {
                    if (nim.b(d) == 2) {
                        ngt c = nfbVar.c(this.a, nim.a(d));
                        if (c != null) {
                            ndb.P(nhkVar, c, nfbVar, O);
                        } else {
                            U = ndbVar.w(B, nhkVar);
                        }
                    } else {
                        U = nhkVar.U();
                    }
                    if (!U) {
                        break;
                    }
                } else {
                    ngt ngtVar = null;
                    nem nemVar = null;
                    int i = 0;
                    while (nhkVar.c() != Integer.MAX_VALUE) {
                        int d2 = nhkVar.d();
                        if (d2 == nim.c) {
                            i = nhkVar.j();
                            ngtVar = nfbVar.c(this.a, i);
                        } else if (d2 == nim.d) {
                            if (ngtVar != null) {
                                ndb.P(nhkVar, ngtVar, nfbVar, O);
                            } else {
                                nemVar = nhkVar.q();
                            }
                        } else if (!nhkVar.U()) {
                            break;
                        }
                    }
                    if (nhkVar.d() != nim.b) {
                        throw ngd.b();
                    }
                    if (nemVar == null) {
                        continue;
                    } else if (ngtVar != null) {
                        ngz cA = ngtVar.a.fj().cA();
                        ByteBuffer wrap = ByteBuffer.wrap(nemVar.D());
                        if (wrap.hasArray()) {
                            nea neaVar = new nea(wrap);
                            nhh.a.b(cA).h(cA, neaVar, nfbVar);
                            O.l((nfl) ngtVar.c, cA);
                            if (neaVar.c() != Integer.MAX_VALUE) {
                                throw ngd.b();
                            }
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    } else {
                        ndb.x(B, i, nemVar);
                    }
                }
            } finally {
                ndb.A(obj, (nia) B);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[EDGE_INSN: B:24:0x00bb->B:25:0x00bb ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.nho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.ndz r15) {
        /*
            r10 = this;
            r0 = r11
            nfm r0 = (defpackage.nfm) r0
            nia r1 = r0.cQ
            nia r2 = defpackage.nia.a
            if (r1 != r2) goto Lf
            nia r1 = defpackage.nia.b()
            r0.cQ = r1
        Lf:
            nfk r11 = (defpackage.nfk) r11
            nfd r11 = r11.c()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc7
            int r4 = defpackage.ndb.n(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.nim.a
            r5 = 2
            if (r13 == r3) goto L62
            int r3 = defpackage.nim.b(r13)
            if (r3 != r5) goto L5d
            nfb r2 = r15.d
            ngz r3 = r10.a
            int r5 = defpackage.nim.a(r13)
            ngt r8 = r2.c(r3, r5)
            if (r8 == 0) goto L52
            nhh r13 = defpackage.nhh.a
            java.lang.Object r2 = r8.a
            java.lang.Class r2 = r2.getClass()
            nho r13 = r13.a(r2)
            int r13 = defpackage.ndb.h(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r8.c
            java.lang.Object r3 = r15.c
            nfl r2 = (defpackage.nfl) r2
            r11.l(r2, r3)
            goto L5b
        L52:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.ndb.m(r2, r3, r4, r5, r6, r7)
        L5b:
            r2 = r8
            goto L17
        L5d:
            int r13 = defpackage.ndb.r(r13, r12, r4, r14, r15)
            goto L17
        L62:
            r13 = 0
            r3 = r0
        L64:
            if (r4 >= r14) goto Lbb
            int r4 = defpackage.ndb.n(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.nim.b(r6)
            int r8 = defpackage.nim.a(r6)
            if (r8 == r5) goto La1
            r9 = 3
            if (r8 == r9) goto L7a
            goto Lb2
        L7a:
            if (r2 == 0) goto L96
            nhh r6 = defpackage.nhh.a
            java.lang.Object r7 = r2.a
            java.lang.Class r7 = r7.getClass()
            nho r6 = r6.a(r7)
            int r4 = defpackage.ndb.h(r6, r12, r4, r14, r15)
            java.lang.Object r6 = r2.c
            java.lang.Object r7 = r15.c
            nfl r6 = (defpackage.nfl) r6
            r11.l(r6, r7)
            goto L64
        L96:
            if (r7 != r5) goto Lb2
            int r4 = defpackage.ndb.e(r12, r4, r15)
            java.lang.Object r3 = r15.c
            nem r3 = (defpackage.nem) r3
            goto L64
        La1:
            if (r7 != 0) goto Lb2
            int r4 = defpackage.ndb.n(r12, r4, r15)
            int r13 = r15.a
            nfb r2 = r15.d
            ngz r6 = r10.a
            ngt r2 = r2.c(r6, r13)
            goto L64
        Lb2:
            int r7 = defpackage.nim.b
            if (r6 == r7) goto Lbb
            int r4 = defpackage.ndb.r(r6, r12, r4, r14, r15)
            goto L64
        Lbb:
            if (r3 == 0) goto Lc4
            int r13 = defpackage.nim.c(r13, r5)
            r1.d(r13, r3)
        Lc4:
            r13 = r4
            goto L17
        Lc7:
            if (r13 != r14) goto Lca
            return
        Lca:
            ngd r11 = defpackage.ngd.g()
            goto Ld0
        Lcf:
            throw r11
        Ld0:
            goto Lcf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhc.i(java.lang.Object, byte[], int, int, ndz):void");
    }

    @Override // defpackage.nho
    public final boolean j(Object obj, Object obj2) {
        if (!ndb.z(obj).equals(ndb.z(obj2))) {
            return false;
        }
        if (!this.b) {
            return true;
        }
        return ndb.N(obj).equals(ndb.N(obj2));
    }

    @Override // defpackage.nho
    public final boolean k(Object obj) {
        return ndb.N(obj).i();
    }

    @Override // defpackage.nho
    public final void l(Object obj, mlu mluVar) {
        Iterator d = ndb.N(obj).d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            nfl nflVar = (nfl) entry.getKey();
            if (nflVar.a() == nil.MESSAGE) {
                if (!(entry instanceof ngg)) {
                    mluVar.q(nflVar.a, entry.getValue());
                } else {
                    mluVar.q(nflVar.a, ((ngi) ((ngg) entry).a.getValue()).a());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        nia z = ndb.z(obj);
        for (int i = 0; i < z.b; i++) {
            mluVar.q(nim.a(z.c[i]), z.d[i]);
        }
    }
}
