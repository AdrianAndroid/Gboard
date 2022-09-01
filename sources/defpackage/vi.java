package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: vi  reason: default package */
/* loaded from: classes2.dex */
final class vi {
    final Resources a;
    final Resources.Theme b;

    public vi(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vi viVar = (vi) obj;
            if (this.a.equals(viVar.a) && xu.b(this.b, viVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return xu.a(this.a, this.b);
    }
}
