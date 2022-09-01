package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: ika  reason: default package */
/* loaded from: classes.dex */
public final class ika {
    public final long a;
    public final String b;
    public final String c;
    public final jav d;

    public ika(long j, String str, String str2, jav javVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = javVar;
    }

    public ika(Bundle bundle) {
        this.a = bundle.getLong("_id", -1L);
        this.b = bundle.getString("word");
        this.c = bundle.getString("shortcut");
        this.d = (jav) bundle.getParcelable("locale");
    }

    public final void a(Bundle bundle) {
        bundle.putLong("_id", this.a);
        bundle.putString("word", this.b);
        bundle.putString("shortcut", this.c);
        bundle.putParcelable("locale", this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ika)) {
            return false;
        }
        ika ikaVar = (ika) obj;
        return this.a == ikaVar.a && Objects.equals(this.b, ikaVar.b) && Objects.equals(this.c, ikaVar.c) && Objects.equals(this.d, ikaVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, this.c, this.d);
    }
}
