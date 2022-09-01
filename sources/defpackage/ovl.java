package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ovl  reason: default package */
/* loaded from: classes2.dex */
public final class ovl {
    private static final ovk a = new ovk(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int highestOneBit = Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final ovk a() {
        AtomicReference c2 = c();
        ovk ovkVar = a;
        ovk ovkVar2 = (ovk) c2.getAndSet(ovkVar);
        if (ovkVar2 == ovkVar) {
            return new ovk();
        }
        if (ovkVar2 == null) {
            c2.set(null);
            return new ovk();
        }
        c2.set(ovkVar2.f);
        ovkVar2.f = null;
        ovkVar2.c = 0;
        return ovkVar2;
    }

    public static final void b(ovk ovkVar) {
        oll.e(ovkVar, "segment");
        if (ovkVar.f != null || ovkVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ovkVar.d) {
            return;
        }
        AtomicReference c2 = c();
        ovk ovkVar2 = (ovk) c2.get();
        if (ovkVar2 == a) {
            return;
        }
        int i = ovkVar2 != null ? ovkVar2.c : 0;
        if (i >= 65536) {
            return;
        }
        ovkVar.f = ovkVar2;
        ovkVar.b = 0;
        ovkVar.c = i + 8192;
        while (!c2.compareAndSet(ovkVar2, ovkVar)) {
            if (c2.get() != ovkVar2) {
                ovkVar.f = null;
                return;
            }
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
