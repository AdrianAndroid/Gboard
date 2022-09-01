package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* renamed from: azm  reason: default package */
/* loaded from: classes.dex */
public final class azm {
    private static final Queue a = bgj.i(0);
    private int b;
    private int c;
    private Object d;

    private azm() {
    }

    public static azm b(Object obj) {
        azm azmVar;
        Queue queue = a;
        synchronized (queue) {
            azmVar = (azm) queue.poll();
        }
        if (azmVar == null) {
            azmVar = new azm();
        }
        azmVar.d = obj;
        azmVar.c = 0;
        azmVar.b = 0;
        return azmVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azm) {
            azm azmVar = (azm) obj;
            int i = azmVar.c;
            int i2 = azmVar.b;
            if (this.d.equals(azmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
