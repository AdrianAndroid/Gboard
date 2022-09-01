package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* compiled from: PG */
/* renamed from: lhn  reason: default package */
/* loaded from: classes.dex */
final class lhn extends SoftReference implements lhv {
    final lih a;

    public lhn(ReferenceQueue referenceQueue, Object obj, lih lihVar) {
        super(obj, referenceQueue);
        this.a = lihVar;
    }

    @Override // defpackage.lhv
    public final int a() {
        return 1;
    }

    @Override // defpackage.lhv
    public final lhv b(ReferenceQueue referenceQueue, Object obj, lih lihVar) {
        return new lhn(referenceQueue, obj, lihVar);
    }

    @Override // defpackage.lhv
    public final lih c() {
        return this.a;
    }

    @Override // defpackage.lhv
    public final boolean d() {
        return true;
    }

    @Override // defpackage.lhv
    public final void e() {
    }

    @Override // defpackage.lhv
    public final void f() {
    }
}
