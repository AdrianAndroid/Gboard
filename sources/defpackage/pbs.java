package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbs  reason: default package */
/* loaded from: classes2.dex */
public class pbs {
    public static /* synthetic */ void a(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
        }
    }

    public static /* synthetic */ boolean b(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
