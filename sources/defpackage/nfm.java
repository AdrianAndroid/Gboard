package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nfm  reason: default package */
/* loaded from: classes2.dex */
public abstract class nfm extends ndu {
    public static final Map cP = new ConcurrentHashMap();
    public nia cQ = nia.a;
    public int cR = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nfm A(nfm nfmVar, ner nerVar, nfb nfbVar) {
        nfm nfmVar2 = (nfm) nfmVar.N(4);
        try {
            nho b = nhh.a.b(nfmVar2);
            b.h(nfmVar2, nes.p(nerVar), nfbVar);
            b.f(nfmVar2);
            return nfmVar2;
        } catch (IOException e) {
            if (e.getCause() instanceof ngd) {
                throw ((ngd) e.getCause());
            }
            throw new ngd(e);
        } catch (nhz e2) {
            throw e2.a();
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ngd) {
                throw ((ngd) e3.getCause());
            }
            throw e3;
        } catch (ngd e4) {
            if (!e4.a) {
                throw e4;
            }
            throw new ngd(e4);
        }
    }

    public static nfm B(nfm nfmVar, byte[] bArr, int i, int i2, nfb nfbVar) {
        nfm nfmVar2 = (nfm) nfmVar.N(4);
        try {
            nho b = nhh.a.b(nfmVar2);
            b.i(nfmVar2, bArr, i, i + i2, new ndz(nfbVar));
            b.f(nfmVar2);
            if (nfmVar2.cO == 0) {
                return nfmVar2;
            }
            throw new RuntimeException();
        } catch (IndexOutOfBoundsException unused) {
            throw ngd.i();
        } catch (ngd e) {
            if (!e.a) {
                throw e;
            }
            throw new ngd(e);
        } catch (IOException e2) {
            if (e2.getCause() instanceof ngd) {
                throw ((ngd) e2.getCause());
            }
            throw new ngd(e2);
        } catch (nhz e3) {
            throw e3.a();
        }
    }

    public static nfs C() {
        return nfn.b;
    }

    public static nfs D(nfs nfsVar) {
        int size = nfsVar.size();
        return nfsVar.f(size == 0 ? 10 : size + size);
    }

    public static nfv E() {
        return ngp.b;
    }

    public static nfv F(nfv nfvVar) {
        int size = nfvVar.size();
        return nfvVar.d(size == 0 ? 10 : size + size);
    }

    public static nga G() {
        return nhi.b;
    }

    public static nga H(nga ngaVar) {
        int size = ngaVar.size();
        return ngaVar.e(size == 0 ? 10 : size + size);
    }

    public static Object J(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object K(ngz ngzVar, String str, Object[] objArr) {
        return new nhj(ngzVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void L(Class cls, nfm nfmVar) {
        cP.put(cls, nfmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean M(nfm nfmVar, boolean z) {
        byte byteValue = ((Byte) nfmVar.N(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = nhh.a.b(nfmVar).k(nfmVar);
        if (z) {
            nfmVar.a(2, true != k ? null : nfmVar);
        }
        return k;
    }

    public static void O(nfm nfmVar) {
        if (nfmVar == null || nfmVar.cE()) {
            return;
        }
        throw r().a();
    }

    public static ngt P(ngz ngzVar, Object obj, ngz ngzVar2, int i, nik nikVar) {
        return new ngt(ngzVar, obj, ngzVar2, new nfl(i, nikVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
        if (r3 >= 64) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0035, code lost:
        r4 = r7.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0039, code lost:
        if (r4 == (-1)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x003d, code lost:
        if ((r4 & 128) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003f, code lost:
        r3 = r3 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a9, code lost:
        throw defpackage.ngd.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ae, code lost:
        throw defpackage.ngd.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nfm v(defpackage.nfm r6, java.io.InputStream r7) {
        /*
            nfb r0 = defpackage.nfb.a()
            int r1 = r7.read()     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            r2 = -1
            if (r1 != r2) goto Ld
            r6 = 0
            goto L66
        Ld:
            int r3 = defpackage.ner.e     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            r3 = r1 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L14
            goto L42
        L14:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r3 = 7
        L17:
            r4 = 32
            if (r3 >= r4) goto L31
            int r4 = r7.read()     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            if (r4 == r2) goto L2c
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r5 = r5 << r3
            r1 = r1 | r5
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L42
            int r3 = r3 + 7
            goto L17
        L2c:
            ngd r6 = defpackage.ngd.i()     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            throw r6     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
        L31:
            r4 = 64
            if (r3 >= r4) goto Laa
            int r4 = r7.read()     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            if (r4 == r2) goto La5
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L42
            int r3 = r3 + 7
            goto L31
        L42:
            nds r2 = new nds
            r2.<init>(r7, r1)
            ner r7 = defpackage.ner.H(r2)
            r1 = 4
            java.lang.Object r6 = r6.N(r1)
            nfm r6 = (defpackage.nfm) r6
            nhh r1 = defpackage.nhh.a     // Catch: java.lang.RuntimeException -> L6c java.io.IOException -> L7d defpackage.nhz -> L93 defpackage.ngd -> L99
            nho r1 = r1.b(r6)     // Catch: java.lang.RuntimeException -> L6c java.io.IOException -> L7d defpackage.nhz -> L93 defpackage.ngd -> L99
            nes r2 = defpackage.nes.p(r7)     // Catch: java.lang.RuntimeException -> L6c java.io.IOException -> L7d defpackage.nhz -> L93 defpackage.ngd -> L99
            r1.h(r6, r2, r0)     // Catch: java.lang.RuntimeException -> L6c java.io.IOException -> L7d defpackage.nhz -> L93 defpackage.ngd -> L99
            r1.f(r6)     // Catch: java.lang.RuntimeException -> L6c java.io.IOException -> L7d defpackage.nhz -> L93 defpackage.ngd -> L99
            r0 = 0
            r7.z(r0)     // Catch: defpackage.ngd -> L6a
        L66:
            O(r6)
            return r6
        L6a:
            r6 = move-exception
            throw r6
        L6c:
            r6 = move-exception
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof defpackage.ngd
            if (r7 == 0) goto L7c
            java.lang.Throwable r6 = r6.getCause()
            ngd r6 = (defpackage.ngd) r6
            throw r6
        L7c:
            throw r6
        L7d:
            r6 = move-exception
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof defpackage.ngd
            if (r7 == 0) goto L8d
            java.lang.Throwable r6 = r6.getCause()
            ngd r6 = (defpackage.ngd) r6
            throw r6
        L8d:
            ngd r7 = new ngd
            r7.<init>(r6)
            throw r7
        L93:
            r6 = move-exception
            ngd r6 = r6.a()
            throw r6
        L99:
            r6 = move-exception
            boolean r7 = r6.a
            if (r7 == 0) goto La4
            ngd r7 = new ngd
            r7.<init>(r6)
            throw r7
        La4:
            throw r6
        La5:
            ngd r6 = defpackage.ngd.i()     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            throw r6     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
        Laa:
            ngd r6 = defpackage.ngd.e()     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
            throw r6     // Catch: java.io.IOException -> Laf defpackage.ngd -> Lb6
        Laf:
            r6 = move-exception
            ngd r7 = new ngd
            r7.<init>(r6)
            throw r7
        Lb6:
            r6 = move-exception
            boolean r7 = r6.a
            if (r7 == 0) goto Lc1
            ngd r7 = new ngd
            r7.<init>(r6)
            throw r7
        Lc1:
            goto Lc3
        Lc2:
            throw r6
        Lc3:
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfm.v(nfm, java.io.InputStream):nfm");
    }

    public static nfm w(nfm nfmVar, byte[] bArr) {
        nfm B = B(nfmVar, bArr, 0, bArr.length, nfb.a());
        O(B);
        return B;
    }

    public static nfm x(nfm nfmVar, InputStream inputStream, nfb nfbVar) {
        ner H = ner.H(inputStream);
        nfm nfmVar2 = (nfm) nfmVar.N(4);
        try {
            nho b = nhh.a.b(nfmVar2);
            b.h(nfmVar2, nes.p(H), nfbVar);
            b.f(nfmVar2);
            O(nfmVar2);
            return nfmVar2;
        } catch (ngd e) {
            if (!e.a) {
                throw e;
            }
            throw new ngd(e);
        } catch (IOException e2) {
            if (e2.getCause() instanceof ngd) {
                throw ((ngd) e2.getCause());
            }
            throw new ngd(e2);
        } catch (nhz e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ngd) {
                throw ((ngd) e4.getCause());
            }
            throw e4;
        }
    }

    public static nfm y(nfm nfmVar, ByteBuffer byteBuffer, nfb nfbVar) {
        ner K;
        int i = ner.e;
        if (byteBuffer.hasArray()) {
            K = ner.K(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else if (!byteBuffer.isDirect() || !nih.a) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            K = ner.K(bArr, 0, remaining);
        } else {
            K = new neq(byteBuffer);
        }
        nfm nfmVar2 = (nfm) nfmVar.N(4);
        try {
            nho b = nhh.a.b(nfmVar2);
            b.h(nfmVar2, nes.p(K), nfbVar);
            b.f(nfmVar2);
            O(nfmVar2);
            O(nfmVar2);
            return nfmVar2;
        } catch (ngd e) {
            if (!e.a) {
                throw e;
            }
            throw new ngd(e);
        } catch (IOException e2) {
            if (e2.getCause() instanceof ngd) {
                throw ((ngd) e2.getCause());
            }
            throw new ngd(e2);
        } catch (nhz e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ngd) {
                throw ((ngd) e4.getCause());
            }
            throw e4;
        }
    }

    public static nfm z(nfm nfmVar, byte[] bArr, nfb nfbVar) {
        nfm B = B(nfmVar, bArr, 0, bArr.length, nfbVar);
        O(B);
        return B;
    }

    @Override // defpackage.ngz
    public final nhf I() {
        return (nhf) N(7);
    }

    public final Object N(int i) {
        return a(i, null);
    }

    protected abstract Object a(int i, Object obj);

    @Override // defpackage.nha
    public final /* synthetic */ ngz cB() {
        return (nfm) N(6);
    }

    @Override // defpackage.nha
    public final boolean cE() {
        return M(this, Boolean.TRUE.booleanValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return nhh.a.b(this).j(this, (nfm) obj);
    }

    @Override // defpackage.ngz
    public final /* synthetic */ ngy fj() {
        return (nfh) N(5);
    }

    @Override // defpackage.ngz
    public final /* synthetic */ ngy fk() {
        nfh nfhVar = (nfh) N(5);
        nfhVar.cG(this);
        return nfhVar;
    }

    public final int hashCode() {
        int i = this.cO;
        if (i != 0) {
            return i;
        }
        int b = nhh.a.b(this).b(this);
        this.cO = b;
        return b;
    }

    @Override // defpackage.ngz
    public final void ii(Cnew cnew) {
        nho b = nhh.a.b(this);
        mlu mluVar = cnew.f;
        if (mluVar == null) {
            mluVar = new mlu(cnew);
        }
        b.l(this, mluVar);
    }

    @Override // defpackage.ndu
    public final int m() {
        return this.cR;
    }

    @Override // defpackage.ndu
    public final void o(int i) {
        this.cR = i;
    }

    @Override // defpackage.ngz
    public final int s() {
        int i = this.cR;
        if (i == -1) {
            int a = nhh.a.b(this).a(this);
            this.cR = a;
            return a;
        }
        return i;
    }

    public final nfh t() {
        return (nfh) N(5);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ndb.G(this, sb, 0);
        return sb.toString();
    }

    public final nfh u(nfm nfmVar) {
        nfh t = t();
        t.cG(nfmVar);
        return t;
    }
}
