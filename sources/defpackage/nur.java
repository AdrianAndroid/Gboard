package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: nur  reason: default package */
/* loaded from: classes2.dex */
public final class nur {
    public final int a;
    public final nvi b;
    public final nvz c;
    public final nuw d;
    public final Executor e;
    private final ScheduledExecutorService f;
    private final nsc g;

    public nur(Integer num, nvi nviVar, nvz nvzVar, nuw nuwVar, ScheduledExecutorService scheduledExecutorService, nsc nscVar, Executor executor) {
        this.a = num.intValue();
        this.b = nviVar;
        this.c = nvzVar;
        this.d = nuwVar;
        this.f = scheduledExecutorService;
        this.g = nscVar;
        this.e = executor;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.f("defaultPort", this.a);
        S.b("proxyDetector", this.b);
        S.b("syncContext", this.c);
        S.b("serviceConfigParser", this.d);
        S.b("scheduledExecutorService", this.f);
        S.b("channelLogger", this.g);
        S.b("executor", this.e);
        S.b("overrideAuthority", null);
        return S.toString();
    }
}
