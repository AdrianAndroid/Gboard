package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bsk  reason: default package */
/* loaded from: classes.dex */
public final class bsk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/utils/PreferenceMigrator");
    public final ino b;
    public final ino c;
    public final Context d;
    public ija e;

    public bsk(ino inoVar, ino inoVar2, Context context) {
        this.b = inoVar;
        this.c = inoVar2;
        this.d = context;
    }

    public final void a(String str, String str2) {
        if (this.b.ai(str)) {
            this.c.V(str2, this.b.O(str));
            this.b.w(str);
        }
    }

    public final void b(int i, int i2) {
        if (this.b.ah(i)) {
            ino inoVar = this.b;
            inoVar.q(i2, inoVar.aj(i));
            this.b.v(i);
        }
    }

    public final void d(int i, int i2) {
        if (this.b.ah(i)) {
            ino inoVar = this.b;
            inoVar.u(i2, String.valueOf(inoVar.C(i)));
            this.b.v(i);
        }
    }

    public final void e(int i) {
        if (this.b.ah(i)) {
            this.b.v(i);
        }
    }

    public final void c(int i) {
        String string;
        ino inoVar = this.b;
        if (i != 0) {
            string = i != 2 ? "" : this.d.getString(R.string.f160060_resource_name_obfuscated_res_0x7f140623);
        } else {
            string = this.d.getString(R.string.f160050_resource_name_obfuscated_res_0x7f140622);
        }
        inoVar.u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, string);
        this.b.q(R.string.f160900_resource_name_obfuscated_res_0x7f14067a, true);
    }
}
