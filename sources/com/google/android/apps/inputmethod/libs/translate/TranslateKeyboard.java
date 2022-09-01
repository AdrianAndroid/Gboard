package com.google.android.apps.inputmethod.libs.translate;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TranslateKeyboard extends Keyboard implements dbo, eyx {
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/translate/TranslateKeyboard");
    public SoftKeyboardView a;
    public EditTextOnKeyboard b;
    public ezi c;
    public TextWatcher d;
    public View.OnTouchListener e;
    public String f = "";
    public boolean g;
    public TextView.OnEditorActionListener h;
    private final hhk j;

    public TranslateKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        bvl bvlVar = new bvl(this, 17);
        this.j = bvlVar;
        this.c = new ezi(context);
        ezg.d.f(bvlVar, gyc.b);
    }

    public final void A(int i2) {
        View view;
        ezi eziVar = this.c;
        eziVar.d = eyh.c(i2);
        eziVar.c();
        eziVar.b();
        if (!eyh.a(i2) || (view = eziVar.j) == null) {
            View view2 = eziVar.j;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        gqa.a(eziVar.a).h(R.string.f176750_resource_name_obfuscated_res_0x7f140cf6);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean B(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.v.z(hfd.d(new iay(-10009, null, charSequence)));
            return true;
        }
        return true;
    }

    public final void H(EditorInfo editorInfo) {
        EditTextOnKeyboard editTextOnKeyboard = this.b;
        if (editTextOnKeyboard == null || editorInfo == null) {
            return;
        }
        int inputType = editTextOnKeyboard.getInputType();
        this.b.setInputType((editorInfo.inputType & 28672) | (inputType & (-28673)));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        h();
        super.close();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        ice iceVar = icfVar.b;
        ice iceVar2 = ice.HEADER;
        if (iceVar == iceVar2) {
            this.a = null;
            ezi eziVar = this.c;
            if (icfVar.b == iceVar2) {
                eziVar.e = null;
                eziVar.f = null;
                eziVar.k = null;
                eziVar.l = null;
                eziVar.p = null;
                eziVar.m = null;
                eziVar.q = null;
                eziVar.r = null;
                eziVar.i = null;
                eziVar.j = null;
                eziVar.g = null;
                eziVar.t = null;
                eziVar.s = null;
                eziVar.h = null;
                eziVar.n = null;
                eziVar.o = null;
            }
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getString(R.string.f176840_resource_name_obfuscated_res_0x7f140cff);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        View view;
        View findViewById;
        if (icfVar.b != ice.HEADER || softKeyboardView == null) {
            return;
        }
        this.a = softKeyboardView;
        ezi eziVar = this.c;
        int gh = gh();
        if (softKeyboardView != null) {
            eziVar.e = softKeyboardView;
            eziVar.t = (FrameLayout) softKeyboardView.findViewById(R.id.f130090_resource_name_obfuscated_res_0x7f0b21bf);
            boolean booleanValue = ((Boolean) ezg.d.c()).booleanValue();
            eziVar.t.removeAllViews();
            LayoutInflater.from(eziVar.a).inflate(true != booleanValue ? R.layout.f146870_resource_name_obfuscated_res_0x7f0e05f2 : R.layout.f146880_resource_name_obfuscated_res_0x7f0e05f3, (ViewGroup) eziVar.t, true);
            eziVar.f = softKeyboardView.findViewById(R.id.f130060_resource_name_obfuscated_res_0x7f0b21bc);
            eziVar.k = (SoftKeyView) softKeyboardView.findViewById(R.id.f130250_resource_name_obfuscated_res_0x7f0b21d0);
            eziVar.l = (SoftKeyView) softKeyboardView.findViewById(R.id.f130220_resource_name_obfuscated_res_0x7f0b21cd);
            eziVar.p = (AppCompatTextView) eziVar.l.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            eziVar.m = (SoftKeyView) softKeyboardView.findViewById(R.id.f130260_resource_name_obfuscated_res_0x7f0b21d1);
            eziVar.q = (AppCompatTextView) eziVar.m.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            eziVar.g = softKeyboardView.findViewById(R.id.f130070_resource_name_obfuscated_res_0x7f0b21bd);
            eziVar.h = softKeyboardView.findViewById(R.id.f130080_resource_name_obfuscated_res_0x7f0b21be);
            eziVar.r = (AppCompatEditText) softKeyboardView.findViewById(R.id.f130160_resource_name_obfuscated_res_0x7f0b21c7);
            eziVar.i = softKeyboardView.findViewById(R.id.f130190_resource_name_obfuscated_res_0x7f0b21ca);
            eziVar.j = softKeyboardView.findViewById(R.id.f130140_resource_name_obfuscated_res_0x7f0b21c5);
            eziVar.s = softKeyboardView.findViewById(R.id.f130150_resource_name_obfuscated_res_0x7f0b21c6);
            eziVar.n = (SoftKeyView) softKeyboardView.findViewById(R.id.f130240_resource_name_obfuscated_res_0x7f0b21cf);
            eziVar.o = (SoftKeyView) softKeyboardView.findViewById(R.id.f130280_resource_name_obfuscated_res_0x7f0b21d3);
            View findViewById2 = softKeyboardView.findViewById(R.id.key_pos_translate_back);
            if (findViewById2 != null && findViewById2.getVisibility() == 0 && (findViewById = softKeyboardView.findViewById(R.id.f130100_resource_name_obfuscated_res_0x7f0b21c0)) != null) {
                findViewById.setVisibility(0);
            }
            if (((Boolean) ezg.d.c()).booleanValue() && (view = eziVar.f) != null) {
                view.addOnLayoutChangeListener(new ezh(eziVar, gh));
            }
        }
        EditTextOnKeyboard editTextOnKeyboard = (EditTextOnKeyboard) this.a.findViewById(R.id.f130160_resource_name_obfuscated_res_0x7f0b21c7);
        this.b = editTextOnKeyboard;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.setOnEditorActionListener(new een(this, 2));
        }
        EditTextOnKeyboard editTextOnKeyboard2 = this.b;
        if (editTextOnKeyboard2 != null) {
            editTextOnKeyboard2.e("noConvToQuery");
            this.f = editTextOnKeyboard2.getPrivateImeOptions();
            EditorInfo a = editTextOnKeyboard2.a();
            if (a != null) {
                a.fieldName = "translate";
            }
        }
        EditTextOnKeyboard editTextOnKeyboard3 = this.b;
        if (editTextOnKeyboard3 != null) {
            editTextOnKeyboard3.setOnTouchListener(new bph(this, 10));
        }
        l();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        EditTextOnKeyboard editTextOnKeyboard;
        super.g(editorInfo, obj);
        if (this.a == null || (editTextOnKeyboard = this.b) == null) {
            return;
        }
        editTextOnKeyboard.setActivated(true);
        ezi eziVar = this.c;
        eziVar.c = true;
        eziVar.a();
        eziVar.b();
        eziVar.c();
        l();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        EditTextOnKeyboard editTextOnKeyboard;
        TextWatcher textWatcher;
        if (this.a != null && (editTextOnKeyboard = this.b) != null) {
            editTextOnKeyboard.setText("");
            this.b.setActivated(false);
            EditTextOnKeyboard editTextOnKeyboard2 = this.b;
            if (editTextOnKeyboard2 != null && (textWatcher = this.d) != null) {
                editTextOnKeyboard2.removeTextChangedListener(textWatcher);
            }
        }
        if (this.g) {
            ab(ice.HEADER);
        }
        super.h();
    }

    public final void m() {
        w("");
    }

    @Override // defpackage.dbo
    public final hpu t(EditorInfo editorInfo) {
        EditTextOnKeyboard editTextOnKeyboard = this.b;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.setImeOptions(ham.ay(editorInfo, editTextOnKeyboard.getImeOptions()));
        }
        return this.b;
    }

    @Override // defpackage.dbo
    public final void u(CharSequence charSequence) {
        EditTextOnKeyboard editTextOnKeyboard = this.b;
        if (editTextOnKeyboard == null || charSequence == null) {
            return;
        }
        editTextOnKeyboard.setHint(charSequence);
    }

    @Override // defpackage.dbo
    public final /* synthetic */ void v(CharSequence charSequence) {
    }

    @Override // defpackage.dbp
    public final void w(String str) {
        EditTextOnKeyboard editTextOnKeyboard = this.b;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.setText(str);
        }
    }

    public final void x() {
        this.c.a();
    }

    public final void l() {
        TextWatcher textWatcher;
        EditTextOnKeyboard editTextOnKeyboard = this.b;
        if (editTextOnKeyboard == null || (textWatcher = this.d) == null) {
            ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateKeyboard", "attachQueryWatcher", 263, "TranslateKeyboard.java")).t("Failed to attach query watcher");
            return;
        }
        editTextOnKeyboard.removeTextChangedListener(textWatcher);
        this.b.addTextChangedListener(this.d);
    }
}
