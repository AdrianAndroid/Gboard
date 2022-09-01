package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mhu  reason: default package */
/* loaded from: classes.dex */
public abstract class mhu extends mju implements Runnable {
    mko a;
    Class b;
    Object c;

    public mhu(mko mkoVar, Class cls, Object obj) {
        jdg.u(mkoVar);
        this.a = mkoVar;
        this.b = cls;
        jdg.u(obj);
        this.c = obj;
    }

    public static mko g(mko mkoVar, Class cls, leq leqVar, Executor executor) {
        mht mhtVar = new mht(mkoVar, cls, leqVar);
        mkoVar.d(mhtVar, kcu.F(executor, mhtVar));
        return mhtVar;
    }

    public static mko h(mko mkoVar, Class cls, miy miyVar, Executor executor) {
        mhs mhsVar = new mhs(mkoVar, cls, miyVar);
        mkoVar.d(mhsVar, kcu.F(executor, mhsVar));
        return mhsVar;
    }

    @Override // defpackage.mik
    protected final void a() {
        m(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        String str;
        mko mkoVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String b = super.b();
        if (mkoVar != null) {
            str = "inputFuture=[" + mkoVar + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (b == null) {
                return null;
            }
            return str.concat(b);
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public abstract Object e(Object obj, Throwable th);

    public abstract void f(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            mko r0 = r8.a
            java.lang.Class r1 = r8.b
            java.lang.Object r2 = r8.c
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto L9c
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L22
            goto L9c
        L22:
            r3 = 0
            r8.a = r3
            boolean r4 = r0 instanceof defpackage.mlm     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            if (r4 == 0) goto L31
            r4 = r0
            mlm r4 = (defpackage.mlm) r4     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            java.lang.Throwable r4 = r4.j()     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = defpackage.kcu.S(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L6f
        L39:
            r4 = move-exception
            goto L3c
        L3b:
            r4 = move-exception
        L3c:
            r5 = r3
            goto L6f
        L3e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6d
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6d:
            r4 = r5
            goto L3c
        L6f:
            if (r4 != 0) goto L75
            r8.c(r5)
            return
        L75:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L99
            java.lang.Object r0 = r8.e(r2, r4)     // Catch: java.lang.Throwable -> L87
            r8.b = r3
            r8.c = r3
            r8.f(r0)
            return
        L87:
            r0 = move-exception
            defpackage.kcu.A(r0)     // Catch: java.lang.Throwable -> L93
            r8.n(r0)     // Catch: java.lang.Throwable -> L93
            r8.b = r3
            r8.c = r3
            return
        L93:
            r0 = move-exception
            r8.b = r3
            r8.c = r3
            throw r0
        L99:
            r8.p(r0)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhu.run():void");
    }
}
