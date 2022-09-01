package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cyf  reason: default package */
/* loaded from: classes.dex */
public final class cyf implements cyw {
    private final String a;
    private final String b;
    private final int c;

    public cyf() {
    }

    public cyf(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = 4;
    }

    @Override // defpackage.cyw
    public final /* synthetic */ long a() {
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyf) {
            cyf cyfVar = (cyf) obj;
            if (this.a.equals(cyfVar.a) && this.b.equals(cyfVar.b)) {
                int i = this.c;
                int i2 = cyfVar.c;
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
        return this.a;
    }

    @Override // defpackage.cyw
    public final int h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int i = this.c;
        iin.f(i);
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i;
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
        return iil.i;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(true);
        a.d("contentfilter", this.b);
        a.d("media_filter", "tinygif");
        a.e(cyy.b());
        return a.l();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        return "TenorCategoryRequest{baseUrl=" + str + ", contentFilterLevel=" + str2 + ", priority=" + iin.e(i) + "}";
    }
}
