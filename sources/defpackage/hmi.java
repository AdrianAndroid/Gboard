package defpackage;

import com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme;

/* compiled from: PG */
/* renamed from: hmi  reason: default package */
/* loaded from: classes.dex */
public final class hmi implements AutoCloseable {
    final /* synthetic */ AbstractAsyncIme a;
    private volatile boolean b;

    public hmi(AbstractAsyncIme abstractAsyncIme) {
        this.a = abstractAsyncIme;
    }

    public final synchronized hlp a(hls hlsVar) {
        hlp b;
        AbstractAsyncIme abstractAsyncIme = this.a;
        b = abstractAsyncIme.b(abstractAsyncIme.D, abstractAsyncIme.F, hlsVar);
        this.b = true;
        notifyAll();
        return b;
    }

    public final void b(int i, int i2, int i3, Object obj) {
        hmj hmjVar = this.a.c;
        hmjVar.sendMessage(hmjVar.obtainMessage(i, i2, i3, obj));
    }

    public final synchronized void c() {
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException e) {
                ((ltd) ((ltd) ((ltd) AbstractAsyncIme.b.d()).i(e)).k("com/google/android/libraries/inputmethod/ime/async/AbstractAsyncIme$BackgroundHandlerDelegate", "waitForImeCreation", (char) 148, "AbstractAsyncIme.java")).s();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b = false;
    }
}
