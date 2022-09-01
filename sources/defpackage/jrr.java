package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: jrr  reason: default package */
/* loaded from: classes.dex */
public final class jrr {
    public volatile boolean a;

    public static jrr d() {
        return new jrr();
    }

    public final void a() {
        if (Thread.interrupted() || this.a) {
            throw new CancellationException();
        }
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        if (!this.a) {
            return;
        }
        throw new IllegalStateException("Already released");
    }
}
