package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lhz  reason: default package */
/* loaded from: classes.dex */
public class lhz extends WeakReference implements lih {
    final int g;
    final lih h;
    volatile lhv i = lig.b;

    public lhz(ReferenceQueue referenceQueue, Object obj, int i, lih lihVar) {
        super(obj, referenceQueue);
        this.g = i;
        this.h = lihVar;
    }

    @Override // defpackage.lih
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lih
    public final lhv d() {
        return this.i;
    }

    @Override // defpackage.lih
    public final lih e() {
        return this.h;
    }

    public lih f() {
        throw new UnsupportedOperationException();
    }

    public lih g() {
        throw new UnsupportedOperationException();
    }

    public lih h() {
        throw new UnsupportedOperationException();
    }

    public lih i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lih
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(lih lihVar) {
        throw new UnsupportedOperationException();
    }

    public void m(lih lihVar) {
        throw new UnsupportedOperationException();
    }

    public void n(lih lihVar) {
        throw new UnsupportedOperationException();
    }

    public void o(lih lihVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lih
    public final void p(lhv lhvVar) {
        this.i = lhvVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
