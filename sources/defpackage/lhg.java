package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* renamed from: lhg  reason: default package */
/* loaded from: classes.dex */
abstract class lhg implements Iterator, j$.util.Iterator {
    int a;
    int b = -1;
    lhm c;
    AtomicReferenceArray d;
    lih e;
    lif f;
    lif g;
    final /* synthetic */ lig h;

    public lhg(lig ligVar) {
        this.h = ligVar;
        this.a = ligVar.f.length - 1;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lif a() {
        lif lifVar = this.f;
        if (lifVar == null) {
            throw new NoSuchElementException();
        }
        this.g = lifVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (!d() && !e()) {
            while (true) {
                int i = this.a;
                if (i < 0) {
                    return;
                }
                lhm[] lhmVarArr = this.h.f;
                this.a = i - 1;
                lhm lhmVar = lhmVarArr[i];
                this.c = lhmVar;
                if (lhmVar.b != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.c.f;
                    this.d = atomicReferenceArray;
                    this.b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
        r6.f = new defpackage.lif(r6.h, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
        r6.c.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean c(defpackage.lih r7) {
        /*
            r6 = this;
            lig r0 = r6.h     // Catch: java.lang.Throwable -> L42
            lgh r0 = r0.r     // Catch: java.lang.Throwable -> L42
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r7.j()     // Catch: java.lang.Throwable -> L42
            lig r3 = r6.h     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r7.j()     // Catch: java.lang.Throwable -> L42
            r5 = 0
            if (r4 != 0) goto L16
            goto L29
        L16:
            lhv r4 = r7.d()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L21
            goto L29
        L21:
            boolean r7 = r3.m(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L28
            goto L29
        L28:
            r5 = r4
        L29:
            if (r5 == 0) goto L3b
            lif r7 = new lif     // Catch: java.lang.Throwable -> L42
            lig r0 = r6.h     // Catch: java.lang.Throwable -> L42
            r7.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L42
            r6.f = r7     // Catch: java.lang.Throwable -> L42
            lhm r7 = r6.c
            r7.i()
            r7 = 1
            return r7
        L3b:
            lhm r7 = r6.c
            r7.i()
            r7 = 0
            return r7
        L42:
            r7 = move-exception
            lhm r0 = r6.c
            r0.i()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhg.c(lih):boolean");
    }

    final boolean d() {
        lih lihVar = this.e;
        if (lihVar != null) {
            while (true) {
                this.e = lihVar.e();
                lih lihVar2 = this.e;
                if (lihVar2 == null) {
                    return false;
                }
                if (c(lihVar2)) {
                    return true;
                }
                lihVar = this.e;
            }
        } else {
            return false;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i >= 0) {
                AtomicReferenceArray atomicReferenceArray = this.d;
                this.b = i - 1;
                lih lihVar = (lih) atomicReferenceArray.get(i);
                this.e = lihVar;
                if (lihVar != null && (c(lihVar) || d())) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        jdg.F(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
