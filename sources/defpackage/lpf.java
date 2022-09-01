package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* renamed from: lpf  reason: default package */
/* loaded from: classes.dex */
abstract class lpf implements Iterator, j$.util.Iterator {
    int a;
    int b = -1;
    lpl c;
    AtomicReferenceArray d;
    lpg e;
    lqb f;
    lqb g;
    final /* synthetic */ lqc h;

    public lpf(lqc lqcVar) {
        this.h = lqcVar;
        this.a = lqcVar.d.length - 1;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lqb a() {
        lqb lqbVar = this.f;
        if (lqbVar == null) {
            throw new NoSuchElementException();
        }
        this.g = lqbVar;
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
                lpl[] lplVarArr = this.h.d;
                this.a = i - 1;
                lpl lplVar = lplVarArr[i];
                this.c = lplVar;
                if (lplVar.b != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.c.e;
                    this.d = atomicReferenceArray;
                    this.b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }
    }

    final boolean c(lpg lpgVar) {
        try {
            Object c = lpgVar.c();
            Object d = lpgVar.c() == null ? null : lpgVar.d();
            if (d == null) {
                this.c.i();
                return false;
            }
            this.f = new lqb(this.h, c, d);
            this.c.i();
            return true;
        } catch (Throwable th) {
            this.c.i();
            throw th;
        }
    }

    final boolean d() {
        lpg lpgVar = this.e;
        if (lpgVar != null) {
            while (true) {
                this.e = lpgVar.b();
                lpg lpgVar2 = this.e;
                if (lpgVar2 == null) {
                    return false;
                }
                if (c(lpgVar2)) {
                    return true;
                }
                lpgVar = this.e;
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
                lpg lpgVar = (lpg) atomicReferenceArray.get(i);
                this.e = lpgVar;
                if (lpgVar != null && (c(lpgVar) || d())) {
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
        jez.V(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
