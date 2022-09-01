package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: nxz  reason: default package */
/* loaded from: classes2.dex */
public final class nxz implements obk {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.obk
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
