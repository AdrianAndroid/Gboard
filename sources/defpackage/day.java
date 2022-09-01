package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* renamed from: day  reason: default package */
/* loaded from: classes.dex */
public final class day extends LruCache {
    private final leq a;
    private final his b;

    public day(int i, leq leqVar, his hisVar) {
        super(i);
        this.a = leqVar;
        this.b = hisVar;
    }

    @Override // android.util.LruCache
    protected final Object create(Object obj) {
        leq leqVar = this.a;
        if (leqVar == null) {
            return null;
        }
        return leqVar.a(obj);
    }

    @Override // android.util.LruCache
    protected final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        his hisVar = this.b;
        if (hisVar != null) {
            hisVar.a(obj, obj2);
        }
    }

    @Override // android.util.LruCache
    protected final int sizeOf(Object obj, Object obj2) {
        return 1;
    }
}
