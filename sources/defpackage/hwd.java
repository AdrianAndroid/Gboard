package defpackage;

import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

/* compiled from: PG */
/* renamed from: hwd  reason: default package */
/* loaded from: classes.dex */
public final class hwd implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hwd(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public hwd(hwg hwgVar, int i) {
        this.b = i;
        this.a = hwgVar;
    }

    public /* synthetic */ hwd(ifm ifmVar, int i) {
        this.b = i;
        this.a = ifmVar;
    }

    public /* synthetic */ hwd(ikv ikvVar, int i) {
        this.b = i;
        this.a = ikvVar;
    }

    public hwd(ktb ktbVar, int i) {
        this.b = i;
        this.a = ktbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ((hwg) this.a).e();
        } else if (i == 1) {
            ((hwg) this.a).w.b();
            ((hwg) this.a).B.e(hvq.KEYBOARD_RESIZE_REPOSITION_OPERATION, 3);
        } else if (i == 2) {
            Object obj = this.a;
            if (((Boolean) ifm.b.c()).booleanValue()) {
                gwd a = gwe.a();
                a.e("Typing was slower than expected");
                a.c(1031902L);
                a.d(System.currentTimeMillis());
                a.a = "kb-performance-triage@google.com";
                a.b = mhf.b(2059643L);
                a.f(true);
                ifm ifmVar = (ifm) obj;
                kcu.U(gwf.a(ifmVar.d, a.a()), new hyw(ifmVar, 5), mjl.a);
                return;
            }
            hjg.i(((ifm) obj).d);
            hkp.b("SLOWNESS_REPORTER_BANNER", false);
        } else if (i == 3) {
            ifm.a((View) this.a, false);
        } else if (i == 4) {
            ino.M(((ifm) this.a).d).f("pref_key_disable_typing_slowness_report_by_user", true);
            hkp.b("SLOWNESS_REPORTER_BANNER", false);
        } else if (i == 5) {
            AppCompatEditText appCompatEditText = ((ikv) this.a).a;
            if (appCompatEditText == null) {
                return;
            }
            appCompatEditText.requestFocus();
        } else {
            ktb ktbVar = (ktb) this.a;
            if (!ktbVar.c || !ktbVar.isShowing()) {
                return;
            }
            ktb ktbVar2 = (ktb) this.a;
            if (!ktbVar2.e) {
                TypedArray obtainStyledAttributes = ktbVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                ktbVar2.d = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                ktbVar2.e = true;
            }
            if (!ktbVar2.d) {
                return;
            }
            ((ktb) this.a).cancel();
        }
    }
}
