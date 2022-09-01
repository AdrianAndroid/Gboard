package defpackage;

import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cmr  reason: default package */
/* loaded from: classes.dex */
public final class cmr implements cnc {
    public final cmt a = new cmt();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public boolean c = false;
    private final Runnable d;

    public cmr(Runnable runnable) {
        this.d = runnable;
    }

    @Override // defpackage.cnc
    public final cmt a() {
        return this.a;
    }

    @Override // defpackage.cnc
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.cnc
    public final void c(Runnable runnable) {
        if (this.b.get()) {
            return;
        }
        this.c = true;
        gqe a = gqh.a();
        a.i("emojify_icon");
        a.f(cnb.a());
        a.d(R.string.f150940_resource_name_obfuscated_res_0x7f1401d4);
        a.l(this.d);
        a.d = new gqg() { // from class: cmp
            @Override // defpackage.gqg
            public final void a(View view) {
                cmr cmrVar = cmr.this;
                cmrVar.a.d(view);
                if (cmrVar.c) {
                    cmrVar.c = false;
                    cmrVar.a.a();
                    return;
                }
                cmrVar.a.c();
            }
        };
        a.e = new cmq(this, 0);
        a.g = new doi(this, runnable);
        a.b("layout", Integer.valueOf((int) R.layout.f134200_resource_name_obfuscated_res_0x7f0e0085));
        gqq.c(R.id.key_pos_header_power_key, a.a(), true);
    }

    @Override // defpackage.cnc
    public final boolean d() {
        if (!this.b.get()) {
            return false;
        }
        grd.b(R.id.key_pos_header_power_key, "emojify_icon");
        this.b.set(false);
        this.a.a();
        return true;
    }
}
