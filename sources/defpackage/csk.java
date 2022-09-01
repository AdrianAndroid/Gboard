package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: csk  reason: default package */
/* loaded from: classes.dex */
public final class csk {
    public final SoftKeyboardView a;
    private final icf b;

    public csk(icf icfVar, SoftKeyboardView softKeyboardView) {
        this.b = icfVar;
        if (softKeyboardView != null) {
            this.a = softKeyboardView;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csk) {
            csk cskVar = (csk) obj;
            if (this.b.equals(cskVar.b) && this.a.equals(cskVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String obj2 = this.a.toString();
        return "KeyboardViewAndDef{def=" + obj + ", view=" + obj2 + "}";
    }

    public csk() {
    }
}
