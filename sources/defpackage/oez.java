package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* renamed from: oez  reason: default package */
/* loaded from: classes2.dex */
public final class oez {
    public final String a;
    public final Map b;

    public oez(String str, Map map) {
        jdg.Q(str, "policyName");
        this.a = str;
        jdg.Q(map, "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oez) {
            oez oezVar = (oez) obj;
            if (this.a.equals(oezVar.a) && this.b.equals(oezVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("policyName", this.a);
        S.b("rawConfigValue", this.b);
        return S.toString();
    }
}
