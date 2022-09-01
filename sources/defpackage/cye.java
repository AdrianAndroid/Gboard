package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cye  reason: default package */
/* loaded from: classes.dex */
public final class cye implements cyw {
    private static final Integer b = 3;
    public final String a;
    private final String c;
    private final Integer d;
    private final int e;

    public cye() {
    }

    public cye(String str, String str2, Integer num, int i) {
        this.c = str;
        this.a = str2;
        this.d = num;
        this.e = i;
    }

    public static hfg f() {
        hfg hfgVar = new hfg();
        String str = (String) cyj.l.c();
        if (str != null) {
            hfgVar.d = str;
            hfgVar.b(b);
            hfgVar.a = 4;
            return hfgVar;
        }
        throw new NullPointerException("Null baseUrl");
    }

    @Override // defpackage.cyw
    public final /* synthetic */ long a() {
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cye) {
            cye cyeVar = (cye) obj;
            if (this.c.equals(cyeVar.c) && this.a.equals(cyeVar.a) && this.d.equals(cyeVar.d)) {
                int i = this.e;
                int i2 = cyeVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyw
    public final String g() {
        return this.c;
    }

    @Override // defpackage.cyw
    public final int h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.a.hashCode();
        int hashCode3 = this.d.hashCode();
        int i = this.e;
        iin.f(i);
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i;
    }

    @Override // defpackage.cyw
    public final /* synthetic */ Uri m() {
        return dip.q(this);
    }

    @Override // defpackage.cyw
    public final /* synthetic */ iih n() {
        return dip.r(this);
    }

    @Override // defpackage.cyw
    public final iil o() {
        return iil.s;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(true);
        a.d("q", this.a);
        a.c("limit", this.d);
        a.e(cyy.b());
        return a.l();
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        Integer num = this.d;
        int i = this.e;
        return "TenorAutocompleteRequest{baseUrl=" + str + ", query=" + str2 + ", limit=" + num + ", priority=" + iin.e(i) + "}";
    }
}
