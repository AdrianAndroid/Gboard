package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: grw  reason: default package */
/* loaded from: classes.dex */
final class grw implements gsi {
    private final gqk a;
    private boolean b;

    public grw(Context context) {
        String string = context.getString(R.string.f154030_resource_name_obfuscated_res_0x7f140338);
        gqe d = d(string);
        d.h(new iay(-40006, null, true));
        d.d = grv.b;
        gqh a = d.a();
        gqe d2 = d(string);
        d2.h(new iay(-40007, null, true));
        d2.d = grv.a;
        this.a = new gqk(R.id.key_pos_header_access_points_menu, string, a, d2.a());
    }

    private static gqe d(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.f(R.drawable.f46900_resource_name_obfuscated_res_0x7f0801a0);
        a.d(R.string.f158190_resource_name_obfuscated_res_0x7f140512);
        a.b("default", true);
        a.b("layout", Integer.valueOf((int) R.layout.f145190_resource_name_obfuscated_res_0x7f0e0531));
        return a;
    }

    @Override // defpackage.gsi
    public final void a() {
        if (!this.b) {
            return;
        }
        this.a.a(0);
    }

    @Override // defpackage.gsi
    public final void b() {
        if (!this.b) {
            return;
        }
        this.a.a(1);
    }

    @Override // defpackage.gsi
    public final void c(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (z) {
            return;
        }
        this.a.a(2);
    }
}
