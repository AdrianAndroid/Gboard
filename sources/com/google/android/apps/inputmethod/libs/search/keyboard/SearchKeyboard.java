package com.google.android.apps.inputmethod.libs.search.keyboard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class SearchKeyboard extends EditableKeyboard implements eeo {
    private final eep a;
    public final idk b;
    public guh c;
    private elj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        ieh j = ieh.j();
        this.b = j;
        eep eepVar = new eep(this);
        this.a = eepVar;
        eepVar.c(context, ibmVar, this.x);
        eepVar.c = new gsd(this, context);
    }

    protected ido A() {
        return null;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    public final void K(String str, mba mbaVar) {
        if (!str.trim().isEmpty()) {
            elj eljVar = this.j;
            if (eljVar != null) {
                eljVar.b(new eer(this, str, mbaVar, 0));
            }
            gmi gmiVar = this.i;
            if (gmiVar == null) {
                return;
            }
            gmiVar.k();
        }
    }

    protected ido L() {
        return null;
    }

    public void N(hln hlnVar) {
        ido A = A();
        if (A != null) {
            this.b.e(A, Integer.valueOf(efq.j(hlnVar.d)));
        }
    }

    public void O(hln hlnVar) {
        ido L = L();
        if (L != null) {
            this.b.e(L, Integer.valueOf(efq.j(hlnVar.d)));
        }
    }

    protected void P(List list) {
    }

    @Override // defpackage.eeo
    public final String a() {
        return S();
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fA(icf icfVar) {
        super.fA(icfVar);
        this.a.h(icfVar);
        this.j = null;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    protected final String fs() {
        return this.u.getString(R.string.f153010_resource_name_obfuscated_res_0x7f1402b8);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        this.a.g(softKeyboardView, icfVar);
        if (icfVar.b == ice.HEADER) {
            ViewGroup viewGroup = (ViewGroup) softKeyboardView.findViewById(R.id.f68020_resource_name_obfuscated_res_0x7f0b08b4);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(((LinearLayout) softKeyboardView.findViewById(R.id.f68080_resource_name_obfuscated_res_0x7f0b08ba)).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.j = new elj(viewGroup, viewGroup.getMeasuredHeight());
            EditTextOnKeyboard editTextOnKeyboard = this.e;
            if (editTextOnKeyboard == null) {
                return;
            }
            editTextOnKeyboard.e("disallowEmojiKeyboard");
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        fx().d(R.string.f174600_resource_name_obfuscated_res_0x7f140c17, new Object[0]);
        elj eljVar = this.j;
        if (eljVar != null) {
            eljVar.c(new ecr(this, 5));
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void h() {
        elj eljVar = this.j;
        if (eljVar != null) {
            eljVar.a();
        }
        super.h();
    }

    public abstract int l();

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        this.a.b(list, hlnVar, z);
        P(list);
    }
}
