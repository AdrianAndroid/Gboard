package defpackage;

/* compiled from: PG */
/* renamed from: fbi  reason: default package */
/* loaded from: classes.dex */
final class fbi extends jcd {
    final /* synthetic */ fbk a;

    public fbi(fbk fbkVar) {
        this.a = fbkVar;
    }

    @Override // defpackage.jcd
    public final void a() {
        this.a.h.setVisibility(0);
        this.a.h.setAlpha(0.5f);
        this.a.h.setClickable(false);
    }

    @Override // defpackage.jcd
    public final void d() {
        this.a.h.setVisibility(0);
        this.a.h.setAlpha(1.0f);
        this.a.h.setClickable(true);
        ieh.j().e(fbm.CLEAR_BUTTON_USAGE, 0);
    }
}
