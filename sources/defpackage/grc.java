package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* renamed from: grc  reason: default package */
/* loaded from: classes.dex */
public final class grc {
    public final int a;
    public final Point b;

    public grc() {
    }

    public grc(int i, Point point) {
        this.a = i;
        this.b = point;
    }

    public static grc a(int i, Point point) {
        return new grc(i, point);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof grc) {
            grc grcVar = (grc) obj;
            if (this.a == grcVar.a && this.b.equals(grcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String obj = this.b.toString();
        return "IndexPointTuple{index=" + i + ", point=" + obj + "}";
    }
}
