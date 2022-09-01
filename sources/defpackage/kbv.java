package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kbv  reason: default package */
/* loaded from: classes.dex */
public final class kbv {
    final List a = new ArrayList();
    public volatile boolean b;

    public final synchronized void a() {
        if (!this.b) {
            this.b = true;
            synchronized (this.a) {
                for (kbw kbwVar : this.a) {
                    try {
                        kbwVar.a();
                    } catch (RuntimeException unused) {
                    }
                }
                this.a.clear();
            }
        }
    }
}
