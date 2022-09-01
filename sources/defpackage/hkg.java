package defpackage;

/* compiled from: PG */
/* renamed from: hkg  reason: default package */
/* loaded from: classes.dex */
public final class hkg implements hfk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hkg(ede edeVar, int i) {
        this.b = i;
        this.a = edeVar;
    }

    public hkg(hkh hkhVar, int i) {
        this.b = i;
        this.a = hkhVar;
    }

    @Override // defpackage.hfk
    public final void a() {
        if (this.b != 0) {
            ((ltd) ((ltd) ede.a.d()).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessKeyboardPeer$4", "onFailure", 268, "FastAccessKeyboardPeer.java")).t("Open Emoji or Gif Extension Failed");
            return;
        }
        hkh hkhVar = (hkh) this.a;
        hkhVar.c = false;
        hkhVar.b = null;
    }

    @Override // defpackage.hfk
    public final void b() {
        if (this.b != 0) {
            ((ede) this.a).q(14);
        }
    }
}
