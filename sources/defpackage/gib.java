package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: gib  reason: default package */
/* loaded from: classes.dex */
public final class gib {
    public final String a;
    public final Bundle b;
    public final String c;

    public gib() {
    }

    public gib(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
        this.c = "com.google.android.googlequicksearchbox";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gib) {
            gib gibVar = (gib) obj;
            String str = this.a;
            if (str != null ? str.equals(gibVar.a) : gibVar.a == null) {
                if (this.b.equals(gibVar.b) && this.c.equals(gibVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        return "AssistantSettingsIntent{feature=" + str + ", featureArguments=" + valueOf + ", accountName=null, gsaPackageName=" + str2 + "}";
    }

    public final int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c.hashCode();
    }
}
