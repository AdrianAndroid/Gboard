package defpackage;

import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard;

/* compiled from: PG */
/* renamed from: bvw  reason: default package */
/* loaded from: classes.dex */
public final class bvw implements mka {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public bvw(ClipboardKeyboard clipboardKeyboard, int i, buk bukVar, int i2) {
        this.d = i2;
        this.b = clipboardKeyboard;
        this.a = i;
        this.c = bukVar;
    }

    public bvw(ClipboardKeyboard clipboardKeyboard, llp llpVar, int i, int i2) {
        this.d = i2;
        this.c = clipboardKeyboard;
        this.b = llpVar;
        this.a = i;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (this.d != 0) {
            Object obj = this.b;
            ClipboardKeyboard clipboardKeyboard = (ClipboardKeyboard) obj;
            clipboardKeyboard.H((buk) this.c, this.a);
            ((ltd) ((ltd) ((ltd) ClipboardKeyboard.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard$2", "onFailure", (char) 952, "ClipboardKeyboard.java")).t("Failed to get entity items.");
            return;
        }
        ((ltd) ((ltd) ((ltd) ClipboardKeyboard.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard$3", "onFailure", (char) 1019, "ClipboardKeyboard.java")).t("failed to insert item.");
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        if (this.d == 0) {
            Void r6 = (Void) obj;
            buk bukVar = (buk) ((llp) this.b).get(0);
            hfl hflVar = hfl.AUTOMATIC;
            if (this.a - 1 != 0) {
                if (((ClipboardKeyboard) this.c).v != null) {
                    if (!TextUtils.isEmpty(bukVar.i())) {
                        ((ClipboardKeyboard) this.c).l().e(bwa.ADD_ITEM_EVENT, 2);
                    } else if (!TextUtils.isEmpty(bukVar.j())) {
                        ((ClipboardKeyboard) this.c).l().e(bwa.ADD_ITEM_EVENT, 4);
                    }
                }
                ClipboardKeyboard clipboardKeyboard = (ClipboardKeyboard) this.c;
                clipboardKeyboard.d = (llp) this.b;
                clipboardKeyboard.o();
                return;
            }
            ClipboardKeyboard clipboardKeyboard2 = (ClipboardKeyboard) this.c;
            if (clipboardKeyboard2.v != null) {
                clipboardKeyboard2.l().e(bwa.ADD_ITEM_EVENT, 1);
                ((ClipboardKeyboard) this.c).t(12);
            }
            bvf bvfVar = ((ClipboardKeyboard) this.c).c;
            if (bvfVar == null) {
                return;
            }
            bvfVar.E(bukVar);
            return;
        }
        llp llpVar = (llp) obj;
        if (llpVar == null || llpVar.isEmpty()) {
            ((ClipboardKeyboard) this.b).H((buk) this.c, this.a);
        } else if (this.a == 1) {
            ((ClipboardKeyboard) this.b).H((buk) llpVar.get(0), this.a);
        } else {
            ((ClipboardKeyboard) this.b).I(llpVar, 2);
        }
    }
}
