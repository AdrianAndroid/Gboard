package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: gxe  reason: default package */
/* loaded from: classes.dex */
public class gxe {
    public static final lug a = hin.a;
    public volatile mko b;
    public volatile int c = 0;
    public volatile boolean d = false;

    public final void a() {
        this.c = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        try {
            gyc.b.execute(new fso(this, kcu.S(this.b), 19));
        } catch (CancellationException unused) {
            gyc.b.execute(new gxd(this, 0));
        } catch (ExecutionException e) {
            gyc.b.execute(new fso(this, e, 20));
        }
    }

    public void c(Object obj) {
        throw null;
    }
}
