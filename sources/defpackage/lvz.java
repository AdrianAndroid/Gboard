package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lvz  reason: default package */
/* loaded from: classes.dex */
public final class lvz extends lwm {
    public static final lvz a = new lvz(lwo.a);
    public final AtomicReference b;

    public lvz(lwm lwmVar) {
        this.b = new AtomicReference(lwmVar);
    }

    @Override // defpackage.lwm
    public final lur a() {
        return ((lwm) this.b.get()).a();
    }

    @Override // defpackage.lwm
    public final lwt b() {
        return ((lwm) this.b.get()).b();
    }

    @Override // defpackage.lwm
    public final void c(String str, Level level, boolean z) {
        ((lwm) this.b.get()).c(str, level, z);
    }
}
