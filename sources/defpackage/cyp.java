package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cyp  reason: default package */
/* loaded from: classes.dex */
public final class cyp implements cyw {
    private final String a;
    private final String b;
    private final int c;

    public cyp() {
    }

    public cyp(String str, int i, String str2) {
        this.a = str;
        this.c = i;
        this.b = str2;
    }

    public static cyo f() {
        return new cyo();
    }

    @Override // defpackage.cyw
    public final /* synthetic */ long a() {
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyp) {
            cyp cypVar = (cyp) obj;
            if (this.a.equals(cypVar.a)) {
                int i = this.c;
                int i2 = cypVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(cypVar.b)) {
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
        return 2;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.c;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ this.b.hashCode();
        }
        throw null;
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
        return iil.a;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(false);
        a.e(cyy.b());
        int i = this.c;
        if (i == 1) {
            a.a("source_id", this.b);
        } else if (i == 2) {
            a.a("id", this.b);
        }
        return a.l();
    }

    public final String toString() {
        String str = this.a;
        int i = this.c;
        String str2 = i != 1 ? i != 2 ? "null" : "SHARE" : "VIEW";
        String str3 = this.b;
        return "TenorLogRequest{baseUrl=" + str + ", type=" + str2 + ", id=" + str3 + "}";
    }
}
