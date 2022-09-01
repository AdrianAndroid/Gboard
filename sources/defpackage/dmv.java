package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: dmv  reason: default package */
/* loaded from: classes.dex */
public final class dmv {
    public final hqt a;
    public boolean b = false;

    public dmv(hqt hqtVar) {
        this.a = hqtVar;
    }

    public final String a() {
        if (TextUtils.isEmpty(this.a.p())) {
            return this.a.i().n;
        }
        String valueOf = String.valueOf(this.a.i());
        String p = this.a.p();
        return valueOf + "#" + p;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dmv) {
            hqt hqtVar = ((dmv) obj).a;
            if (this.a.i().equals(hqtVar.i()) && TextUtils.equals(this.a.p(), hqtVar.p())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
