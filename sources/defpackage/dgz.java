package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dgz  reason: default package */
/* loaded from: classes.dex */
public abstract class dgz implements dhb {
    public static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper");
    public ExecutorService g;
    public ExecutorService h;
    public idk i;
    public dha j;
    public boolean k;
    public final odv m = new odv((char[]) null);
    public final AtomicReference l = new AtomicReference();

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(idk idkVar, int i, int i2, boolean z, long j);

    public final void g() {
        if (this.l.get() == null) {
            return;
        }
        this.g.submit(new dgy(this));
    }

    @Override // defpackage.dhb
    public final void h() {
        this.m.h();
    }

    public final boolean i() {
        return this.l.get() != null;
    }
}
