package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwm  reason: default package */
/* loaded from: classes.dex */
public final class cwm {
    public final Locale a;
    public final ncx b;
    public final String c;

    public cwm() {
    }

    public cwm(Locale locale, ncx ncxVar, String str) {
        this.a = locale;
        this.b = ncxVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwm) {
            cwm cwmVar = (cwm) obj;
            if (this.a.equals(cwmVar.a) && this.b.equals(cwmVar.b) && this.c.equals(cwmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ncx ncxVar = this.b;
        int i = ncxVar.cO;
        if (i == 0) {
            i = nhh.a.b(ncxVar).b(ncxVar);
            ncxVar.cO = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        return "MetadataConfig{locale=" + valueOf + ", marketConfig=" + valueOf2 + ", version=" + str + "}";
    }
}
