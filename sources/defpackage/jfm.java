package defpackage;

import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jfm  reason: default package */
/* loaded from: classes.dex */
public final class jfm extends jfe {
    public static final llw a = llw.n("tablet", "default", "tablet_large", "large", "tablet_huge", "huge");
    public volatile String d = g(irn.d());
    private final irm e;

    public jfm() {
        super(R.string.f166970_resource_name_obfuscated_res_0x7f140914);
        jfl jflVar = new jfl(this);
        this.e = jflVar;
        jflVar.f(mjl.a);
    }

    public static jfn f(String str) {
        return new jgb("device_size", g(str));
    }

    public static String g(String str) {
        return (String) a.getOrDefault(str, "default");
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jgb("device_size", this.d);
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
