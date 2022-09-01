package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: cgi  reason: default package */
/* loaded from: classes.dex */
final class cgi implements hwu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cgi(cfz cfzVar, int i) {
        this.b = i;
        this.a = cfzVar;
    }

    public cgi(cgl cglVar, int i) {
        this.b = i;
        this.a = cglVar;
    }

    public cgi(cgn cgnVar, int i) {
        this.b = i;
        this.a = cgnVar;
    }

    @Override // defpackage.hwu
    public final void b() {
        int i = this.b;
        if (i == 0) {
            ((cgl) this.a).f = null;
        } else if (i == 1) {
            ((cfz) this.a).m = null;
        } else {
            cgn cgnVar = (cgn) this.a;
            cgnVar.c = null;
            cgnVar.b = null;
            if (cgnVar.e()) {
                ((cgn) this.a).a.g(true);
            }
            ((cgn) this.a).a.c();
            cgn cgnVar2 = (cgn) this.a;
            SoftKeyView softKeyView = cgnVar2.d;
            if (softKeyView == null) {
                return;
            }
            softKeyView.g(cgnVar2.e);
            ((cgn) this.a).d = null;
        }
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void d(View view) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }

    @Override // defpackage.hwu
    public final void a(ibz ibzVar, ice iceVar, View view) {
        SoftKeyView softKeyView;
        SoftKeyView softKeyView2;
        int i = this.b;
        if (i == 0) {
            ((cgl) this.a).f = view.findViewById(R.id.key_pos_password_header_numbers);
        } else if (i == 1) {
            if (ibzVar != ibz.a) {
                return;
            }
            ((cfz) this.a).m = view.findViewById(R.id.key_pos_password_header_numbers);
        } else {
            cgn cgnVar = (cgn) this.a;
            cgnVar.c = view;
            cgnVar.b = (ViewGroup) view.findViewById(R.id.key_pos_header_action);
            cgn cgnVar2 = (cgn) this.a;
            ViewGroup viewGroup = cgnVar2.b;
            if (viewGroup != null) {
                cgnVar2.a.d(viewGroup);
            }
            cgn cgnVar3 = (cgn) this.a;
            View view2 = cgnVar3.c;
            if (view2 == null || (softKeyView = (SoftKeyView) view2.findViewById(lre.aF())) == (softKeyView2 = cgnVar3.d)) {
                return;
            }
            if (softKeyView2 != null) {
                softKeyView2.g(cgnVar3.e);
            }
            cgnVar3.d = softKeyView;
            if (softKeyView == null) {
                return;
            }
            softKeyView.f(cgnVar3.e);
            cgnVar3.d();
        }
    }
}
