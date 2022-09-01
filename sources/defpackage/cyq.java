package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cyq  reason: default package */
/* loaded from: classes.dex */
public final class cyq {
    public final Uri a;
    public final Uri b;
    public final int c;
    public final int d;
    private final int e;

    public cyq(Uri uri, Uri uri2, int i, int i2, int i3) {
        if (uri != null) {
            this.a = uri;
            if (uri2 != null) {
                this.b = uri2;
                this.c = i;
                this.d = i2;
                this.e = i3;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null preview");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyq) {
            cyq cyqVar = (cyq) obj;
            if (this.a.equals(cyqVar.a) && this.b.equals(cyqVar.b) && this.c == cyqVar.c && this.d == cyqVar.d && this.e == cyqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        return "TenorMedia{preview=" + obj + ", url=" + obj2 + ", width=" + i + ", height=" + i2 + ", size=" + i3 + "}";
    }

    public cyq() {
    }
}
