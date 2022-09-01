package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: kjt  reason: default package */
/* loaded from: classes.dex */
final class kjt {
    public final Context a;
    public final lgb b;

    public kjt(Context context, lgb lgbVar) {
        if (context != null) {
            this.a = context;
            this.b = lgbVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjt) {
            kjt kjtVar = (kjt) obj;
            if (this.a.equals(kjtVar.a)) {
                lgb lgbVar = this.b;
                lgb lgbVar2 = kjtVar.b;
                if (lgbVar != null ? lgbVar.equals(lgbVar2) : lgbVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        lgb lgbVar = this.b;
        return hashCode ^ (lgbVar == null ? 0 : lgbVar.hashCode());
    }

    public final String toString() {
        String obj = this.a.toString();
        String valueOf = String.valueOf(this.b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    public kjt() {
    }
}
