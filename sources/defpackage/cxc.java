package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cxc  reason: default package */
/* loaded from: classes.dex */
public final class cxc implements cxa {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/StickerPack");
    public final String b;
    public final Uri c;
    public final String d;
    public final String e;
    public final iil f;
    public final llp g;
    public final String h;
    public final int i;

    public cxc() {
    }

    public cxc(String str, int i, Uri uri, String str2, String str3, iil iilVar, llp llpVar, String str4) {
        this.b = str;
        this.i = i;
        this.c = uri;
        this.d = str2;
        this.e = str3;
        this.f = iilVar;
        this.g = llpVar;
        this.h = str4;
    }

    public static cxb a() {
        cxb cxbVar = new cxb();
        cxbVar.f(Uri.EMPTY);
        cxbVar.c("");
        cxbVar.g(iil.a);
        return cxbVar;
    }

    @Override // defpackage.cxa
    public final Uri d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxc) {
            cxc cxcVar = (cxc) obj;
            if (this.b.equals(cxcVar.b)) {
                int i = this.i;
                int i2 = cxcVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(cxcVar.c) && this.d.equals(cxcVar.d) && ((str = this.e) != null ? str.equals(cxcVar.e) : cxcVar.e == null) && this.f.equals(cxcVar.f) && lre.I(this.g, cxcVar.g) && this.h.equals(cxcVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        int i = this.i;
        if (i != 0) {
            int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
            String str = this.e;
            return ((((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str = this.b;
        int i = this.i;
        String str2 = i != 1 ? i != 2 ? "null" : "BITMOJI" : "STICKER";
        String valueOf = String.valueOf(this.c);
        String str3 = this.d;
        String str4 = this.e;
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String str5 = this.h;
        return "StickerPack{id=" + str + ", tab=" + str2 + ", imageUri=" + valueOf + ", author=" + str3 + ", contentDescription=" + str4 + ", networkRequestFeature=" + valueOf2 + ", stickers=" + valueOf3 + ", categoryName=" + str5 + "}";
    }
}
