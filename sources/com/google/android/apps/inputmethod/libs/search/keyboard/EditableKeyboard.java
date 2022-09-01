package com.google.android.apps.inputmethod.libs.search.keyboard;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class EditableKeyboard extends LifecycleKeyboard implements TextWatcher, dbo {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/keyboard/EditableKeyboard");
    private final boolean b;
    protected final int d;
    public EditTextOnKeyboard e;
    public View f;
    protected View g;
    public SoftKeyboardView h;
    public gmi i;

    public EditableKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        this.i = new gmi(hszVar.s());
        this.d = ibmVar.b(null, R.id.f67390_resource_name_obfuscated_res_0x7f0b0857).d;
        this.b = ((Boolean) iho.a(context).c()).booleanValue();
    }

    protected abstract String H();

    public abstract void K(String str, mba mbaVar);

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean M(int i) {
        return !this.C;
    }

    protected void R(CharSequence charSequence) {
        this.v.z(hfd.d(new iay(-30002, null, charSequence.toString())));
        View view = this.f;
        if (view != null) {
            view.setVisibility(true != TextUtils.isEmpty(S()) ? 0 : 8);
        }
    }

    public final String S() {
        EditTextOnKeyboard editTextOnKeyboard = this.e;
        Editable mo22getText = editTextOnKeyboard != null ? editTextOnKeyboard.mo22getText() : null;
        return mo22getText != null ? mo22getText.toString() : "";
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -30007) {
            return false;
        }
        EditTextOnKeyboard editTextOnKeyboard = this.e;
        if (editTextOnKeyboard == null) {
            return true;
        }
        editTextOnKeyboard.setText("");
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public void close() {
        h();
        super.close();
        this.i = null;
        this.f = null;
        this.e = null;
        this.g = null;
        this.h = null;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fA(icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            this.h = null;
            this.f = null;
            this.e = null;
            this.g = null;
            gmi gmiVar = this.i;
            if (gmiVar == null) {
                return;
            }
            gmiVar.j();
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        View view;
        if (icfVar.b == ice.HEADER) {
            ViewGroup viewGroup = (ViewGroup) softKeyboardView.findViewById(R.id.f54130_resource_name_obfuscated_res_0x7f0b0181);
            viewGroup.removeAllViews();
            View.inflate(this.u, m(), viewGroup);
            EditTextOnKeyboard editTextOnKeyboard = (EditTextOnKeyboard) viewGroup.getChildAt(0);
            this.e = editTextOnKeyboard;
            if (editTextOnKeyboard == null) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/keyboard/EditableKeyboard", "onKeyboardViewCreated", 123, "EditableKeyboard.java")).t("Editable keyboard does not contain edit text field.");
                return;
            }
            editTextOnKeyboard.setTextSize(0, this.u.getResources().getDimensionPixelSize(R.dimen.f41660_resource_name_obfuscated_res_0x7f070630));
            EditorInfo a2 = this.e.a();
            if (a2 != null) {
                a2.fieldName = H();
            }
            EditTextOnKeyboard editTextOnKeyboard2 = this.e;
            if (editTextOnKeyboard2 != null) {
                editTextOnKeyboard2.setOnEditorActionListener(new een(this, 0));
            }
            this.h = softKeyboardView;
            this.f = softKeyboardView.findViewById(R.id.key_pos_search_header_cancel);
            if (TextUtils.isEmpty(S()) && (view = this.f) != null) {
                view.setVisibility(8);
            }
            View findViewById = softKeyboardView.findViewById(R.id.f68090_resource_name_obfuscated_res_0x7f0b08bb);
            this.g = findViewById;
            if (!this.b || findViewById == null) {
                return;
            }
            findViewById.setVisibility(0);
            View findViewById2 = this.g.findViewById(R.id.f53520_resource_name_obfuscated_res_0x7f0b0126);
            if (findViewById2 == null) {
                return;
            }
            findViewById2.setOnClickListener(new edc(this, 2));
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        gmi gmiVar;
        super.g(editorInfo, obj);
        EditTextOnKeyboard editTextOnKeyboard = this.e;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.setActivated(true);
            this.e.addTextChangedListener(this);
            CharSequence mo22getText = this.e.mo22getText();
            if (mo22getText == null) {
                mo22getText = "";
            }
            R(mo22getText);
        }
        SoftKeyboardView softKeyboardView = this.h;
        if (softKeyboardView == null || (gmiVar = this.i) == null) {
            return;
        }
        gmiVar.i(this.d, softKeyboardView, new edc(this, 3, (byte[]) null));
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void h() {
        EditTextOnKeyboard editTextOnKeyboard = this.e;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.removeTextChangedListener(this);
            this.e.setText("");
            this.e.setActivated(false);
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        gmi gmiVar = this.i;
        if (gmiVar != null) {
            gmiVar.j();
        }
        super.h();
    }

    protected abstract int m();

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        R(charSequence);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void r(List list, hln hlnVar, boolean z) {
    }

    @Override // defpackage.dbo
    public final hpu t(EditorInfo editorInfo) {
        EditTextOnKeyboard editTextOnKeyboard = this.e;
        if (editTextOnKeyboard != null) {
            editTextOnKeyboard.setImeOptions(ham.ay(editorInfo, editTextOnKeyboard.getImeOptions()));
            return this.e;
        }
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/keyboard/EditableKeyboard", "getInputConnectionProvider", 289, "EditableKeyboard.java")).t("getInputConnectionProvider should be called after onKeyboardViewCreated");
        return null;
    }

    @Override // defpackage.dbo
    public final void u(CharSequence charSequence) {
        EditTextOnKeyboard editTextOnKeyboard = this.e;
        if (editTextOnKeyboard != null) {
            if (this.b) {
                charSequence = this.u.getString(R.string.f163280_resource_name_obfuscated_res_0x7f14077e);
            } else if (charSequence == null) {
                charSequence = "";
            }
            editTextOnKeyboard.setHint(charSequence);
        }
    }

    @Override // defpackage.dbo
    public final void v(CharSequence charSequence) {
        View view;
        AppCompatTextView appCompatTextView;
        if (!this.b || (view = this.g) == null || (appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f68070_resource_name_obfuscated_res_0x7f0b08b9)) == null || charSequence == null) {
            return;
        }
        appCompatTextView.setText(charSequence);
    }

    @Override // defpackage.dbp
    public final void w(String str) {
        this.v.z(hfd.d(new iay(-10009, null, str)));
    }
}
