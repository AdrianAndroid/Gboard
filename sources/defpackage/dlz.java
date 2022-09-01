package defpackage;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: dlz  reason: default package */
/* loaded from: classes.dex */
final class dlz extends hsh {
    final /* synthetic */ dma a;

    public dlz(dma dmaVar) {
        this.a = dmaVar;
    }

    @Override // defpackage.hsh
    public final void a(String str, Bundle bundle) {
        Delight5Facilitator g;
        hsk hskVar;
        dma dmaVar = this.a;
        EditorInfo editorInfo = dmaVar.c;
        if (editorInfo == null || !dmc.a(dmaVar.a, editorInfo) || (g = Delight5Facilitator.g()) == null || (hskVar = dmaVar.b) == null || hskVar.Q() == null) {
            return;
        }
        hpl Q = hskVar.Q();
        String str2 = dmaVar.c.packageName;
        if ("GET_INPUT_CONTEXT".equals(str)) {
            msr g2 = g.h.g(false);
            if (g2 == null || (g2.a & 1) == 0) {
                return;
            }
            Bundle bundle2 = new Bundle();
            iov iovVar = new iov();
            msv msvVar = g2.b;
            if (msvVar == null) {
                msvVar = msv.j;
            }
            bundle2.putByteArray("input_context", iovVar.b(msvVar));
            Q.a("GET_INPUT_CONTEXT", bundle2);
        } else if ("GET_KEYBOARD_LAYOUT".equals(str)) {
            byte[] keyboardLayout = g.h.e.a.getKeyboardLayout();
            Bundle bundle3 = new Bundle();
            bundle3.putByteArray("keyboard_layout", keyboardLayout);
            Q.a("GET_KEYBOARD_LAYOUT", bundle3);
        } else if ("GET_INPUT_ACTION".equals(str)) {
            ieh.j().e(dmb.a, str2, "GET_INPUT_ACTION", Q);
        } else {
            ((ltd) ((ltd) dmc.a.d()).k("com/google/android/apps/inputmethod/libs/keyhound/TouchDataCollector", "processCommand", 67, "TouchDataCollector.java")).w("Unknown action %s", str);
        }
    }
}
