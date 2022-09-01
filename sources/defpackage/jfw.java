package defpackage;

import android.content.res.Configuration;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jfw  reason: default package */
/* loaded from: classes.dex */
public final class jfw extends jfe {
    private volatile String a = f();
    private final irm d;

    public jfw() {
        super(R.string.f166990_resource_name_obfuscated_res_0x7f140916);
        jfv jfvVar = new jfv(this);
        this.d = jfvVar;
        jfvVar.f(mjl.a);
    }

    public static String f() {
        return g(irn.c());
    }

    public static String g(Configuration configuration) {
        int i;
        return (configuration == null || (i = configuration.orientation) == 1) ? "portrait" : i != 2 ? "undefined" : "landscape";
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jgb("orientation", this.a);
    }

    @Override // defpackage.jfp
    public final boolean c() {
        return h(f());
    }

    public final boolean h(String str) {
        if (this.a.equals(str)) {
            return false;
        }
        this.a = str;
        return true;
    }
}
