package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lbt  reason: default package */
/* loaded from: classes.dex */
public final class lbt {
    public static final lbt a = a().c();
    public final Integer b;
    public final Map c;

    public lbt() {
    }

    public lbt(Integer num, Map map) {
        this.b = num;
        this.c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nrw a() {
        nrw nrwVar = new nrw();
        nrwVar.e(new HashMap());
        return nrwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbt) {
            lbt lbtVar = (lbt) obj;
            Integer num = this.b;
            if (num != null ? num.equals(lbtVar.b) : lbtVar.b == null) {
                if (this.c.equals(lbtVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        Integer num = this.b;
        String valueOf = String.valueOf(this.c);
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + num + ", splitInstallErrorCodeByModule=" + valueOf + "}";
    }

    public final int hashCode() {
        Integer num = this.b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }
}
