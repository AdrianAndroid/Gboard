package defpackage;

import android.view.DisplayCutout;

/* compiled from: PG */
/* renamed from: yn  reason: default package */
/* loaded from: classes2.dex */
public final class yn {
    public final DisplayCutout a;

    public yn(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return xu.b(this.a, ((yn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
