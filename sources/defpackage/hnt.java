package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hnt  reason: default package */
/* loaded from: classes.dex */
public final class hnt implements ifw {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/incognito/accesspoint/IncognitoEntryAccessPointProvider");
    public final gqk b = new gqk(R.id.key_pos_header_access_points_menu, "incognito_menu", d(false), d(true));
    public boolean c;
    public boolean d;
    private hst e;
    private gqo f;

    private static gqh d(boolean z) {
        gqe a2 = gqh.a();
        a2.i("incognito_menu");
        a2.b("layout", Integer.valueOf((int) R.layout.f145280_resource_name_obfuscated_res_0x7f0e053a));
        a2.f(R.drawable.f50320_resource_name_obfuscated_res_0x7f080346);
        a2.d(z ? R.string.f149440_resource_name_obfuscated_res_0x7f140116 : R.string.f159340_resource_name_obfuscated_res_0x7f1405cf);
        a2.k(true != z ? -40000 : -40001, null);
        a2.b("closeAction", Boolean.valueOf(z));
        return a2.a();
    }

    private final void e() {
        gqo gqoVar = this.f;
        if (gqoVar != null) {
            gqoVar.h();
            this.f = null;
        }
        this.b.a(2);
        this.d = false;
    }

    public final void c(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        if (z) {
            if (this.f == null) {
                hns hnsVar = new hns(this);
                this.f = hnsVar;
                hnsVar.g(mjl.a);
            }
            this.b.a(this.c ? 1 : 0);
            return;
        }
        e();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        hnr hnrVar = new hnr(this);
        this.e = hnrVar;
        hnrVar.g(gyc.b);
    }

    @Override // defpackage.ifw
    public final void gn() {
        hst hstVar = this.e;
        if (hstVar != null) {
            hstVar.h();
        }
        if (this.d) {
            e();
        }
        this.c = false;
    }
}
