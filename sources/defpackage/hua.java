package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* renamed from: hua  reason: default package */
/* loaded from: classes.dex */
public final class hua implements htx {
    public hte a;
    public Runnable b;
    public final Runnable c;
    final /* synthetic */ KeyboardViewHolder d;
    private Runnable e;

    public hua(KeyboardViewHolder keyboardViewHolder, final ibz ibzVar, final ice iceVar, final View view, final ibz ibzVar2, final ice iceVar2, final View view2, String str, int i, String str2, int i2, hte hteVar, final htw htwVar) {
        this.d = keyboardViewHolder;
        this.c = new Runnable() { // from class: hty
            @Override // java.lang.Runnable
            public final void run() {
                hua huaVar = hua.this;
                View view3 = view;
                ibz ibzVar3 = ibzVar;
                ice iceVar3 = iceVar;
                htw htwVar2 = htwVar;
                ibz ibzVar4 = ibzVar2;
                ice iceVar4 = iceVar2;
                View view4 = view2;
                if (view3 != null) {
                    huaVar.d.c(ibzVar3, iceVar3, view3, htwVar2);
                    huaVar.d.f(ibzVar3, iceVar3, view3, htwVar2, false);
                }
                if (htwVar2 == null) {
                    huaVar.d.b = null;
                    return;
                }
                Runnable b = huaVar.d.b(ibzVar4, iceVar4, view4, htwVar2);
                if (view3 == null) {
                    KeyboardViewHolder.e(ibzVar4, iceVar4, view4, htwVar2);
                    b.run();
                    return;
                }
                KeyboardViewHolder.e(ibzVar4, iceVar4, view4, htwVar2);
                huaVar.b = b;
                kki.j(huaVar.b);
            }
        };
        htz htzVar = new htz(this, hteVar, view, view2, str, i, str2, i2, 0);
        this.e = htzVar;
        kki.j(htzVar);
    }

    @Override // defpackage.htx
    public final void a() {
        Runnable runnable = this.e;
        if (runnable != null) {
            kki.k(runnable);
            Runnable runnable2 = this.c;
            if (runnable2 != null) {
                runnable2.run();
            }
            this.e = null;
        } else {
            hte hteVar = this.a;
            if (hteVar != null) {
                hteVar.b();
                this.a = null;
            }
        }
        Runnable runnable3 = this.b;
        if (runnable3 != null) {
            kki.k(runnable3);
            this.b.run();
            this.b = null;
        }
        this.d.b = null;
    }
}
