package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PrimeKeyboard extends Keyboard implements ddq {
    private final ddr a;
    private View b;
    private dej c;

    public PrimeKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        ddp ddpVar = new ddp(this);
        this.a = ddpVar;
        ddpVar.c(context, ibmVar, iavVar);
    }

    private final void A() {
        dej dejVar = this.c;
        if (dejVar != null) {
            dejVar.a();
            this.c = null;
        }
    }

    private final void m(View view) {
        this.b = view.findViewById(R.id.input_area);
    }

    private final void u(View view) {
        if (this.x.h || this.c != null) {
            return;
        }
        dej dejVar = new dej(this.u, this.v.s());
        this.c = dejVar;
        dejVar.c(view);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean B(CharSequence charSequence) {
        dej dejVar = this.c;
        if (dejVar != null) {
            dejVar.d(charSequence);
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public boolean c(hfd hfdVar) {
        return this.a.k(hfdVar) || super.c(hfdVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fA(icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            A();
        } else {
            ice iceVar = icfVar.b;
            if (iceVar == ice.BODY) {
                this.b = null;
            } else if (iceVar == ice.FLOATING_CANDIDATES) {
                A();
            }
        }
        this.a.h(icfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        if (iceVar == ice.HEADER || iceVar == ice.FLOATING_CANDIDATES) {
            return this.a.l(iceVar) || am(iceVar);
        } else if (iceVar != ice.BODY) {
            return am(iceVar);
        } else {
            return this.b != null || this.a.l(iceVar) || am(iceVar);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            u(softKeyboardView);
        } else {
            ice iceVar = icfVar.b;
            if (iceVar == ice.BODY) {
                m(softKeyboardView);
            } else if (iceVar == ice.FLOATING_CANDIDATES) {
                u(softKeyboardView);
                m(softKeyboardView);
            }
        }
        this.a.g(softKeyboardView, icfVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        this.a.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j, long j2) {
        super.gl(j, j2);
        this.a.f(j, j2);
        int l = l(j, j2);
        if (l != 0) {
            fx().e(l);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        dej dejVar = this.c;
        if (dejVar != null) {
            dejVar.a();
        }
        this.a.e();
        super.h();
    }

    protected int l(long j, long j2) {
        return icu.c(j, j2);
    }

    @Override // defpackage.ddq
    public final hww o() {
        return this.v.o();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        this.a.b(list, hlnVar, z);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hsy
    public final void s(CursorAnchorInfo cursorAnchorInfo, int[] iArr) {
        Rect m = hjg.m(cursorAnchorInfo, 1);
        iArr[0] = m.left;
        iArr[1] = m.bottom;
    }

    @Override // defpackage.ddq
    public final void t(hfd hfdVar) {
        this.v.z(hfdVar);
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
    public void y(List list) {
        ((ddp) this.a).a(list);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void z(boolean z) {
        this.a.j(z);
    }
}
