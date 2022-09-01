package defpackage;

/* compiled from: PG */
/* renamed from: jhw  reason: default package */
/* loaded from: classes.dex */
public final class jhw {
    public final String a;
    public final lfb b;
    public final lfb c;
    public final lfb d;
    private final lfb e;
    private final lfb f;
    private final lfb g;
    private final int h;

    public jhw() {
    }

    public jhw(String str, lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4, lfb lfbVar5, lfb lfbVar6) {
        this.a = str;
        this.b = lfbVar;
        this.e = lfbVar2;
        this.f = lfbVar3;
        this.g = lfbVar4;
        this.c = lfbVar5;
        this.d = lfbVar6;
        this.h = 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhw) {
            jhw jhwVar = (jhw) obj;
            if (this.a.equals(jhwVar.a) && this.b.equals(jhwVar.b) && this.e.equals(jhwVar.e) && this.f.equals(jhwVar.f) && this.g.equals(jhwVar.g) && this.c.equals(jhwVar.c) && this.d.equals(jhwVar.d)) {
                int i = this.h;
                int i2 = jhwVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959);
        int i = this.h;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ 1237;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.c);
        String valueOf6 = String.valueOf(this.d);
        int i = this.h;
        String str2 = i != 1 ? i != 2 ? "null" : "ALL" : "NONE";
        return "DownloadFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + ", contentTitleOptional=" + valueOf3 + ", contentTextOptional=" + valueOf4 + ", downloadConditionsOptional=" + valueOf5 + ", listenerOptional=" + valueOf6 + ", groupSizeBytes=0, showNotifications=" + str2 + ", preserveZipDirectories=false}";
    }
}
