package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SymbolsKeyboard extends Keyboard {
    private boolean a;

    public SymbolsKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        int i = f.c;
        if (i == -10027 || i == -10043 || i == 55 || i == 56) {
            this.a = true;
        }
        return super.c(hfdVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fA(icf icfVar) {
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean ft(hfd hfdVar) {
        iay f = hfdVar.f();
        if (!this.a || hfdVar.p == 2 || f == null) {
            return false;
        }
        int i = f.c;
        return i == 62 || i == 66;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER || icfVar.b == ice.FLOATING_CANDIDATES) {
            softKeyboardView.findViewById(R.id.f96390_resource_name_obfuscated_res_0x7f0b141e).setLayoutDirection(gh());
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        this.a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j, long j2) {
        super.gl(j, j2);
        if (((j ^ j2) & iby.J) != 0) {
            fx().e((j2 & iby.J) == iby.p ? R.string.f158210_resource_name_obfuscated_res_0x7f140514 : R.string.f174960_resource_name_obfuscated_res_0x7f140c3e);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void h() {
        this.a = false;
        super.h();
    }
}
