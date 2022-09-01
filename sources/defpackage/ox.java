package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* renamed from: ox  reason: default package */
/* loaded from: classes2.dex */
public class ox extends Dialog implements afv, pa {
    private afq a;
    private final bek b = new bek(new od(this, 4));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(Context context, int i) {
        super(context, i);
        oll.e(context, "context");
    }

    private final void a() {
        Window window = getWindow();
        oll.b(window);
        vl.b(window.getDecorView(), this);
        Window window2 = getWindow();
        oll.b(window2);
        View decorView = window2.getDecorView();
        oll.d(decorView, "window!!.decorView");
        fw.c(decorView, this);
    }

    private final afq b() {
        afq afqVar = this.a;
        if (afqVar == null) {
            afq afqVar2 = new afq(this);
            this.a = afqVar2;
            return afqVar2;
        }
        return afqVar;
    }

    public static final void g(ox oxVar) {
        super.onBackPressed();
    }

    @Override // defpackage.afv
    public final afq I() {
        return b();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        oll.e(view, "view");
        a();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.b.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().c(afo.ON_CREATE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().c(afo.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        b().c(afo.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        oll.e(view, "view");
        a();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        oll.e(view, "view");
        a();
        super.setContentView(view, layoutParams);
    }
}
