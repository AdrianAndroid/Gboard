package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cob  reason: default package */
/* loaded from: classes.dex */
public final class cob {
    public final llp a;
    public final Locale b;
    public final long c;

    public cob(llp llpVar, Locale locale, long j) {
        if (llpVar != null) {
            this.a = llpVar;
            if (locale != null) {
                this.b = locale;
                this.c = j;
                return;
            }
            throw new NullPointerException("Null locale");
        }
        throw new NullPointerException("Null categories");
    }

    public static cob a(llp llpVar, Locale locale, long j) {
        return new cob(llpVar, locale, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return System.currentTimeMillis() - this.c > TimeUnit.HOURS.toMillis(((Long) coc.b.c()).longValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cob) {
            cob cobVar = (cob) obj;
            if (lre.I(this.a, cobVar.a) && this.b.equals(cobVar.b) && this.c == cobVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        long j = this.c;
        return "CategoryData{categories=" + obj + ", locale=" + obj2 + ", timestamp=" + j + "}";
    }

    public cob() {
    }
}
