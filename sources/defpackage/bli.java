package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bli  reason: default package */
/* loaded from: classes.dex */
public final class bli extends mjy {
    public bli(mko mkoVar) {
        super(mkoVar);
    }

    private final Object a(InterruptedException interruptedException) {
        cancel(true);
        if (isCancelled()) {
            throw interruptedException;
        }
        try {
            return super.get();
        } finally {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.mjx, java.util.concurrent.Future
    public final Object get() {
        try {
            return super.get();
        } catch (InterruptedException e) {
            return a(e);
        }
    }

    @Override // defpackage.lkz
    public final String toString() {
        String mjyVar = super.toString();
        return "CancelOnInterruptFuture[" + mjyVar + "]";
    }

    @Override // defpackage.mjx, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        try {
            return super.get(j, timeUnit);
        } catch (InterruptedException e) {
            return a(e);
        }
    }
}
