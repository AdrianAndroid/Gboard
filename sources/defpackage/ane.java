package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ane  reason: default package */
/* loaded from: classes.dex */
public final class ane {
    public final Object a;
    public final Throwable b;

    public ane(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public ane(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ane)) {
            return false;
        }
        ane aneVar = (ane) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(aneVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th != null && aneVar.b != null) {
            return th.toString().equals(this.b.toString());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
