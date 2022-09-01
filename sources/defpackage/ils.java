package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ils  reason: default package */
/* loaded from: classes.dex */
public final class ils {
    public View.OnClickListener a;
    public gqc b = gqc.b;
    private final Context c;
    private String d;

    public ils(Context context) {
        this.c = context;
    }

    public final String a() {
        if (this.d == null) {
            this.d = this.c.getString(R.string.f150430_resource_name_obfuscated_res_0x7f14019e);
        }
        return this.d;
    }

    public final boolean b(int i) {
        return this.b.m() && this.b.p() && !iaz.g(i);
    }
}
