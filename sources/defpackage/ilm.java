package defpackage;

import android.graphics.Point;
import android.view.View;

/* compiled from: PG */
/* renamed from: ilm  reason: default package */
/* loaded from: classes.dex */
public final class ilm {
    public final Point a;
    public final int b;
    public final View c;
    public final View d;

    public ilm() {
    }

    public ilm(Point point, int i, View view, View view2) {
        this.a = point;
        this.b = i;
        this.c = view;
        this.d = view2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilm) {
            ilm ilmVar = (ilm) obj;
            if (this.a.equals(ilmVar.a) && this.b == ilmVar.b && this.c.equals(ilmVar.c) && this.d.equals(ilmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return "GridCell{indices=" + valueOf + ", dataId=" + i + ", view=" + valueOf2 + ", labelView=" + valueOf3 + "}";
    }
}
