package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: dif  reason: default package */
/* loaded from: classes.dex */
public final class dif {
    public final dih a;
    public final Handler b;

    public dif() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dif) {
            dif difVar = (dif) obj;
            if (this.a.equals(difVar.a) && this.b.equals(difVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "DataListenerAndHandler{listener=" + obj + ", handler=" + obj2 + "}";
    }

    public dif(dih dihVar, Handler handler) {
        if (dihVar != null) {
            this.a = dihVar;
            this.b = handler;
            return;
        }
        throw new NullPointerException("Null listener");
    }
}
