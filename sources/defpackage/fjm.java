package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: fjm  reason: default package */
/* loaded from: classes.dex */
public final class fjm {
    public final long a;
    public final int b;
    public final Bundle c;
    public final fjo d;

    public fjm(long j, int i, Bundle bundle, fjo fjoVar) {
        this.a = j;
        this.b = i;
        this.c = bundle;
        this.d = fjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fjm fjmVar = (fjm) obj;
            if (this.a == fjmVar.a && this.b == fjmVar.b && this.c.equals(fjmVar.c) && this.d.equals(fjmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }
}
