package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ocm  reason: default package */
/* loaded from: classes2.dex */
public final class ocm {
    static final nrz a = nrz.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final oed f;
    final oap g;

    public ocm(Map map, boolean z, int i, int i2) {
        oed oedVar;
        oap oapVar;
        this.b = obh.c(map, "timeout");
        this.c = obh.j(map);
        Integer b = obh.b(map, "maxResponseMessageBytes");
        this.d = b;
        if (b != null) {
            jdg.A(b.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", b);
        }
        Integer b2 = obh.b(map, "maxRequestMessageBytes");
        this.e = b2;
        if (b2 != null) {
            jdg.A(b2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", b2);
        }
        Map h = z ? obh.h(map, "retryPolicy") : null;
        if (h == null) {
            oedVar = null;
        } else {
            Integer b3 = obh.b(h, "maxAttempts");
            jdg.Q(b3, "maxAttempts cannot be empty");
            int intValue = b3.intValue();
            jdg.y(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long c = obh.c(h, "initialBackoff");
            jdg.Q(c, "initialBackoff cannot be empty");
            long longValue = c.longValue();
            jdg.z(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long c2 = obh.c(h, "maxBackoff");
            jdg.Q(c2, "maxBackoff cannot be empty");
            long longValue2 = c2.longValue();
            jdg.z(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double a2 = obh.a(h, "backoffMultiplier");
            jdg.Q(a2, "backoffMultiplier cannot be empty");
            double doubleValue = a2.doubleValue();
            jdg.A(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long c3 = obh.c(h, "perAttemptRecvTimeout");
            jdg.A(c3 == null || c3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", c3);
            Set a3 = ofb.a(h, "retryableStatusCodes");
            jez.Y(a3 != null, "%s is required in retry policy", "retryableStatusCodes");
            jez.Y(!a3.contains(nvr.OK), "%s must not contain OK", "retryableStatusCodes");
            jdg.w(c3 != null || !a3.isEmpty(), "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            oedVar = new oed(min, longValue, longValue2, doubleValue, c3, a3);
        }
        this.f = oedVar;
        Map h2 = z ? obh.h(map, "hedgingPolicy") : null;
        if (h2 == null) {
            oapVar = null;
        } else {
            Integer b4 = obh.b(h2, "maxAttempts");
            jdg.Q(b4, "maxAttempts cannot be empty");
            int intValue2 = b4.intValue();
            jdg.y(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, i2);
            Long c4 = obh.c(h2, "hedgingDelay");
            jdg.Q(c4, "hedgingDelay cannot be empty");
            long longValue3 = c4.longValue();
            jdg.z(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Set a4 = ofb.a(h2, "nonFatalStatusCodes");
            if (a4 == null) {
                a4 = Collections.unmodifiableSet(EnumSet.noneOf(nvr.class));
            } else {
                jez.Y(!a4.contains(nvr.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            oapVar = new oap(min2, longValue3, a4);
        }
        this.g = oapVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ocm)) {
            return false;
        }
        ocm ocmVar = (ocm) obj;
        return jdg.W(this.b, ocmVar.b) && jdg.W(this.c, ocmVar.c) && jdg.W(this.d, ocmVar.d) && jdg.W(this.e, ocmVar.e) && jdg.W(this.f, ocmVar.f) && jdg.W(this.g, ocmVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("timeoutNanos", this.b);
        S.b("waitForReady", this.c);
        S.b("maxInboundMessageSize", this.d);
        S.b("maxOutboundMessageSize", this.e);
        S.b("retryPolicy", this.f);
        S.b("hedgingPolicy", this.g);
        return S.toString();
    }
}
