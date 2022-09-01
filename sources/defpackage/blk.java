package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: blk  reason: default package */
/* loaded from: classes.dex */
final class blk extends WeakReference {
    public blk(Object obj) {
        super(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && get() == ((blk) obj).get();
    }

    public final int hashCode() {
        return System.identityHashCode(get());
    }
}
