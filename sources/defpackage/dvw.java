package defpackage;

import com.google.android.inputmethod.latin.R;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: dvw  reason: default package */
/* loaded from: classes.dex */
public final class dvw {
    public final dwh a;
    private Runnable f;
    public Optional b = Optional.empty();
    private boolean e = true;
    public bkj c = bkj.h;
    public boolean d = false;

    public dvw(dwh dwhVar) {
        this.a = dwhVar;
    }

    public final int a() {
        return this.d ? R.id.key_pos_header_extra_key : R.id.key_pos_header_access_points_menu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.ifPresent(new chf(this, 13));
        this.b = Optional.empty();
    }

    public final void c() {
        int i;
        Runnable runnable;
        b();
        boolean z = this.e;
        boolean z2 = true;
        String str = true != z ? "CLOSE_LEARNING_CENTER_BUTTON_ID" : "OPEN_LEARNING_CENTER_BUTTON_ID";
        int i2 = true != z ? R.string.f158730_resource_name_obfuscated_res_0x7f14056f : R.string.f158890_resource_name_obfuscated_res_0x7f140581;
        if (z) {
            i = true != this.d ? R.layout.f143760_resource_name_obfuscated_res_0x7f0e0488 : R.layout.f143770_resource_name_obfuscated_res_0x7f0e0489;
        } else {
            i = true != this.d ? R.layout.f143640_resource_name_obfuscated_res_0x7f0e047c : R.layout.f143650_resource_name_obfuscated_res_0x7f0e047d;
            z2 = false;
        }
        if (z2) {
            runnable = new dvd(this, 4);
        } else {
            runnable = this.f;
        }
        gqe a = gqh.a();
        a.i(str);
        a.d(i2);
        a.b("layout", Integer.valueOf(i));
        if (runnable != null) {
            a.l(runnable);
        }
        gqq.b(a(), a.a());
        this.b = Optional.of(str);
    }

    public final void d(boolean z, Runnable runnable) {
        boolean z2 = true;
        if (z == this.e && runnable == this.f) {
            z2 = false;
        }
        this.e = z;
        this.f = runnable;
        if (!z2 || !this.b.isPresent()) {
            return;
        }
        c();
    }
}
