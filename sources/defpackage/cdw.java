package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cdw  reason: default package */
/* loaded from: classes.dex */
public final class cdw {
    public final Locale a;
    public final Locale b;
    public final boolean c;

    public cdw(Locale locale, Locale locale2, boolean z) {
        this.a = locale;
        this.b = locale2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdw)) {
            return false;
        }
        cdw cdwVar = (cdw) obj;
        return this.a.equals(cdwVar.a) && this.b.equals(cdwVar.b) && this.c == cdwVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c));
    }
}
