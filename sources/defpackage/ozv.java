package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ozv  reason: default package */
/* loaded from: classes2.dex */
public final class ozv {
    public static final ozv a = new ozv();
    private final AtomicReference b = new AtomicReference();

    public final void a() {
        if (this.b.get() == null) {
            AtomicReference atomicReference = this.b;
            ozw ozwVar = ozw.a;
            while (!atomicReference.compareAndSet(null, ozwVar) && atomicReference.get() == null) {
            }
        }
        ozw ozwVar2 = (ozw) this.b.get();
    }
}
