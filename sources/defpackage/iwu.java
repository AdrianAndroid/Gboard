package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* renamed from: iwu  reason: default package */
/* loaded from: classes.dex */
final class iwu extends LruCache {
    public iwu() {
        super(1048576);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        return ((iwv) obj2).c.length + 16;
    }
}
