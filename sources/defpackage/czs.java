package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: czs  reason: default package */
/* loaded from: classes.dex */
public final class czs {
    public final String a;
    public final llp b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;

    public czs() {
    }

    public czs(String str, llp llpVar, int i, int i2, float f, float f2) {
        this.a = str;
        this.b = llpVar;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = f2;
    }

    public static czr b() {
        czr czrVar = new czr();
        czrVar.g(512);
        czrVar.c(512);
        czrVar.e(((Double) czu.b.c()).floatValue());
        czrVar.f(((Double) czu.c.c()).floatValue());
        return czrVar;
    }

    public static boolean c(Uri uri) {
        return iin.b(uri) && "dynamic_art_authority".equals(uri.getAuthority());
    }

    public final Uri a() {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("gboard").authority("dynamic_art_authority").appendQueryParameter("animation", this.a).appendQueryParameter("width", Integer.toString(this.c)).appendQueryParameter("height", Integer.toString(this.d)).appendQueryParameter("start_percent", Float.toString(this.e)).appendQueryParameter("stop_percent", Float.toString(this.f));
        llp llpVar = this.b;
        int size = llpVar.size();
        for (int i = 0; i < size; i++) {
            appendQueryParameter.appendQueryParameter("line", (String) llpVar.get(i));
        }
        return appendQueryParameter.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czs) {
            czs czsVar = (czs) obj;
            if (this.a.equals(czsVar.a) && lre.I(this.b, czsVar.b) && this.c == czsVar.c && this.d == czsVar.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(czsVar.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(czsVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ Float.floatToIntBits(this.f);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        float f = this.e;
        float f2 = this.f;
        return "DynamicArtParams{animationFile=" + str + ", lines=" + valueOf + ", width=" + i + ", height=" + i2 + ", startPercent=" + f + ", stopPercent=" + f2 + "}";
    }
}
