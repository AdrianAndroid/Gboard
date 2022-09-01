package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: lqa  reason: default package */
/* loaded from: classes.dex */
final class lqa extends WeakReference implements lpz {
    final lpg a;

    public lqa(ReferenceQueue referenceQueue, Object obj, lpg lpgVar) {
        super(obj, referenceQueue);
        this.a = lpgVar;
    }

    @Override // defpackage.lpz
    public final lpg a() {
        return this.a;
    }

    @Override // defpackage.lpz
    public final lpz b(ReferenceQueue referenceQueue, lpg lpgVar) {
        return new lqa(referenceQueue, get(), lpgVar);
    }
}
