package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jox  reason: default package */
/* loaded from: classes.dex */
public final class jox implements jpb {
    private final jnp a;
    private final fwe b;
    private final fwo c;
    private final gaa d;
    private final jnw e;
    private final long f;
    private final AtomicLong g = new AtomicLong(0);
    private final jnj h;

    public jox(jnp jnpVar, jns jnsVar, fwe fweVar, fwo fwoVar, gaa gaaVar, jnw jnwVar, jnj jnjVar) {
        this.a = jnpVar;
        jnsVar.c("TrngConditions");
        this.b = fweVar;
        this.c = fwoVar;
        this.d = gaaVar;
        this.e = jnwVar;
        this.h = jnjVar;
        this.f = fweVar.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r4.isInteractive() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
        if (r9.getCurrentThermalStatus() >= r8.c) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Set d(defpackage.joc r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jox.d(joc, boolean, java.lang.String):java.util.Set");
    }

    @Override // defpackage.jpb
    public final Set a(joc jocVar, String str) {
        return d(jocVar, true, str);
    }

    @Override // defpackage.jpb
    public final Set b(joc jocVar, String str) {
        return d(jocVar, false, str);
    }

    @Override // defpackage.jpb
    public final void c(Set set, String str) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jpa jpaVar = jpa.BATTERY_NOT_OK;
            int ordinal = ((jpa) it.next()).ordinal();
            if (ordinal == 0) {
                this.c.g(job.BACKGROUND_TRAINING_INTERRUPT_BATTERY_NOT_OK, str);
            } else if (ordinal == 1) {
                this.c.g(job.BACKGROUND_TRAINING_INTERRUPT_NETWORK_NOT_OK, str);
            } else if (ordinal == 2) {
                this.c.g(job.BACKGROUND_TRAINING_INTERRUPT_NOT_IDLE, str);
            } else if (ordinal == 3) {
                this.c.g(job.BACKGROUND_TRAINING_INTERRUPT_THERMALS_NOT_OK, str);
            }
        }
    }
}
