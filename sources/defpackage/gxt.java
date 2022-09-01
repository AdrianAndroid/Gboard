package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: gxt  reason: default package */
/* loaded from: classes.dex */
public abstract class gxt implements Runnable {
    private final Handler a;
    private Object b;
    private boolean c;

    public gxt(Handler handler) {
        this.a = handler;
    }

    public final synchronized Object a() {
        this.c = false;
        if (this.a.post(this)) {
            while (!this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            return this.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void b(Object obj) {
        this.b = obj;
        this.c = true;
        notify();
    }
}
