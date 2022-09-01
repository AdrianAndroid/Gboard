package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: mjt  reason: default package */
/* loaded from: classes.dex */
public final class mjt extends AtomicReference implements Executor, Runnable {
    Executor a;
    Runnable b;
    Thread c;
    ndi d;

    public mjt(Executor executor, ndi ndiVar, byte[] bArr) {
        super(mjs.NOT_RUN);
        this.a = executor;
        this.d = ndiVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == mjs.CANCELLED) {
            this.a = null;
            this.d = null;
            return;
        }
        this.c = Thread.currentThread();
        try {
            Object obj = ((ndi) Objects.requireNonNull(this.d)).b;
            if (((nzv) obj).b == this.c) {
                this.d = null;
                jdg.F(((nzv) obj).c == null);
                ((nzv) obj).c = runnable;
                ((nzv) obj).a = (Executor) Objects.requireNonNull(this.a);
                this.a = null;
            } else {
                this.a = null;
                this.b = runnable;
                ((Executor) Objects.requireNonNull(this.a)).execute(this);
            }
        } finally {
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.c) {
            this.b = null;
            ((Runnable) Objects.requireNonNull(this.b)).run();
            return;
        }
        nzv nzvVar = new nzv((byte[]) null, (byte[]) null);
        nzvVar.b = currentThread;
        ((ndi) Objects.requireNonNull(this.d)).b = nzvVar;
        this.d = null;
        try {
            this.b = null;
            ((Runnable) Objects.requireNonNull(this.b)).run();
            while (true) {
                ?? r0 = nzvVar.c;
                if (r0 == 0 || (r3 = nzvVar.a) == 0) {
                    break;
                }
                nzvVar.c = null;
                nzvVar.a = null;
                r3.execute(r0);
            }
        } finally {
            nzvVar.b = null;
        }
    }
}
