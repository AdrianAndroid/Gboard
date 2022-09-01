package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: miw  reason: default package */
/* loaded from: classes.dex */
abstract class miw extends mif {
    private static final Logger a = Logger.getLogger(miw.class.getName());
    public static final mit b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        mit mivVar;
        try {
            mivVar = new miu(AtomicReferenceFieldUpdater.newUpdater(miw.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(miw.class, "remaining"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            mivVar = new miv();
        }
        Throwable th = e;
        b = mivVar;
        if (th != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public miw(int i) {
        this.remaining = i;
    }

    public abstract void e(Set set);
}
