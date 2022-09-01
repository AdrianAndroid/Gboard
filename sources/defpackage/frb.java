package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: frb  reason: default package */
/* loaded from: classes.dex */
public final class frb {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final ComponentName d;
    public final int e;
    public final boolean f;

    public frb(ComponentName componentName) {
        this.b = null;
        this.c = null;
        fyb.ax(componentName);
        this.d = componentName;
        this.e = 4225;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frb)) {
            return false;
        }
        frb frbVar = (frb) obj;
        if (fyb.aJ(this.b, frbVar.b) && fyb.aJ(this.c, frbVar.c) && fyb.aJ(this.d, frbVar.d)) {
            int i = frbVar.e;
            if (this.f == frbVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, 4225, Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            fyb.ax(this.d);
            return this.d.flattenToString();
        }
        return str;
    }

    public frb(String str, boolean z) {
        fyb.aF(str);
        this.b = str;
        fyb.aF("com.google.android.gms");
        this.c = "com.google.android.gms";
        this.d = null;
        this.e = 4225;
        this.f = z;
    }
}
