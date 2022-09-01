package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayb  reason: default package */
/* loaded from: classes.dex */
public final class ayb implements axz {
    int a;
    public Bitmap.Config b;
    private final ayc c;

    public ayb(ayc aycVar) {
        this.c = aycVar;
    }

    @Override // defpackage.axz
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayb) {
            ayb aybVar = (ayb) obj;
            if (this.a == aybVar.a && bgj.m(this.b, aybVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return ayd.a(this.a, this.b);
    }
}
