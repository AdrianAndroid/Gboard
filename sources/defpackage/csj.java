package defpackage;

import com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard;
import com.google.android.apps.inputmethod.libs.expression.keyboard.QueryableExpressionKeyboard;

/* compiled from: PG */
/* renamed from: csj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class csj implements hta {
    public final /* synthetic */ hta a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public csj(bvt bvtVar, hta htaVar, int i) {
        this.c = i;
        this.b = bvtVar;
        this.a = htaVar;
    }

    public /* synthetic */ csj(csi csiVar, hta htaVar, int i) {
        this.c = i;
        this.b = csiVar;
        this.a = htaVar;
    }

    public csj(ebe ebeVar, hta htaVar, int i) {
        this.c = i;
        this.b = ebeVar;
        this.a = htaVar;
    }

    public csj(edl edlVar, hta htaVar, int i) {
        this.c = i;
        this.b = edlVar;
        this.a = htaVar;
    }

    public csj(eev eevVar, hta htaVar, int i) {
        this.c = i;
        this.b = eevVar;
        this.a = htaVar;
    }

    public csj(eph ephVar, hta htaVar, int i) {
        this.c = i;
        this.b = ephVar;
        this.a = htaVar;
    }

    public /* synthetic */ csj(his hisVar, hta htaVar, int i) {
        this.c = i;
        this.b = hisVar;
        this.a = htaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [csi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bvx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [his, java.lang.Object] */
    @Override // defpackage.hta
    public final void a(ibz ibzVar, hsy hsyVar, ibm ibmVar) {
        int i = this.c;
        if (i == 0) {
            ?? r0 = this.b;
            hta htaVar = this.a;
            if (hsyVar instanceof QueryableExpressionKeyboard) {
                ((QueryableExpressionKeyboard) hsyVar).o(r0);
            }
            htaVar.a(ibzVar, hsyVar, ibmVar);
        } else if (i == 1) {
            ?? r02 = this.b;
            ((bvt) r02).d = ibzVar;
            if (hsyVar != null) {
                ((ltd) ((ltd) ClipboardKeyboard.a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard", "setDelegate", 214, "ClipboardKeyboard.java")).w("%s", r02);
                ((ClipboardKeyboard) hsyVar).b = r02;
            }
            this.a.a(ibzVar, hsyVar, ibmVar);
        } else if (i == 2) {
            ?? r03 = this.b;
            hta htaVar2 = this.a;
            int i2 = eau.h;
            r03.a(hsyVar, ibzVar);
            htaVar2.a(ibzVar, hsyVar, ibmVar);
        } else if (i == 3) {
            ((ebe) this.b).b = ibzVar;
            this.a.a(ibzVar, hsyVar, ibmVar);
        } else if (i == 4) {
            if (hsyVar != null && ibzVar != ibz.a(((edl) this.b).ac())) {
                ((ltd) edl.n.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/gif/GifExtensionImpl$1", "onKeyboardCreated", 205, "GifExtensionImpl.java")).G("the keyboard type %s should not be created by %s", ibzVar, edl.class.getName());
            }
            this.a.a(ibzVar, hsyVar, ibmVar);
        } else if (i == 5) {
            ((eev) this.b).b = ibzVar;
            this.a.a(ibzVar, hsyVar, ibmVar);
        } else {
            ((eph) this.b).a = ibzVar;
            this.a.a(ibzVar, hsyVar, ibmVar);
        }
    }
}
