package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: kqh  reason: default package */
/* loaded from: classes.dex */
public final class kqh {
    public final Uri a;
    public final ngz b;
    public final kqb c;
    public final llp d;
    public final boolean e;
    public final kvj f;

    public kqh() {
    }

    public kqh(Uri uri, ngz ngzVar, kqb kqbVar, llp llpVar, kvj kvjVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = uri;
        this.b = ngzVar;
        this.c = kqbVar;
        this.d = llpVar;
        this.f = kvjVar;
        this.e = z;
    }

    public static kqg a() {
        kqg kqgVar = new kqg();
        kqgVar.a = kqm.a;
        kqgVar.d(kqu.a);
        kqgVar.c();
        kqgVar.g(true);
        return kqgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqh) {
            kqh kqhVar = (kqh) obj;
            if (this.a.equals(kqhVar.a) && this.b.equals(kqhVar.b) && this.c.equals(kqhVar.c) && lre.I(this.d, kqhVar.d) && this.f.equals(kqhVar.f) && this.e == kqhVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f);
        boolean z = this.e;
        return "ProtoDataStoreConfig{uri=" + valueOf + ", schema=" + valueOf2 + ", handler=" + valueOf3 + ", migrations=" + valueOf4 + ", variantConfig=" + valueOf5 + ", useGeneratedExtensionRegistry=" + z + ", enableTracing=false}";
    }
}
