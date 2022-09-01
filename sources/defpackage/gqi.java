package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* renamed from: gqi  reason: default package */
/* loaded from: classes.dex */
public final class gqi {
    public final gqh a;
    public final Point b;

    public gqi() {
    }

    public gqi(gqh gqhVar, Point point) {
        this.a = gqhVar;
        this.b = point;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqi) {
            gqi gqiVar = (gqi) obj;
            if (this.a.equals(gqiVar.a) && this.b.equals(gqiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a.a;
        String obj = this.b.toString();
        return "AccessPointDefPointTuple{accessPointDef=" + str + ", point=" + obj + "}";
    }
}
