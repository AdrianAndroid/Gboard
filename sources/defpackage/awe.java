package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: awe  reason: default package */
/* loaded from: classes.dex */
public final class awe extends WeakReference {
    final auw a;
    final boolean b;
    axh c = null;

    public awe(auw auwVar, axb axbVar, ReferenceQueue referenceQueue) {
        super(axbVar, referenceQueue);
        ce.m(auwVar);
        this.a = auwVar;
        this.b = axbVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        clear();
    }
}
