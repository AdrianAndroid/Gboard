package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* renamed from: ges  reason: default package */
/* loaded from: classes.dex */
public final class ges implements get {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.geh
    public final void c() {
        this.a.countDown();
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.gel
    public final void e(Object obj) {
        this.a.countDown();
    }
}
