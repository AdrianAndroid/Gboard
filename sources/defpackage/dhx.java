package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: dhx  reason: default package */
/* loaded from: classes.dex */
public final class dhx {
    public final hlf a;
    public final View b;
    public final View c;

    public dhx() {
    }

    public dhx(hlf hlfVar, View view, View view2) {
        this.a = hlfVar;
        this.b = view;
        this.c = view2;
    }

    public final boolean equals(Object obj) {
        View view;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhx) {
            dhx dhxVar = (dhx) obj;
            if (this.a.equals(dhxVar.a) && ((view = this.b) != null ? view.equals(dhxVar.b) : dhxVar.b == null)) {
                View view2 = this.c;
                View view3 = dhxVar.c;
                if (view2 != null ? view2.equals(view3) : view3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        View view = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (view == null ? 0 : view.hashCode())) * 1000003;
        View view2 = this.c;
        if (view2 != null) {
            i = view2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "TooltipBundle{tooltip=" + valueOf + ", tooltipView=" + valueOf2 + ", outsideTouchDetectorView=" + valueOf3 + "}";
    }
}
