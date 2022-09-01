package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* renamed from: cqp  reason: default package */
/* loaded from: classes.dex */
public abstract class cqp {
    public static final ltg r = ltg.j("com/google/android/apps/inputmethod/libs/expression/image/Image");
    public static final ndn t = new ndn();
    private static final lmz a = lmz.w("", "gif", "tenor_gif", "bitmoji", "sticker", "curated_gif", new String[0]);
    private static final lmz b = lmz.t("gif", "tenor_gif", "curated_gif");
    static final lmz s = lmz.s("sticker", "bitmoji");

    public static cqo t() {
        cqo cqoVar = new cqo((byte[]) null);
        cqoVar.g("");
        cqoVar.n(0);
        cqoVar.f(0);
        cqoVar.j(iil.a);
        cqoVar.l("");
        cqoVar.e(mbr.UNKNOWN_CONTENT_TYPE);
        cqoVar.k(lrq.b);
        cqoVar.d(0);
        return cqoVar;
    }

    public static boolean w(String str) {
        return !TextUtils.isEmpty(str) && a.contains(str);
    }

    public static boolean y(String str) {
        return str != null && a.contains(str);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Uri d();

    public abstract Uri e();

    public abstract Uri f();

    public abstract Uri g();

    public abstract cqo h();

    public abstract iil i();

    public abstract lfb j();

    public abstract llw k();

    public abstract llw l();

    public abstract mbr m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public abstract String r();

    public Uri s() {
        throw null;
    }

    public final File u() {
        return (File) lre.ao(k().values());
    }

    public final boolean v() {
        return b.contains(r());
    }

    public final boolean x() {
        return s.contains(r());
    }
}
