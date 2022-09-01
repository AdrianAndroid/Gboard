package defpackage;

import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: nes  reason: default package */
/* loaded from: classes2.dex */
public final class nes implements nhk {
    private final ner a;
    private int b;
    private int c;
    private int d = 0;

    private nes(ner nerVar) {
        ngb.i(nerVar, "input");
        this.a = nerVar;
        nerVar.d = this;
    }

    private final Object P(nik nikVar, Class cls, nfb nfbVar) {
        nik nikVar2 = nik.DOUBLE;
        switch (nikVar.ordinal()) {
            case 0:
                return Double.valueOf(a());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(l());
            case 3:
                return Long.valueOf(o());
            case 4:
                return Integer.valueOf(g());
            case 5:
                return Long.valueOf(k());
            case 6:
                return Integer.valueOf(f());
            case 7:
                return Boolean.valueOf(T());
            case 8:
                return x();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return t(cls, nfbVar);
            case 11:
                return q();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Integer.valueOf(j());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Integer.valueOf(e());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(h());
            case 15:
                return Long.valueOf(m());
            case 16:
                return Integer.valueOf(i());
            case 17:
                return Long.valueOf(n());
        }
    }

    private final Object V(nho nhoVar, nfb nfbVar) {
        int i = this.c;
        this.c = nim.c(nim.a(this.b), 4);
        try {
            Object e = nhoVar.e();
            nhoVar.h(e, this, nfbVar);
            nhoVar.f(e);
            if (this.b == this.c) {
                return e;
            }
            throw ngd.g();
        } finally {
            this.c = i;
        }
    }

