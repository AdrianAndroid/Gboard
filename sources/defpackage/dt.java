package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dt  reason: default package */
/* loaded from: classes.dex */
public class dt extends ox {
    private da a;
    private final yp b = new yp() { // from class: ds
        @Override // defpackage.yp
        public final boolean hE(KeyEvent keyEvent) {
            return dt.this.e(keyEvent);
        }
    };

    public dt(Context context, int i) {
        super(context, a(context, i));
        da d = d();
        ((dr) d).I = a(context, i);
        d.r();
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.f10820_resource_name_obfuscated_res_0x7f0403b6, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // defpackage.ox, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().e(view, layoutParams);
    }

    public final da d() {
        if (this.a == null) {
            this.a = da.v(this);
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return yq.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f() {
        d().t(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return d().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ox, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().f();
        super.onCreate(bundle);
        d().r();
    }

    @Override // defpackage.ox, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        d().i();
    }

    @Override // defpackage.ox, android.app.Dialog
    public void setContentView(int i) {
        d().k(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().n(getContext().getString(i));
    }

    @Override // defpackage.ox, android.app.Dialog
    public void setContentView(View view) {
        d().l(view);
    }

    @Override // defpackage.ox, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().n(charSequence);
    }
}
