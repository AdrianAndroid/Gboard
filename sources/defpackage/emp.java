package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: emp  reason: default package */
/* loaded from: classes.dex */
public final class emp implements elv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule");
    public ino b;
    public els c;
    public jav f;
    public final iqe d = iqe.e(emb.d, 3);
    public boolean e = false;
    public boolean g = false;
    private final hst h = new emn(this);
    private final hqo i = new emo(this);

    public final int c() {
        return this.b.b("sharing_notice_display_count", 0);
    }

    public final boolean d() {
        return this.b.al("has_user_shared", false, false);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean d = d();
        printer.println("User shared gboard with others: " + d);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SharingNoticeModule";
    }

    @Override // defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        this.b = ino.M(context);
        this.h.g(gyc.b);
        this.i.e(gyc.b);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.h.h();
        this.i.f();
        hkx.b("tag_share_gboard_notice");
    }
}
