package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: itx  reason: default package */
/* loaded from: classes.dex */
public final class itx implements hhk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/guarder/DeviceIntegrityMonitor");
    static final hhl b = hhq.a("enable_integrity_monitor", false);
    public static final hhl c = hhq.a("integrity_monitor_take_action", false);
    public final Executor d;
    public final idk e;
    private final gwc f;

    public itx(Executor executor, gwc gwcVar, idk idkVar) {
        this.d = executor;
        this.f = gwcVar;
        this.e = idkVar;
    }

    public final void b() {
        if (((Boolean) b.c()).booleanValue()) {
            if (!jdg.Z(Build.TYPE, "user")) {
                this.e.e(iwc.DEVICE_INTEGRITY_CHECK, 1);
                ijf.j(itl.b);
                return;
            }
            Objects.requireNonNull(this.f);
            hiz.p(new hcb(5), this.d).F(new hyw(this, 8), this.d);
            return;
        }
        ijf.j(itl.b);
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        b.c();
        b();
    }
}
