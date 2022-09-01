package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: gsr  reason: default package */
/* loaded from: classes.dex */
public final class gsr {
    public final gqh a;
    public final SoftKeyView b;

    public gsr() {
    }

    public static gsr a(gqh gqhVar, SoftKeyView softKeyView) {
        return new gsr(gqhVar, softKeyView);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gsr) {
            gsr gsrVar = (gsr) obj;
            if (this.a.equals(gsrVar.a) && this.b.equals(gsrVar.b)) {
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
        return "AccessPointDefViewTuple{accessPointDef=" + str + ", softKeyView=" + obj + "}";
    }

    public gsr(gqh gqhVar, SoftKeyView softKeyView) {
        if (gqhVar != null) {
            this.a = gqhVar;
            if (softKeyView != null) {
                this.b = softKeyView;
                return;
            }
            throw new NullPointerException("Null softKeyView");
        }
        throw new NullPointerException("Null accessPointDef");
    }
}
