package defpackage;

/* compiled from: PG */
/* renamed from: kdm  reason: default package */
/* loaded from: classes.dex */
public final class kdm {
    public final String a;
    public final boolean b;
    public final oos c;
    public final onm d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final kby h;

    public kdm() {
    }

    public kdm(String str, boolean z, oos oosVar, onm onmVar, String str2, Long l, boolean z2, kby kbyVar) {
        this.a = str;
        this.b = z;
        this.c = oosVar;
        this.d = onmVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = kbyVar;
    }

    public static kdl a() {
        kdl kdlVar = new kdl();
        kdlVar.b(false);
        kdlVar.c(false);
        return kdlVar;
    }

    public final boolean equals(Object obj) {
        onm onmVar;
        String str;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kdm) {
            kdm kdmVar = (kdm) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(kdmVar.a) : kdmVar.a == null) {
                if (this.b == kdmVar.b && this.c.equals(kdmVar.c) && ((onmVar = this.d) != null ? onmVar.equals(kdmVar.d) : kdmVar.d == null) && ((str = this.e) != null ? str.equals(kdmVar.e) : kdmVar.e == null) && ((l = this.f) != null ? l.equals(kdmVar.f) : kdmVar.f == null) && this.g == kdmVar.g) {
                    kby kbyVar = this.h;
                    kby kbyVar2 = kdmVar.h;
                    if (kbyVar != null ? kbyVar.equals(kbyVar2) : kbyVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        Long l = this.f;
        boolean z2 = this.g;
        String valueOf3 = String.valueOf(this.h);
        return "Metric{customEventName=" + str + ", isEventNameConstant=" + z + ", metric=" + valueOf + ", metricExtension=" + valueOf2 + ", accountableComponentName=" + str2 + ", sampleRatePermille=" + l + ", isUnsampled=" + z2 + ", debugLogsTime=" + valueOf3 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        int i3 = 1237;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        oos oosVar = this.c;
        int i4 = oosVar.cO;
        if (i4 == 0) {
            i4 = nhh.a.b(oosVar).b(oosVar);
            oosVar.cO = i4;
        }
        int i5 = (hashCode ^ i4) * 1000003;
        onm onmVar = this.d;
        if (onmVar == null) {
            i = 0;
        } else {
            i = onmVar.cO;
            if (i == 0) {
                i = nhh.a.b(onmVar).b(onmVar);
                onmVar.cO = i;
            }
        }
        int i6 = (i5 ^ i) * 1000003;
        String str2 = this.e;
        int hashCode2 = (i6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int hashCode3 = (hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        if (true == this.g) {
            i3 = 1231;
        }
        int i7 = (hashCode3 ^ i3) * 1000003;
        kby kbyVar = this.h;
        if (kbyVar != null) {
            i2 = kbyVar.hashCode();
        }
        return i7 ^ i2;
    }
}
