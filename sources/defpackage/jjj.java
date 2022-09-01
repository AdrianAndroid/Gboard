package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: jjj  reason: default package */
/* loaded from: classes.dex */
public final class jjj {
    public final Uri a;
    public final String b;
    public final jjh c;
    public final int d;
    public final llp e;
    private final lfb f;

    public jjj() {
    }

    public jjj(Uri uri, String str, jjh jjhVar, int i, llp llpVar, lfb lfbVar) {
        this.a = uri;
        this.b = str;
        this.c = jjhVar;
        this.d = i;
        this.e = llpVar;
        this.f = lfbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjj) {
            jjj jjjVar = (jjj) obj;
            if (this.a.equals(jjjVar.a) && this.b.equals(jjjVar.b) && this.c.equals(jjjVar.c) && this.d == jjjVar.d && lre.I(this.e, jjjVar.e) && this.f.equals(jjjVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        return "DownloadRequest{fileUri=" + valueOf + ", urlToDownload=" + str + ", downloadConstraints=" + valueOf2 + ", trafficTag=" + i + ", extraHttpHeaders=" + valueOf3 + ", inlineDownloadParamsOptional=" + valueOf4 + "}";
    }
}
