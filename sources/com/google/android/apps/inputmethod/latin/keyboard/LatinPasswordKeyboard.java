package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinPasswordKeyboard extends Keyboard implements bqc {
    private final bqd a = new bqd(this);
    private bpm b;
    private boolean c;

    public LatinPasswordKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        this.b = new bpm(context, iavVar, hszVar, iavVar.e, iavVar.q.c(R.id.f55060_resource_name_obfuscated_res_0x7f0b01e3, null), iavVar.q.d(R.id.f55030_resource_name_obfuscated_res_0x7f0b01e0, true));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        Object obj;
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        if (f.c != -10127 || (obj = f.e) == null || !(obj instanceof ice) || !obj.equals(ice.HEADER) || !this.t.aj(R.string.f160920_resource_name_obfuscated_res_0x7f14067c)) {
            return super.c(hfdVar) || this.b.c(hfdVar);
        }
        this.c = true;
        gk(ice.HEADER);
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        bqd bqdVar = this.a;
        if (icfVar.b == ice.HEADER) {
            bqdVar.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        if (iceVar != ice.HEADER || !this.t.aj(R.string.f160920_resource_name_obfuscated_res_0x7f14067c) || !this.c) {
            return am(iceVar);
        }
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        bqd bqdVar = this.a;
        if (icfVar.b == ice.HEADER) {
            bqdVar.b = softKeyboardView.findViewById(R.id.key_pos_password_header_numbers);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        this.b.b(obj, X(ice.BODY));
        bqd bqdVar = this.a;
        if (bqdVar.b != null) {
            bqdVar.a.l().h(ibz.a, ice.HEADER, R.id.key_pos_password_header_numbers, bqdVar);
            bqdVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j, long j2) {
        super.gl(j, j2);
        if (((j ^ j2) & 3) != 0) {
            fx().e(icu.h(gi()) ? R.string.f148550_resource_name_obfuscated_res_0x7f1400b4 : icu.i(gi()) ? R.string.f166240_resource_name_obfuscated_res_0x7f1408c4 : R.string.f166230_resource_name_obfuscated_res_0x7f1408c3);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        super.h();
        this.b.d();
        bqd bqdVar = this.a;
        if (bqdVar.b != null) {
            bqdVar.a.l().c(ibz.a, ice.HEADER, R.id.key_pos_password_header_numbers);
            bqdVar.a.l().e(ice.HEADER, R.id.key_pos_password_header_numbers, false, false);
        }
        this.c = false;
    }

    @Override // defpackage.bqc
    public final hww l() {
        return this.v.o();
    }
}
