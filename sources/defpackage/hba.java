package defpackage;

/* compiled from: PG */
/* renamed from: hba  reason: default package */
/* loaded from: classes.dex */
public final class hba {
    public final boolean a;

    public hba() {
    }

    public hba(boolean z) {
        this.a = z;
    }

    public static haz a() {
        haz hazVar = new haz();
        hazVar.c();
        hazVar.b();
        return hazVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hba) && this.a == ((hba) obj).a;
    }

    public final int hashCode() {
        return ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        return "EmojiVariantsOptions{stickyPreferencesEnabled=" + z + ", globalPreferencesEnabled=false, stickyPreferencesProtoProvider=null}";
    }
}
