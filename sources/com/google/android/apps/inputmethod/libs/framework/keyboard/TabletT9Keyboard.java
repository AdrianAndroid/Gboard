package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TabletT9Keyboard extends Keyboard implements ddq, dfa {
    protected des a;
    protected List b;
    private final ddr c;
    private dfb d;
    private dej e;
    private View f;

    public TabletT9Keyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        ddt ddtVar = new ddt(this);
        this.c = ddtVar;
        ddtVar.b = ibmVar;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean B(CharSequence charSequence) {
        dej dejVar = this.e;
        if (dejVar != null) {
            dejVar.d(charSequence);
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        boolean K;
        if (!this.c.k(hfdVar)) {
            if (hfdVar.a != iah.UP && hfdVar.f() != null && this.d != null) {
                int i = hfdVar.f().c;
                if (i == 92) {
                    K = this.d.K();
                } else if (i == 93) {
                    K = this.d.J();
                }
                if (K) {
                    return true;
                }
            }
            return super.c(hfdVar);
        }
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            dej dejVar = this.e;
            if (dejVar != null) {
                dejVar.a();
                this.e = null;
            }
            this.f = null;
        } else if (icfVar.b != ice.BODY) {
        } else {
            this.d = null;
            this.a = null;
            this.c.h(icfVar);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            imn s = this.v.s();
            if (!this.x.h && this.e == null && s != null) {
                dej dejVar = new dej(this.u, s);
                this.e = dejVar;
                dejVar.c(softKeyboardView);
            }
            this.f = softKeyboardView.findViewById(R.id.f56120_resource_name_obfuscated_res_0x7f0b0258);
        } else if (icfVar.b == ice.BODY) {
            this.c.g(softKeyboardView, icfVar);
            des desVar = (des) softKeyboardView.findViewById(R.id.f96370_resource_name_obfuscated_res_0x7f0b141c);
            this.a = desVar;
            desVar.a(null);
            dfb dfbVar = (dfb) softKeyboardView.findViewById(R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            this.d = dfbVar;
            dfbVar.b(this);
        }
        this.c.g(softKeyboardView, icfVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // defpackage.det
    public final void gs(deu deuVar, int i) {
        fp(4096L, deuVar.H());
        fp(8192L, deuVar.I());
    }

    @Override // defpackage.dfa
    public final void gt(int i) {
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        dej dejVar = this.e;
        if (dejVar != null) {
            dejVar.a();
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(4);
        }
        super.h();
    }

    @Override // defpackage.ddq
    public final hww o() {
        return this.v.o();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        this.c.b(list, hlnVar, z);
    }

    @Override // defpackage.ddq
    public final void t(hfd hfdVar) {
        this.v.z(hfdVar);
    }

    @Override // defpackage.dfa
    public final void u(int i, float f) {
    }

    @Override // defpackage.ddq
    public final void w(int i) {
        this.v.J(i);
    }

    @Override // defpackage.ddq
    public final void x(hln hlnVar, boolean z) {
        this.v.K(hlnVar, z);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void y(List list) {
        this.b = list;
        if (this.a == null) {
            return;
        }
        if (list == null || list.isEmpty()) {
            this.a.n();
            ((View) this.a).setVisibility(4);
            return;
        }
        this.a.a(this.b);
        ((View) this.a).setVisibility(0);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void z(boolean z) {
        this.c.j(z);
    }
}