    private final Object W(nho nhoVar, nfb nfbVar) {
        ner nerVar;
        int n = this.a.n();
        ner nerVar2 = this.a;
        if (nerVar2.a >= nerVar2.b) {
            throw new ngd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e = nerVar2.e(n);
        Object e2 = nhoVar.e();
        this.a.a++;
        nhoVar.h(e2, this, nfbVar);
        nhoVar.f(e2);
        this.a.z(0);
        nerVar.a--;
        this.a.A(e);
        return e2;
    }

    private final void X(int i) {
        if (this.a.d() == i) {
            return;
        }
        throw ngd.i();
    }

    private final void Y(int i) {
        if (nim.b(this.b) == i) {
            return;
        }
        throw ngd.a();
    }

    private static final void Z(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw ngd.g();
    }

    private static final void aa(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw ngd.g();
    }

    public static nes p(ner nerVar) {
        nes nesVar = nerVar.d;
        return nesVar != null ? nesVar : new nes(nerVar);
    }

    @Override // defpackage.nhk
    public final void A(List list) {
        int m;
        int m2;
        if (list instanceof nex) {
            nex nexVar = (nex) list;
            int b = nim.b(this.b);
            if (b == 1) {
                do {
                    nexVar.d(this.a.b());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int n = this.a.n();
                aa(n);
                int d = this.a.d() + n;
                do {
                    nexVar.d(this.a.b());
                } while (this.a.d() < d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int n2 = this.a.n();
            aa(n2);
            int d2 = this.a.d() + n2;
            do {
                list.add(Double.valueOf(this.a.b()));
            } while (this.a.d() < d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void B(List list) {
        int m;
        int m2;
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    nfnVar.g(this.a.f());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    nfnVar.g(this.a.f());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.f()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void C(List list) {
        int m;
        int m2;
        if (!(list instanceof nfn)) {
            int b = nim.b(this.b);
            if (b == 2) {
                int n = this.a.n();
                Z(n);
                int d = this.a.d() + n;
                do {
                    list.add(Integer.valueOf(this.a.g()));
                } while (this.a.d() < d);
                return;
            } else if (b != 5) {
                throw ngd.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.g()));
                    if (this.a.C()) {
                        return;
                    }
                    m = this.a.m();
                } while (m == this.b);
                this.d = m;
                return;
            }
        }
        nfn nfnVar = (nfn) list;
        int b2 = nim.b(this.b);
        if (b2 == 2) {
            int n2 = this.a.n();
            Z(n2);
            int d2 = this.a.d() + n2;
            do {
                nfnVar.g(this.a.g());
            } while (this.a.d() < d2);
        } else if (b2 != 5) {
            throw ngd.a();
        } else {
            do {
                nfnVar.g(this.a.g());
                if (this.a.C()) {
                    return;
                }
                m2 = this.a.m();
            } while (m2 == this.b);
            this.d = m2;
        }
    }

    @Override // defpackage.nhk
    public final void D(List list) {
        int m;
        int m2;
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            int b = nim.b(this.b);
            if (b == 1) {
                do {
                    ngpVar.f(this.a.o());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int n = this.a.n();
                aa(n);
                int d = this.a.d() + n;
                do {
                    ngpVar.f(this.a.o());
                } while (this.a.d() < d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(this.a.o()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int n2 = this.a.n();
            aa(n2);
            int d2 = this.a.d() + n2;
            do {
                list.add(Long.valueOf(this.a.o()));
            } while (this.a.d() < d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void E(List list) {
        int m;
        int m2;
        if (!(list instanceof nff)) {
            int b = nim.b(this.b);
            if (b == 2) {
                int n = this.a.n();
                Z(n);
                int d = this.a.d() + n;
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.d() < d);
                return;
            } else if (b != 5) {
                throw ngd.a();
            } else {
                do {
                    list.add(Float.valueOf(this.a.c()));
                    if (this.a.C()) {
                        return;
                    }
                    m = this.a.m();
                } while (m == this.b);
                this.d = m;
                return;
            }
        }
        nff nffVar = (nff) list;
        int b2 = nim.b(this.b);
        if (b2 == 2) {
            int n2 = this.a.n();
            Z(n2);
            int d2 = this.a.d() + n2;
            do {
                nffVar.g(this.a.c());
            } while (this.a.d() < d2);
        } else if (b2 != 5) {
            throw ngd.a();
        } else {
            do {
                nffVar.g(this.a.c());
                if (this.a.C()) {
                    return;
                }
                m2 = this.a.m();
            } while (m2 == this.b);
            this.d = m2;
        }
    }

    @Override // defpackage.nhk
    @Deprecated
    public final void F(List list, nho nhoVar, nfb nfbVar) {
        int m;
        int i = this.b;
        if (nim.b(i) == 3) {
            do {
                list.add(V(nhoVar, nfbVar));
                if (this.a.C() || this.d != 0) {
                    return;
                }
                m = this.a.m();
            } while (m == i);
            this.d = m;
            return;
        }
        throw ngd.a();
    }

    @Override // defpackage.nhk
    public final void G(List list) {
        int m;
        int m2;
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    nfnVar.g(this.a.h());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    nfnVar.g(this.a.h());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.h()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void H(List list) {
        int m;
        int m2;
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    ngpVar.f(this.a.p());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    ngpVar.f(this.a.p());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
        return;
     */
    @Override // defpackage.nhk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.util.Map r8, defpackage.ngt r9, defpackage.nfb r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            ner r1 = r7.a
            int r1 = r1.n()
            ner r2 = r7.a
            int r1 = r2.e(r1)
            java.lang.Object r2 = r9.a
            java.lang.Object r3 = r9.b
        L14:
            int r4 = r7.c()     // Catch: java.lang.Throwable -> L69
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L60
            ner r5 = r7.a     // Catch: java.lang.Throwable -> L69
            boolean r5 = r5.C()     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L26
            goto L60
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3a
            boolean r4 = r7.U()     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            if (r4 == 0) goto L34
            goto L14
        L34:
            ngd r4 = new ngd     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            r4.<init>(r6)     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            throw r4     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
        L3a:
            java.lang.Object r4 = r9.d     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            java.lang.Object r5 = r9.b     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            nik r4 = (defpackage.nik) r4     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            goto L14
        L49:
            java.lang.Object r4 = r9.c     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            nik r4 = (defpackage.nik) r4     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: defpackage.ngc -> L53 java.lang.Throwable -> L69
            goto L14
        L53:
            boolean r4 = r7.U()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L5a
            goto L14
        L5a:
            ngd r8 = new ngd     // Catch: java.lang.Throwable -> L69
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L60:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L69
            ner r8 = r7.a
            r8.A(r1)
            return
        L69:
            r8 = move-exception
            ner r9 = r7.a
            r9.A(r1)
            goto L71
        L70:
            throw r8
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nes.I(java.util.Map, ngt, nfb):void");
    }

    @Override // defpackage.nhk
    public final void J(List list, nho nhoVar, nfb nfbVar) {
        int m;
        int i = this.b;
        if (nim.b(i) == 2) {
            do {
                list.add(W(nhoVar, nfbVar));
                if (this.a.C() || this.d != 0) {
                    return;
                }
                m = this.a.m();
            } while (m == i);
            this.d = m;
            return;
        }
        throw ngd.a();
    }

    @Override // defpackage.nhk
    public final void K(List list) {
        int m;
        int m2;
        if (!(list instanceof nfn)) {
            int b = nim.b(this.b);
            if (b == 2) {
                int n = this.a.n();
                Z(n);
                int d = this.a.d() + n;
                do {
                    list.add(Integer.valueOf(this.a.k()));
                } while (this.a.d() < d);
                return;
            } else if (b != 5) {
                throw ngd.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.k()));
                    if (this.a.C()) {
                        return;
                    }
                    m = this.a.m();
                } while (m == this.b);
                this.d = m;
                return;
            }
        }
        nfn nfnVar = (nfn) list;
        int b2 = nim.b(this.b);
        if (b2 == 2) {
            int n2 = this.a.n();
            Z(n2);
            int d2 = this.a.d() + n2;
            do {
                nfnVar.g(this.a.k());
            } while (this.a.d() < d2);
        } else if (b2 != 5) {
            throw ngd.a();
        } else {
            do {
                nfnVar.g(this.a.k());
                if (this.a.C()) {
                    return;
                }
                m2 = this.a.m();
            } while (m2 == this.b);
            this.d = m2;
        }
    }

    @Override // defpackage.nhk
    public final void L(List list) {
        int m;
        int m2;
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            int b = nim.b(this.b);
            if (b == 1) {
                do {
                    ngpVar.f(this.a.t());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int n = this.a.n();
                aa(n);
                int d = this.a.d() + n;
                do {
                    ngpVar.f(this.a.t());
                } while (this.a.d() < d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(this.a.t()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int n2 = this.a.n();
            aa(n2);
            int d2 = this.a.d() + n2;
            do {
                list.add(Long.valueOf(this.a.t()));
            } while (this.a.d() < d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void M(List list) {
        int m;
        int m2;
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    nfnVar.g(this.a.l());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    nfnVar.g(this.a.l());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.l()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.l()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void N(List list) {
        int m;
        int m2;
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    ngpVar.f(this.a.u());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    ngpVar.f(this.a.u());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.u()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Long.valueOf(this.a.u()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void O(List list) {
        w(list, false);
    }

    @Override // defpackage.nhk
    public final void Q(List list) {
        w(list, true);
    }

    @Override // defpackage.nhk
    public final void R(List list) {
        int m;
        int m2;
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    nfnVar.g(this.a.n());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    nfnVar.g(this.a.n());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void S(List list) {
        int m;
        int m2;
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    ngpVar.f(this.a.v());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    ngpVar.f(this.a.v());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final boolean T() {
        Y(0);
        return this.a.D();
    }

    @Override // defpackage.nhk
    public final boolean U() {
        int i;
        if (this.a.C() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.E(i);
    }

    @Override // defpackage.nhk
    public final double a() {
        Y(1);
        return this.a.b();
    }

    @Override // defpackage.nhk
    public final float b() {
        Y(5);
        return this.a.c();
    }

    @Override // defpackage.nhk
    public final int c() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.m();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return nim.a(i);
    }

    @Override // defpackage.nhk
    public final int d() {
        return this.b;
    }

    @Override // defpackage.nhk
    public final int e() {
        Y(0);
        return this.a.f();
    }

    @Override // defpackage.nhk
    public final int f() {
        Y(5);
        return this.a.g();
    }

    @Override // defpackage.nhk
    public final int g() {
        Y(0);
        return this.a.h();
    }

    @Override // defpackage.nhk
    public final int h() {
        Y(5);
        return this.a.k();
    }

    @Override // defpackage.nhk
    public final int i() {
        Y(0);
        return this.a.l();
    }

    @Override // defpackage.nhk
    public final int j() {
        Y(0);
        return this.a.n();
    }

    @Override // defpackage.nhk
    public final long k() {
        Y(1);
        return this.a.o();
    }

    @Override // defpackage.nhk
    public final long l() {
        Y(0);
        return this.a.p();
    }

    @Override // defpackage.nhk
    public final long m() {
        Y(1);
        return this.a.t();
    }

    @Override // defpackage.nhk
    public final long n() {
        Y(0);
        return this.a.u();
    }

    @Override // defpackage.nhk
    public final long o() {
        Y(0);
        return this.a.v();
    }

    @Override // defpackage.nhk
    public final nem q() {
        Y(2);
        return this.a.w();
    }

    @Override // defpackage.nhk
    @Deprecated
    public final Object r(Class cls, nfb nfbVar) {
        Y(3);
        return V(nhh.a.a(cls), nfbVar);
    }

    @Override // defpackage.nhk
    @Deprecated
    public final Object s(nho nhoVar, nfb nfbVar) {
        Y(3);
        return V(nhoVar, nfbVar);
    }

    @Override // defpackage.nhk
    public final Object t(Class cls, nfb nfbVar) {
        Y(2);
        return W(nhh.a.a(cls), nfbVar);
    }

    @Override // defpackage.nhk
    public final Object u(nho nhoVar, nfb nfbVar) {
        Y(2);
        return W(nhoVar, nfbVar);
    }

    @Override // defpackage.nhk
    public final String v() {
        Y(2);
        return this.a.x();
    }

    public final void w(List list, boolean z) {
        int m;
        int m2;
        if (nim.b(this.b) != 2) {
            throw ngd.a();
        }
        if (!(list instanceof ngl) || z) {
            do {
                list.add(z ? x() : v());
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
            return;
        }
        ngl nglVar = (ngl) list;
        do {
            nglVar.i(q());
            if (this.a.C()) {
                return;
            }
            m2 = this.a.m();
        } while (m2 == this.b);
        this.d = m2;
    }

    @Override // defpackage.nhk
    public final String x() {
        Y(2);
        return this.a.y();
    }

    @Override // defpackage.nhk
    public final void y(List list) {
        int m;
        int m2;
        if (list instanceof ned) {
            ned nedVar = (ned) list;
            int b = nim.b(this.b);
            if (b == 0) {
                do {
                    nedVar.f(this.a.D());
                    if (this.a.C()) {
                        return;
                    }
                    m2 = this.a.m();
                } while (m2 == this.b);
                this.d = m2;
                return;
            } else if (b == 2) {
                int d = this.a.d() + this.a.n();
                do {
                    nedVar.f(this.a.D());
                } while (this.a.d() < d);
                X(d);
                return;
            } else {
                throw ngd.a();
            }
        }
        int b2 = nim.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.D()));
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
        } else if (b2 == 2) {
            int d2 = this.a.d() + this.a.n();
            do {
                list.add(Boolean.valueOf(this.a.D()));
            } while (this.a.d() < d2);
            X(d2);
        } else {
            throw ngd.a();
        }
    }

    @Override // defpackage.nhk
    public final void z(List list) {
        int m;
        if (nim.b(this.b) == 2) {
            do {
                list.add(q());
                if (this.a.C()) {
                    return;
                }
                m = this.a.m();
            } while (m == this.b);
            this.d = m;
            return;
        }
        throw ngd.a();
    }
}
