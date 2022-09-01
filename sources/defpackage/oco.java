package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: oco  reason: default package */
/* loaded from: classes2.dex */
public final class oco {
    public final oeb a;
    public final Object b;
    public final Map c;
    private final ocm d;
    private final Map e;
    private final Map f;

    public oco(ocm ocmVar, Map map, Map map2, oeb oebVar, Object obj, Map map3) {
        this.d = ocmVar;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = Collections.unmodifiableMap(new HashMap(map2));
        this.a = oebVar;
        this.b = obj;
        this.c = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ntk a() {
        if (!this.f.isEmpty() || !this.e.isEmpty() || this.d != null) {
            return new ocn(this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ocm b(nuq nuqVar) {
        ocm ocmVar = (ocm) this.e.get(nuqVar.b);
        if (ocmVar == null) {
            ocmVar = (ocm) this.f.get(nuqVar.c);
        }
        return ocmVar == null ? this.d : ocmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oco ocoVar = (oco) obj;
            if (jdg.W(this.d, ocoVar.d) && jdg.W(this.e, ocoVar.e) && jdg.W(this.f, ocoVar.f) && jdg.W(this.a, ocoVar.a) && jdg.W(this.b, ocoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("defaultMethodConfig", this.d);
        S.b("serviceMethodMap", this.e);
        S.b("serviceMap", this.f);
        S.b("retryThrottling", this.a);
        S.b("loadBalancingConfig", this.b);
        return S.toString();
    }
}
