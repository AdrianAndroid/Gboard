package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gru  reason: default package */
/* loaded from: classes.dex */
public final class gru implements gsi {
    private final gqk a;
    private gqh b;
    private final hhk c;
    private boolean d;

    public gru(Context context) {
        String string = context.getString(R.string.f154030_resource_name_obfuscated_res_0x7f140338);
        gqe e = e(string);
        e.h(new iay(-40006, null, null));
        gqh a = e.a();
        gqe e2 = e(string);
        e2.h(new iay(-40007, null, null));
        e2.b("closeAction", true);
        e2.b("highlighted", true);
        this.a = new gqk(0, string, a, e2.a());
        ewy ewyVar = new ewy(this, string, 2);
        this.c = ewyVar;
        iho.a(context).e(ewyVar);
        d(iho.a(context), string);
    }

    private static gqe e(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.f(R.drawable.f49290_resource_name_obfuscated_res_0x7f0802a9);
        a.g(R.string.f156030_resource_name_obfuscated_res_0x7f14040f);
        a.d(R.string.f158190_resource_name_obfuscated_res_0x7f140512);
        a.b("moreAccessPointsDef", true);
        return a;
    }

    @Override // defpackage.gsi
    public final void a() {
        if (!this.d) {
            return;
        }
        this.a.a(0);
        grd.b(R.id.key_pos_header_access_points_menu, this.b.a);
    }

    @Override // defpackage.gsi
    public final void b() {
        if (!this.d) {
            return;
        }
        this.a.a(1);
        gqq.b(R.id.key_pos_header_access_points_menu, this.b);
    }

    @Override // defpackage.gsi
    public final void c(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (z) {
            return;
        }
        this.a.a(2);
        grd.b(R.id.key_pos_header_access_points_menu, this.b.a);
    }

    public final void d(hhl hhlVar, String str) {
        this.b = gqn.b(gqn.c(str), new iay(-40007, null, true), ((Boolean) hhlVar.c()).booleanValue());
    }
}
