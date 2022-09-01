package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.libraries.inputmethod.keyboardmode.KeyboardSideFrame;

/* compiled from: PG */
/* renamed from: hvt  reason: default package */
/* loaded from: classes.dex */
public final class hvt {
    public static final lgb a = jdg.o(null);
    public final hwh b;
    public lgb c;
    public lgb d;
    public View e;

    public hvt(hwh hwhVar) {
        lgb lgbVar = a;
        this.c = lgbVar;
        this.d = lgbVar;
        this.b = hwhVar;
    }

    public static void a(lgb lgbVar, boolean z) {
        View view = (View) lgbVar.a();
        if (view == null) {
            return;
        }
        int i = true != z ? 8 : 0;
        if (i == view.getVisibility()) {
            return;
        }
        view.setVisibility(i);
    }

    public static KeyboardSideFrame c(View view, int i, hwj hwjVar) {
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(i);
        if (!(findViewById instanceof ViewStub)) {
            return null;
        }
        View inflate = ((ViewStub) findViewById).inflate();
        if (!(inflate instanceof KeyboardSideFrame)) {
            return null;
        }
        KeyboardSideFrame keyboardSideFrame = (KeyboardSideFrame) inflate;
        keyboardSideFrame.a = hwjVar;
        return keyboardSideFrame;
    }

    public final void b(lgb lgbVar, boolean z) {
        int i;
        View view = (View) lgbVar.a();
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z) {
            hwh hwhVar = this.b;
            if (hwhVar.C()) {
                i = hwhVar.y();
            } else {
                i = hwhVar.l;
            }
        } else {
            i = 0;
        }
        if (i == layoutParams.width) {
            return;
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }
}
