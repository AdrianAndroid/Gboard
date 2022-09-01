package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aij  reason: default package */
/* loaded from: classes.dex */
public final class aij {
    final int a;
    final int b;
    final String c;

    public aij(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.F;
        this.b = preference.G;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aij)) {
            return false;
        }
        aij aijVar = (aij) obj;
        return this.a == aijVar.a && this.b == aijVar.b && TextUtils.equals(this.c, aijVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
