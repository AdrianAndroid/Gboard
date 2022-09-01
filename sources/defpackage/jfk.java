package defpackage;

import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jfk  reason: default package */
/* loaded from: classes.dex */
public final class jfk extends jfe {
    public static final llw a = llw.m("tablet_large", "tablet", "tablet_huge", "tablet");
    public volatile String d = g(irn.d());
    private final irm e;

    public jfk() {
        super(R.string.f166960_resource_name_obfuscated_res_0x7f140913);
        jfj jfjVar = new jfj(this);
        this.e = jfjVar;
        jfjVar.f(mjl.a);
    }

    public static jfn f(String str) {
        return new jgb("device", g(str));
    }

    public static String g(String str) {
        return (String) a.getOrDefault(str, str);
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jgb("device", this.d);
    }

    @Override // defpackage.jfp
    public final boolean c() {
        String g = g(irn.d());
        if (!TextUtils.equals(this.d, g)) {
            this.d = g;
            return true;
        }
        return false;
    }
}
