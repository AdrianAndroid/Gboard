package defpackage;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: mig  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mig {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
