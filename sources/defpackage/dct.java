package defpackage;

import android.inputmethodservice.InputMethodService;
import android.os.ResultReceiver;

/* compiled from: PG */
/* renamed from: dct  reason: default package */
/* loaded from: classes.dex */
public final class dct extends InputMethodService.InputMethodImpl {
    final /* synthetic */ dcu a;
    private final lug b = lug.i("GoogleInputMethodImpl");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dct(dcu dcuVar) {
        super(dcuVar);
        this.a = dcuVar;
    }

    @Override // android.inputmethodservice.InputMethodService.InputMethodImpl, android.view.inputmethod.InputMethod
    public final void hideSoftInput(int i, ResultReceiver resultReceiver) {
        dcu.h.b("InputMethod.hideSoftInput(%d, <resultReceiver>", Integer.valueOf(i));
        if (this.a.N) {
            ((luc) ((luc) this.b.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService$GoogleInputMethodImpl", "hideSoftInput", 4431, "GoogleInputMethodService.java")).t("hideSoftInput() : Called after onDestroy()");
        } else {
            super.hideSoftInput(i, resultReceiver);
        }
    }

    @Override // android.inputmethodservice.InputMethodService.InputMethodImpl, android.view.inputmethod.InputMethod
    public final void showSoftInput(int i, ResultReceiver resultReceiver) {
        dcu.h.b("InputMethod.showSoftInput(%d, <resultReceiver>", Integer.valueOf(i));
        hsr hsrVar = this.a.aa;
        if (hsrVar.a) {
            if ((i & 1) == 1) {
                hsrVar.e++;
            } else {
                hsrVar.f++;
            }
        }
        super.showSoftInput(i, resultReceiver);
    }
}
