package defpackage;

import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ieu  reason: default package */
/* loaded from: classes.dex */
public final class ieu implements ies {
    final /* synthetic */ iew a;
    private final hqo b;
    private final String c = "hmm";
    private boolean d;

    public ieu(iew iewVar) {
        this.a = iewVar;
        iet ietVar = new iet(this);
        this.b = ietVar;
        ietVar.d(gyc.a);
    }

    @Override // defpackage.ies
    public final void a() {
        c(hqp.b());
    }

    @Override // defpackage.ies
    public final boolean b() {
        return this.d;
    }

    public final void c(hqt hqtVar) {
        iav g;
        this.d = false;
        if (hqtVar == null || (g = hqtVar.g()) == null) {
            return;
        }
        String obj = g.q.c(R.id.f55000_resource_name_obfuscated_res_0x7f0b01dd, "").toString();
        if (TextUtils.isEmpty(obj)) {
            return;
        }
        for (String str : lfy.c(',').i(obj)) {
            if (this.c.equals(str)) {
                this.d = true;
                return;
            }
        }
    }
}
